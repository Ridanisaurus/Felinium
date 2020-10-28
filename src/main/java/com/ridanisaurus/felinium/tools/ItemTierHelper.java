package com.ridanisaurus.felinium.tools;

import com.ridanisaurus.felinium.registries.ItemHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ItemTierHelper implements IItemTier {
  // 1 + Base Damage (3) + Added Damage (2)
  FELINIUM_JAMINITE(3, 3000, 21.0f, 11.0f, 42, () -> { return Ingredient.fromItems(ItemHandler.FELINIUM_JAMINITE_INGOT.get()); });

  private final int harvestLevel;
  private final int maxUses;
  private final float efficiency;
  private final float attackDamage;
  private final int enchantability;
  private final Supplier<Ingredient> repairMaterial;

  ItemTierHelper(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
    this.harvestLevel = harvestLevel;
    this.maxUses = maxUses;
    this.efficiency = efficiency;
    this.attackDamage = attackDamage;
    this.enchantability =enchantability;
    this.repairMaterial = repairMaterial;
  }


  @Override
  public int getMaxUses() {
    return maxUses;
  }

  @Override
  public float getEfficiency() {
    return efficiency;
  }

  @Override
  public float getAttackDamage() {
    return attackDamage;
  }

  @Override
  public int getHarvestLevel() {
    return harvestLevel;
  }

  @Override
  public int getEnchantability() {
    return enchantability;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return repairMaterial.get();
  }
}
