package net.xfrtrex.edu.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class CompoundCreatorBlock extends CraftingTableBlock {
    private static final VoxelShape RAYCAST_SHAPE = createCuboidShape(2.0D, 4.0D, 2.0D, 14.0D, 16.0D, 14.0D);
    protected static final VoxelShape OUTLINE_SHAPE;
    private static final Text TITLE = Text.translatable("container.edu.compound_creator");

    public static CompoundCreatorBlock COMPOUND_CREATOR = new CompoundCreatorBlock(FabricBlockSettings
            .of(Material.WOOD).strength(2.5F).sounds(BlockSoundGroup.WOOD).nonOpaque()
    );


    public CompoundCreatorBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
            player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
            return ActionResult.CONSUME;
        }
    }

    @Override
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> {
            return new CraftingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos));
        }, TITLE);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return OUTLINE_SHAPE;
    }

    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return RAYCAST_SHAPE;
    }

    static {
        OUTLINE_SHAPE = VoxelShapes.combineAndSimplify(VoxelShapes.fullCube(), VoxelShapes.union(createCuboidShape(0.0D, 0.0D, 4.0D, 16.0D, 3.0D, 12.0D), new VoxelShape[]{createCuboidShape(4.0D, 0.0D, 0.0D, 12.0D, 3.0D, 16.0D), createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 3.0D, 14.0D), RAYCAST_SHAPE}), BooleanBiFunction.ONLY_FIRST);
    }
}
