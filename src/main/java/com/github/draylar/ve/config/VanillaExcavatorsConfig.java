package com.github.draylar.ve.config;

import me.sargunvohra.mcmods.autoconfig1.ConfigData;
import me.sargunvohra.mcmods.autoconfig1.annotation.Config;

@Config(name = "vanilla-hammers")
public class VanillaExcavatorsConfig implements ConfigData
{
    public boolean enableExtraMaterials = true;
    public boolean enableFull3x3 = false;
    public boolean fullBlockHitbox = false;
    public boolean alwaysShowSingleBlockHitbox = false;
    public boolean showSingleBlockWhenSneaking = true;
    public boolean breakSingleBlockWhenSneaking = true;
}
