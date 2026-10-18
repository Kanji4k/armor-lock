package com.example.armorlock;

import net.fabricmc.api.ClientModInitializer;

public class ArmorLock implements ClientModInitializer {
    /**
     * Heart-row count the armor bar is pinned to when you have extra hearts.
     * 1 = the normal vanilla spot (directly above the first row of hearts).
     * Set to 2 if you want it to sit above a second row instead (avoids overlap with absorption).
     */
    public static final int LOCKED_ROWS = 1;

    @Override
    public void onInitializeClient() {}
}
