package de.melanx.vanillaexcavators.common;

import de.melanx.vanillaexcavators.VanillaExcavators;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Lazy;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ExcavatorMaterials implements ToolMaterial
{
    WOOD(0, 59 * VanillaExcavators.DURABILITY_MODIFIER, 2.0F / 3.5f, 0.0f, 15, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    STONE(1, 131 * VanillaExcavators.DURABILITY_MODIFIER, 4.0F / 3.5f, 0.0f, 5, () -> {
        return Ingredient.ofItems(Blocks.COBBLESTONE);
    }),
    IRON(2, 250 * VanillaExcavators.DURABILITY_MODIFIER, 6.0F / 3.5f, 0.0f, 14, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    DIAMOND(3, 1561 * VanillaExcavators.DURABILITY_MODIFIER, 8.0F / 3.5f, 0.0f, 10, () -> {
        return Ingredient.ofItems(Items.DIAMOND);
    }),
    GOLD(0, 32 * VanillaExcavators.DURABILITY_MODIFIER, 12.0F / 3.5f, 0.0f, 22, () -> {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }),
    EMERALD(3, 1028 * VanillaExcavators.DURABILITY_MODIFIER, 12.0F / 3.5f, 0.0f, 25, () -> {
        return Ingredient.ofItems(Items.EMERALD);
    }),
    OBSIDIAN(2, 2048 * VanillaExcavators.DURABILITY_MODIFIER, 5.0F / 3.5f, 0.0f, 5, () -> {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }),
    LAPIS(1, 220 * VanillaExcavators.DURABILITY_MODIFIER, 6.0f / 3.5f, 0.0f, 30, () -> {
        return Ingredient.ofItems(Items.LAPIS_LAZULI);
    }),
    QUARTZ(2, 1028 * VanillaExcavators.DURABILITY_MODIFIER, 8.0F / 3.5f, 0.0f, 10, () -> {
        return Ingredient.ofItems(Items.QUARTZ);
    }),
    FIERY(3, 750 * VanillaExcavators.DURABILITY_MODIFIER, 7.0F / 3.5f, 0f, 15, () -> {
        return Ingredient.ofItems(Items.MAGMA_BLOCK);
    }),
    PRISMARINE(3, 750 * VanillaExcavators.DURABILITY_MODIFIER, 7.0F / 3.5F, 0f, 20, () -> {
        return Ingredient.ofItems(Items.PRISMARINE_SHARD);
    }),
    ENDER(3, 1561 * VanillaExcavators.DURABILITY_MODIFIER, 10f / 3.5f, 0, 10,  () -> {
        return Ingredient.ofItems(Items.ENDER_PEARL);
    }),
    SLIME(2, 1500 * VanillaExcavators.DURABILITY_MODIFIER, 6f / 3.5f, 0, 20, () -> {
        return Ingredient.ofItems(Items.SLIME_BALL);
    }),
    POTATO(1, 500 * VanillaExcavators.DURABILITY_MODIFIER, 4.0F / 3.5f, 0.0f, 100, () -> {
        return Ingredient.ofItems(Registry.ITEM.get(new Identifier("lil-tater", "lil_tater")));
    }),
    GLOWSTONE(2, 442 * VanillaExcavators.DURABILITY_MODIFIER, 5.0F / 3.5f, 0.0f, 15, () -> {
        return Ingredient.ofItems(Registry.ITEM.get(new Identifier("netherthings", "glowstone_ingot")));
    }),
    NETHER(1, 280 * VanillaExcavators.DURABILITY_MODIFIER, 5.0F / 3.5f, 0.0f, 77, () -> {
        return Ingredient.ofItems(Registry.ITEM.get(new Identifier("netherthings", "nether_brick")));
    }),
    VIBRANIUM(3, (int) (21850d * (VanillaExcavators.DURABILITY_MODIFIER / 2.5f)), 22f / 3.5f, 0.0f, 7, () -> {
        return Ingredient.ofItems(Registry.ITEM.get(new Identifier("netherthings", "vibranium")));
    });


    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ExcavatorMaterials(int int_1, int int_2, float float_1, float float_2, int int_3, Supplier<Ingredient> supplier_1) {
        this.miningLevel = int_1;
        this.durability = int_2;
        this.blockBreakSpeed = float_1;
        this.attackDamage = float_2;
        this.enchantability = int_3;
        this.repairIngredient = new Lazy(supplier_1);
    }

    public int getDurability() {
        return this.durability;
    }

    public float getMiningSpeed() {
        return this.blockBreakSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
