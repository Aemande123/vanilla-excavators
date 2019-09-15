package com.github.draylar.ve;

import com.github.draylar.ve.config.VanillaExcavatorsConfig;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;

import java.util.Optional;
import java.util.function.Supplier;

@Environment(EnvType.CLIENT)
public class ModMenuIntegration implements ModMenuApi
{
    @Override
    public String getModId()
    {
        return "vanilla-hammers";
    }

    @Override
    public Optional<Supplier<Screen>> getConfigScreen(Screen screen)
    {
        return Optional.of(AutoConfig.getConfigScreen(VanillaExcavatorsConfig.class, screen));
    }
}
