/*
 * MIT License
 *
 * Copyright (c) 2020 Ridanisaurus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ridanisaurus.felinium.registries;

import com.ridanisaurus.felinium.Felinium;
import com.ridanisaurus.felinium.items.ItemBase;
import com.ridanisaurus.felinium.tools.ItemTierHelper;
import com.ridanisaurus.felinium.util.Reference;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;

public class ItemHandler {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

  public static void itemInit() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

  // Ingots
  public static final RegistryObject<Item> FELINIUM_JAMINITE_INGOT = ITEMS.register("felinium_jaminite_ingot", ItemBase::new);

  // Tools
  public static final RegistryObject<SwordItem> FELINIUM_JAMINITE_SWORD = ITEMS.register("felinium_jaminite_sword", () ->
          new SwordItem(ItemTierHelper.FELINIUM_JAMINITE, 3, -2.4f, new Item.Properties().group(Felinium.TAB)));

  public static final RegistryObject<PickaxeItem> FELINIUM_JAMINITE_PICKAXE = ITEMS.register("felinium_jaminite_pickaxe", () ->
          new PickaxeItem(ItemTierHelper.FELINIUM_JAMINITE, 1, -2.8f, new Item.Properties().group(Felinium.TAB)));

  public static final RegistryObject<AxeItem> FELINIUM_JAMINITE_AXE = ITEMS.register("felinium_jaminite_axe", () ->
          new AxeItem(ItemTierHelper.FELINIUM_JAMINITE, 2.0f, -2.0f, new Item.Properties().group(Felinium.TAB)));

  public static final RegistryObject<ShovelItem> FELINIUM_JAMINITE_SHOVEL = ITEMS.register("felinium_jaminite_shovel", () ->
          new ShovelItem(ItemTierHelper.FELINIUM_JAMINITE, 1.5f, -3.0f, new Item.Properties().group(Felinium.TAB)));

  public static final RegistryObject<HoeItem> FELINIUM_JAMINITE_HOE = ITEMS.register("felinium_jaminite_hoe", () ->
          new HoeItem(ItemTierHelper.FELINIUM_JAMINITE, -10, 7.0f, new Item.Properties().group(Felinium.TAB)));

  //public static final RegistryObject<ShieldItem> FELINIUM_JAMINITE_SHIELD = ITEMS.register("felinium_jaminite_shield", () ->
          //new ShieldItem(new Item.Properties().group(Felinium.TAB).maxDamage(336)));
}