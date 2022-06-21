package net.xfrtrex.edu;

import net.fabricmc.api.ModInitializer;
import net.xfrtrex.edu.registry.RegisterBlocks;

public class Edu implements ModInitializer {
    public static final String MOD_ID = "edu";

    @Override
    public void onInitialize() {
        RegisterBlocks.RegisterElements();
        RegisterBlocks.RegisterBlocks();
    }
}
