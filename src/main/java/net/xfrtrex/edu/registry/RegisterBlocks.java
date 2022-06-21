package net.xfrtrex.edu.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xfrtrex.edu.Edu;
import net.xfrtrex.edu.blocks.CompoundCreatorBlock;
import net.xfrtrex.edu.blocks.ElementBlock;

public abstract class RegisterBlocks {
    // ELEMENTS
    public static final Block ELEMENT_0 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_1 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_2 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_3 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_4 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_5 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_6 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_7 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_8 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_9 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_10 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_11 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_12 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_13 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_14 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_15 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_16 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_17 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_18 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_19 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_20 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_21 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_22 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_23 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_24 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_25 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_26 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_27 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_28 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_29 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_30 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_31 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_32 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_33 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_34 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_35 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_36 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_37 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_38 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_39 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_40 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_41 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_42 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_43 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_44 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_45 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_46 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_47 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_48 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_49 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_50 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_51 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_52 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_53 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_54 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_55 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_56 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_57 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_58 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block ELEMENT_59 = new ElementBlock(FabricBlockSettings.copyOf(Blocks.STONE));


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Edu.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Edu.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void RegisterBlocks() {
        registerBlock("compound_creator", CompoundCreatorBlock.COMPOUND_CREATOR, ItemGroup.DECORATIONS);
    }
    
    public static void RegisterElements() {
        String name = "element_";
        registerBlock(name + "0", ELEMENT_0, ItemGroup.MISC);
        registerBlock(name + "1", ELEMENT_1, ItemGroup.MISC);
        registerBlock(name + "2", ELEMENT_2, ItemGroup.MISC);
        registerBlock(name + "3", ELEMENT_3, ItemGroup.MISC);
        registerBlock(name + "4", ELEMENT_4, ItemGroup.MISC);
        registerBlock(name + "5", ELEMENT_5, ItemGroup.MISC);
        registerBlock(name + "6", ELEMENT_6, ItemGroup.MISC);
        registerBlock(name + "7", ELEMENT_7, ItemGroup.MISC);
        registerBlock(name + "8", ELEMENT_8, ItemGroup.MISC);
        registerBlock(name + "9", ELEMENT_9, ItemGroup.MISC);
        registerBlock(name + "10", ELEMENT_10, ItemGroup.MISC);
        registerBlock(name + "11", ELEMENT_11, ItemGroup.MISC);
        registerBlock(name + "12", ELEMENT_12, ItemGroup.MISC);
        registerBlock(name + "13", ELEMENT_13, ItemGroup.MISC);
        registerBlock(name + "14", ELEMENT_14, ItemGroup.MISC);
        registerBlock(name + "15", ELEMENT_15, ItemGroup.MISC);
        registerBlock(name + "16", ELEMENT_16, ItemGroup.MISC);
        registerBlock(name + "17", ELEMENT_17, ItemGroup.MISC);
        registerBlock(name + "18", ELEMENT_18, ItemGroup.MISC);
        registerBlock(name + "19", ELEMENT_19, ItemGroup.MISC);
        registerBlock(name + "20", ELEMENT_20, ItemGroup.MISC);
        registerBlock(name + "21", ELEMENT_21, ItemGroup.MISC);
        registerBlock(name + "22", ELEMENT_22, ItemGroup.MISC);
        registerBlock(name + "23", ELEMENT_23, ItemGroup.MISC);
        registerBlock(name + "24", ELEMENT_24, ItemGroup.MISC);
        registerBlock(name + "25", ELEMENT_25, ItemGroup.MISC);
        registerBlock(name + "26", ELEMENT_26, ItemGroup.MISC);
        registerBlock(name + "27", ELEMENT_27, ItemGroup.MISC);
        registerBlock(name + "28", ELEMENT_28, ItemGroup.MISC);
        registerBlock(name + "29", ELEMENT_29, ItemGroup.MISC);
        registerBlock(name + "30", ELEMENT_30, ItemGroup.MISC);
        registerBlock(name + "31", ELEMENT_31, ItemGroup.MISC);
        registerBlock(name + "32", ELEMENT_32, ItemGroup.MISC);
        registerBlock(name + "33", ELEMENT_33, ItemGroup.MISC);
        registerBlock(name + "34", ELEMENT_34, ItemGroup.MISC);
        registerBlock(name + "35", ELEMENT_35, ItemGroup.MISC);
        registerBlock(name + "36", ELEMENT_36, ItemGroup.MISC);
        registerBlock(name + "37", ELEMENT_37, ItemGroup.MISC);
        registerBlock(name + "38", ELEMENT_38, ItemGroup.MISC);
        registerBlock(name + "39", ELEMENT_39, ItemGroup.MISC);
        registerBlock(name + "40", ELEMENT_40, ItemGroup.MISC);
        registerBlock(name + "41", ELEMENT_41, ItemGroup.MISC);
        registerBlock(name + "42", ELEMENT_42, ItemGroup.MISC);
        registerBlock(name + "43", ELEMENT_43, ItemGroup.MISC);
        registerBlock(name + "44", ELEMENT_44, ItemGroup.MISC);
        registerBlock(name + "45", ELEMENT_45, ItemGroup.MISC);
        registerBlock(name + "46", ELEMENT_46, ItemGroup.MISC);
        registerBlock(name + "47", ELEMENT_47, ItemGroup.MISC);
        registerBlock(name + "48", ELEMENT_48, ItemGroup.MISC);
        registerBlock(name + "49", ELEMENT_49, ItemGroup.MISC);
        registerBlock(name + "50", ELEMENT_50, ItemGroup.MISC);
        registerBlock(name + "51", ELEMENT_51, ItemGroup.MISC);
        registerBlock(name + "52", ELEMENT_52, ItemGroup.MISC);
        registerBlock(name + "53", ELEMENT_53, ItemGroup.MISC);
        registerBlock(name + "54", ELEMENT_54, ItemGroup.MISC);
        registerBlock(name + "55", ELEMENT_55, ItemGroup.MISC);
        registerBlock(name + "56", ELEMENT_56, ItemGroup.MISC);
        registerBlock(name + "57", ELEMENT_57, ItemGroup.MISC);
        registerBlock(name + "58", ELEMENT_58, ItemGroup.MISC);
        registerBlock(name + "59", ELEMENT_59, ItemGroup.MISC);
    }
}
