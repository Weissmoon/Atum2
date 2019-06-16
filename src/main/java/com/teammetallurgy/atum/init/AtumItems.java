package com.teammetallurgy.atum.init;

import com.teammetallurgy.atum.api.AtumAPI;
import com.teammetallurgy.atum.blocks.wood.BlockAtumPlank;
import com.teammetallurgy.atum.items.*;
import com.teammetallurgy.atum.items.artifacts.anput.ItemAnputsHunger;
import com.teammetallurgy.atum.items.artifacts.anubis.ItemAnubisMercy;
import com.teammetallurgy.atum.items.artifacts.anubis.ItemAnubisWrath;
import com.teammetallurgy.atum.items.artifacts.atum.*;
import com.teammetallurgy.atum.items.artifacts.geb.ItemGebsGrounding;
import com.teammetallurgy.atum.items.artifacts.geb.ItemGebsMight;
import com.teammetallurgy.atum.items.artifacts.geb.ItemGebsToil;
import com.teammetallurgy.atum.items.artifacts.horus.ItemHorusAscension;
import com.teammetallurgy.atum.items.artifacts.horus.ItemHorusSoaring;
import com.teammetallurgy.atum.items.artifacts.isis.ItemIsisHealing;
import com.teammetallurgy.atum.items.artifacts.montu.ItemMontusBlast;
import com.teammetallurgy.atum.items.artifacts.montu.ItemMontusStrike;
import com.teammetallurgy.atum.items.artifacts.nuit.ItemNuitsDuality;
import com.teammetallurgy.atum.items.artifacts.nuit.ItemNuitsIre;
import com.teammetallurgy.atum.items.artifacts.nuit.ItemNuitsQuarter;
import com.teammetallurgy.atum.items.artifacts.nuit.ItemNuitsVanishing;
import com.teammetallurgy.atum.items.artifacts.ptah.ItemPtahsDecadence;
import com.teammetallurgy.atum.items.artifacts.ptah.ItemPtahsUndoing;
import com.teammetallurgy.atum.items.artifacts.ra.*;
import com.teammetallurgy.atum.items.artifacts.seth.ItemSethsSting;
import com.teammetallurgy.atum.items.artifacts.seth.ItemSethsVenom;
import com.teammetallurgy.atum.items.artifacts.shu.ItemShusBreath;
import com.teammetallurgy.atum.items.artifacts.shu.ItemShusExile;
import com.teammetallurgy.atum.items.artifacts.shu.ItemShusSwiftness;
import com.teammetallurgy.atum.items.artifacts.tefnut.ItemTefnutsBlessing;
import com.teammetallurgy.atum.items.artifacts.tefnut.ItemTefnutsCall;
import com.teammetallurgy.atum.items.artifacts.tefnut.ItemTefnutsRain;
import com.teammetallurgy.atum.items.artifacts.thoth.ItemThothsBearings;
import com.teammetallurgy.atum.items.artifacts.thoth.ItemThothsDirection;
import com.teammetallurgy.atum.items.food.*;
import com.teammetallurgy.atum.items.tools.*;
import com.teammetallurgy.atum.utils.Constants;
import com.teammetallurgy.atum.utils.OreDictHelper;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.teammetallurgy.atum.api.AtumAPI.MUMMY_ARMOR_MATERIAL;
import static com.teammetallurgy.atum.api.AtumAPI.WANDERER_ARMOR_MATERIAL;
import static com.teammetallurgy.atum.utils.AtumRegistry.registerBlock;
import static com.teammetallurgy.atum.utils.AtumRegistry.registerItem;

@GameRegistry.ObjectHolder(value = Constants.MOD_ID)
public class AtumItems {
    public static final Item DUST_BONE_STICK = new Item();
    public static final Item KHNUMITE = new Item();
    public static final Item DIRTY_COIN = new ItemCoin();
    public static final Item GOLD_COIN = new ItemCoin();
    public static final Item EFREET_HEART = new Item();
    public static final Item SCARAB = new ItemScarab();
    public static final Item IDOL_OF_LABOR = new ItemIdolOfLabor();
    public static final Item FERTILE_SOIL_PILE = new Item();
    public static final Item SHORT_BOW = new ItemBaseBow();
    public static final Item LIMESTONE_SHOVEL = new ItemLimestoneShovel();
    public static final Item LIMESTONE_PICKAXE = new ItemLimestonePickaxe();
    public static final Item LIMESTONE_AXE = new ItemLimestoneAxe();
    public static final Item LIMESTONE_SWORD = new ItemLimestoneSword();
    public static final Item LIMESTONE_HOE = new ItemLimestoneHoe();
    public static final Item DAGGER_IRON = new ItemDagger(ToolMaterial.IRON);
    public static final Item POISON_DAGGER = new ItemDaggerPoison();
    public static final Item SCIMITAR_IRON = new ItemSword(ToolMaterial.IRON);
    public static final Item GREATSWORD_IRON = new ItemGreatsword(ToolMaterial.IRON);
    public static final Item CLUB_IRON = new ItemClub(ToolMaterial.IRON);
    public static final Item KHOPESH_IRON = new ItemKhopesh(ToolMaterial.IRON);
    public static final Item STONEGUARD_SWORD = new ItemSword(AtumAPI.KHNUMITE);
    public static final Item STONEGUARD_GREATSWORD = new ItemGreatsword(AtumAPI.KHNUMITE);
    public static final Item STONEGUARD_CLUB = new ItemClub(AtumAPI.KHNUMITE);
    public static final Item STONEGUARD_KHOPESH = new ItemKhopesh(AtumAPI.KHNUMITE);
    public static final Item STONEGUARD_SHIELD = new ItemAtumShield().setRepairItem(KHNUMITE).setMaxDamage(90);
    public static final Item BRIGAND_SHIELD = new ItemAtumShield().setRepairItem(Items.IRON_INGOT).setMaxDamage(150);
    public static final Item EYES_OF_ATUM = new ItemEyesOfAtum();
    public static final Item BODY_OF_ATUM = new ItemBodyOfAtum();
    public static final Item LEGS_OF_ATUM = new ItemLegsOfAtum();
    public static final Item FEET_OF_ATUM = new ItemFeetOfAtum();
    public static final Item ATUMS_WILL = new ItemAtumsWill();
    public static final Item ATUMS_PROTECTION = new ItemAtumsProtection();
    public static final Item ATUMS_BOUNTY = new ItemAtumsBounty();
    public static final Item ATUMS_HOMECOMING = new ItemAtumsHomecoming();
    public static final Item HALO_OF_RA = new ItemHaloOfRa();
    public static final Item BODY_OF_RA = new ItemBodyOfRa();
    public static final Item LEGS_OF_RA = new ItemLegsOfRa();
    public static final Item FEET_OF_RA = new ItemFeetOfRa();
    public static final Item RAS_FURY = new ItemRasFury();
    public static final Item PTAHS_DECADENCE = new ItemPtahsDecadence();
    public static final Item PTAHS_UNDOING = new ItemPtahsUndoing();
    public static final Item GEBS_TOIL = new ItemGebsToil();
    public static final Item GEBS_GROUNDING = new ItemGebsGrounding();
    public static final Item GEBS_MIGHT = new ItemGebsMight();
    public static final Item TEFNUTS_RAIN = new ItemTefnutsRain();
    public static final Item TEFNUTS_CALL = new ItemTefnutsCall();
    public static final Item TEFNUTS_BLESSING = new ItemTefnutsBlessing();
    public static final Item SHUS_BREATH = new ItemShusBreath();
    public static final Item SHUS_EXILE = new ItemShusExile();
    public static final Item SHUS_SWIFTNESS = new ItemShusSwiftness();
    public static final Item HORUSS_SOARING = new ItemHorusSoaring();
    public static final Item HORUSS_ASCENSION = new ItemHorusAscension();
    public static final Item SETHS_STING = new ItemSethsSting();
    public static final Item SETHS_VENOM = new ItemSethsVenom();
    public static final Item ISIS_HEALING = new ItemIsisHealing();
    public static final Item MONTUS_BLAST = new ItemMontusBlast();
    public static final Item MONTUS_STRIKE = new ItemMontusStrike();
    public static final ItemThothsBearings THOTHS_BEARINGS = new ItemThothsBearings();
    public static final Item THOTHS_DIRECTION = new ItemThothsDirection();
    public static final Item ANUBIS_MERCY = new ItemAnubisMercy();
    public static final Item ANUBIS_WRATH = new ItemAnubisWrath();
    public static final Item NUITS_VANISHING = new ItemNuitsVanishing();
    public static final Item NUITS_DUALITY = new ItemNuitsDuality();
    public static final Item NUITS_IRE = new ItemNuitsIre();
    public static final Item NUITS_QUARTER = new ItemNuitsQuarter();
    public static final Item ANPUTS_HUNGER = new ItemAnputsHunger();
    public static final Item MUMMY_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, "mummy_armor_1", EntityEquipmentSlot.HEAD).setRepairItem(AtumItems.SCRAP);
    public static final Item MUMMY_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, "mummy_armor_1", EntityEquipmentSlot.CHEST).setRepairItem(AtumItems.SCRAP);
    public static final Item MUMMY_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, "mummy_armor_2", EntityEquipmentSlot.LEGS).setRepairItem(AtumItems.SCRAP);
    public static final Item MUMMY_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, "mummy_armor_1", EntityEquipmentSlot.FEET).setRepairItem(AtumItems.SCRAP);
    public static final Item WANDERER_HELMET = new ItemTexturedArmor(WANDERER_ARMOR_MATERIAL, "wanderer_armor_1", EntityEquipmentSlot.HEAD).setRepairItem(AtumItems.LINEN_CLOTH).setDyeable();
    public static final Item WANDERER_CHEST = new ItemTexturedArmor(WANDERER_ARMOR_MATERIAL, "wanderer_armor_1", EntityEquipmentSlot.CHEST).setRepairItem(AtumItems.LINEN_CLOTH).setDyeable();
    public static final Item WANDERER_LEGS = new ItemTexturedArmor(WANDERER_ARMOR_MATERIAL, "wanderer_armor_2", EntityEquipmentSlot.LEGS).setRepairItem(AtumItems.LINEN_CLOTH).setDyeable();
    public static final Item WANDERER_BOOTS = new ItemTexturedArmor(WANDERER_ARMOR_MATERIAL, "wanderer_armor_1", EntityEquipmentSlot.FEET).setRepairItem(AtumItems.LINEN_CLOTH).setDyeable();
    public static final Item DESERT_HELMET_IRON = new ItemTexturedArmor(ArmorMaterial.IRON, "desert_iron_armor_1", EntityEquipmentSlot.HEAD).setRepairItem(Items.IRON_INGOT).setDamageModifier(10).setDyeable();
    public static final Item DESERT_CHEST_IRON = new ItemTexturedArmor(ArmorMaterial.IRON, "desert_iron_armor_1", EntityEquipmentSlot.CHEST).setRepairItem(Items.IRON_INGOT).setDamageModifier(10).setDyeable();
    public static final Item DESERT_LEGS_IRON = new ItemTexturedArmor(ArmorMaterial.IRON, "desert_iron_armor_2", EntityEquipmentSlot.LEGS).setRepairItem(Items.IRON_INGOT).setDamageModifier(10).setDyeable();
    public static final Item DESERT_BOOTS_IRON = new ItemTexturedArmor(ArmorMaterial.IRON, "desert_iron_armor_1", EntityEquipmentSlot.FEET).setRepairItem(Items.IRON_INGOT).setDamageModifier(10).setDyeable();
    public static final Item DESERT_HELMET_GOLD = new ItemTexturedArmor(ArmorMaterial.GOLD, "desert_gold_armor_1", EntityEquipmentSlot.HEAD).setRepairItem(Items.GOLD_INGOT).setDamageModifier(20).setDyeable();
    public static final Item DESERT_CHEST_GOLD = new ItemTexturedArmor(ArmorMaterial.GOLD, "desert_gold_armor_1", EntityEquipmentSlot.CHEST).setRepairItem(Items.GOLD_INGOT).setDamageModifier(20).setDyeable();
    public static final Item DESERT_LEGS_GOLD = new ItemTexturedArmor(ArmorMaterial.GOLD, "desert_gold_armor_2", EntityEquipmentSlot.LEGS).setRepairItem(Items.GOLD_INGOT).setDamageModifier(20).setDyeable();
    public static final Item DESERT_BOOTS_GOLD = new ItemTexturedArmor(ArmorMaterial.GOLD, "desert_gold_armor_1", EntityEquipmentSlot.FEET).setRepairItem(Items.GOLD_INGOT).setDamageModifier(20).setDyeable();
    public static final Item DESERT_HELMET_DIAMOND = new ItemTexturedArmor(ArmorMaterial.DIAMOND, "desert_diamond_armor_1", EntityEquipmentSlot.HEAD).setRepairItem(Items.DIAMOND).setDamageModifier(15).setDyeable();
    public static final Item DESERT_CHEST_DIAMOND = new ItemTexturedArmor(ArmorMaterial.DIAMOND, "desert_diamond_armor_1", EntityEquipmentSlot.CHEST).setRepairItem(Items.DIAMOND).setDamageModifier(15).setDyeable();
    public static final Item DESERT_LEGS_DIAMOND = new ItemTexturedArmor(ArmorMaterial.DIAMOND, "desert_diamond_armor_2", EntityEquipmentSlot.LEGS).setRepairItem(Items.DIAMOND).setDamageModifier(15).setDyeable();
    public static final Item DESERT_BOOTS_DIAMOND = new ItemTexturedArmor(ArmorMaterial.DIAMOND, "desert_diamond_armor_1", EntityEquipmentSlot.FEET).setRepairItem(Items.DIAMOND).setDamageModifier(15).setDyeable();
    public static final Item PAPYRUS_PLANT = new ItemBlockSpecial(AtumBlocks.PAPYRUS);
    public static final Item DESERT_WOLF_IRON_ARMOR = new Item().setMaxStackSize(1);
    public static final Item DESERT_WOLF_GOLD_ARMOR = new Item().setMaxStackSize(1);
    public static final Item DESERT_WOLF_DIAMOND_ARMOR = new Item().setMaxStackSize(1);
    public static final Item CAMEL_IRON_ARMOR = new Item().setMaxStackSize(1);
    public static final Item CAMEL_GOLD_ARMOR = new Item().setMaxStackSize(1);
    public static final Item CAMEL_DIAMOND_ARMOR = new Item().setMaxStackSize(1);
    public static final Item GRAVEROBBERS_MAP = new ItemGraverobbersMap();
    public static final Item DISENCHANTING_SCROLL = new Item();
    public static final Item SCROLL = new Item();
    public static final Item SCRAP = new Item();
    public static final Item LINEN_BANDAGE = new ItemLinenBandage();
    public static final Item LINEN_THREAD = new Item();
    public static final Item LINEN_CLOTH = new Item();
    public static final Item DYE_BLACK = new ItemDye();
    public static final Item DYE_BROWN = new ItemDye();
    public static final Item FLAX_SEEDS = new ItemAtumSeeds(AtumBlocks.FLAX, Blocks.FARMLAND);
    public static final Item FLAX = new Item();
    public static final Item OPHIDIAN_TONGUE_FLOWER = new Item();
    public static final Item EMMER_SEEDS = new ItemAtumSeeds(AtumBlocks.EMMER_WHEAT, Blocks.FARMLAND);
    public static final Item ANPUTS_FINGERS_SPORES = new ItemAtumSeeds(AtumBlocks.ANPUTS_FINGERS, AtumBlocks.SAND);
    public static final Item EMMER = new Item();
    public static final Item EMMER_FLOUR = new ItemEmmerFlour();
    public static final Item EMMER_DOUGH = new Item();
    public static final Item EMMER_BREAD = new ItemFood(4, 0.9F, false);
    public static final Item CAMEL_RAW = new ItemFood(3, 0.2F, true);
    public static final Item CAMEL_COOKED = new ItemFood(9, 0.7F, true);
    public static final Item DATE = new ItemFood(4, 0.3F, false);
    public static final Item GLISTERING_DATE = new Item();
    public static final Item GOLDEN_DATE = new ItemDateGold(5, 1.5F, false).setAlwaysEdible();
    public static final Item ENCHANTED_GOLDEN_DATE = new ItemDateGoldEnchanted(5, 1.5F, false).setAlwaysEdible();
    public static final Item ECTOPLASM = new Item();
    public static final Item MANDIBLES = new Item();
    public static final Item DUSTY_BONE = new Item();
    public static final Item WOLF_PELT = new Item();
    public static final Item FORSAKEN_FISH = new ItemFish(ItemFish.FishType.FORSAKEN);
    public static final Item MUMMIFIED_FISH = new ItemFish(ItemFish.FishType.MUMMIFIED);
    public static final Item JEWELED_FISH = new ItemFish(ItemFish.FishType.JEWELED);
    public static final Item SKELETAL_FISH = new ItemFish(ItemFish.FishType.SKELETAL);
    public static final Item CRUNCHY_SCARAB = new ItemCrunchyScarab(3, 0.1F);
    public static final Item CRUNCHY_GOLD_SCARAB = new ItemCrunchyScarab(6, 1.2F);

    public static void registerItems() {
        BlockAtumPlank.registerSticks();
        registerItem(DUST_BONE_STICK, "dusty_bone_stick");
        registerItem(KHNUMITE, "khnumite");
        registerItem(DIRTY_COIN, "coin_dirty");
        registerItem(GOLD_COIN, "coin_gold");
        ItemLoot.createLootItems();
        registerItem(EFREET_HEART, "efreet_heart");
        registerItem(SCARAB, "scarab");
        registerItem(IDOL_OF_LABOR, "idol_of_labor");
        registerBlock(AtumBlocks.HEART_OF_RA, "heart_of_ra");
        registerItem(SHORT_BOW, "short_bow");
        registerItem(LIMESTONE_SHOVEL, "limestone_shovel");
        registerItem(LIMESTONE_PICKAXE, "limestone_pickaxe");
        registerItem(LIMESTONE_AXE, "limestone_axe");
        registerItem(LIMESTONE_SWORD, "limestone_sword");
        registerItem(LIMESTONE_HOE, "limestone_hoe");
        registerItem(DAGGER_IRON, "iron_dagger");
        registerItem(POISON_DAGGER, "dagger_poison");
        registerItem(SCIMITAR_IRON, "iron_scimitar");
        registerItem(GREATSWORD_IRON, "iron_greatsword");
        registerItem(CLUB_IRON, "iron_club");
        registerItem(KHOPESH_IRON, "iron_khopesh");
        registerItem(STONEGUARD_SWORD, "stoneguard_sword");
        registerItem(STONEGUARD_GREATSWORD, "stoneguard_greatsword");
        registerItem(STONEGUARD_CLUB, "stoneguard_club");
        registerItem(STONEGUARD_KHOPESH, "stoneguard_khopesh");
        registerItem(STONEGUARD_SHIELD, "stoneguard_shield");
        registerItem(BRIGAND_SHIELD, "brigand_shield");
        ItemScepter.registerScepters();
        registerItem(EYES_OF_ATUM, "eyes_of_atum");
        registerItem(BODY_OF_ATUM, "body_of_atum");
        registerItem(LEGS_OF_ATUM, "legs_of_atum");
        registerItem(FEET_OF_ATUM, "feet_of_atum");
        registerItem(ATUMS_WILL, "atums_will");
        registerItem(ATUMS_PROTECTION, "atums_protection");
        registerItem(ATUMS_BOUNTY, "atums_bounty");
        registerItem(ATUMS_HOMECOMING, "atums_homecoming");
        registerItem(HALO_OF_RA, "halo_of_ra");
        registerItem(BODY_OF_RA, "body_of_ra");
        registerItem(LEGS_OF_RA, "legs_of_ra");
        registerItem(FEET_OF_RA, "feet_of_ra");
        registerItem(RAS_FURY, "ras_fury");
        registerItem(PTAHS_DECADENCE, "ptahs_decadence");
        registerItem(PTAHS_UNDOING, "ptahs_undoing");
        registerItem(GEBS_TOIL, "gebs_toil");
        registerItem(GEBS_GROUNDING, "gebs_grounding");
        registerItem(GEBS_MIGHT, "gebs_might");
        registerItem(TEFNUTS_RAIN, "tefnuts_rain");
        registerItem(TEFNUTS_CALL, "tefnuts_call");
        registerItem(TEFNUTS_BLESSING, "tefnuts_blessing");
        registerItem(SHUS_BREATH, "shus_breath");
        registerItem(SHUS_EXILE, "shus_exile");
        registerItem(SHUS_SWIFTNESS, "shus_swiftness");
        registerItem(HORUSS_SOARING, "horuss_soaring");
        registerItem(HORUSS_ASCENSION, "horuss_ascension");
        registerItem(SETHS_STING, "seths_sting");
        registerItem(SETHS_VENOM, "seths_venom");
        registerItem(ISIS_HEALING, "isis_healing");
        registerItem(MONTUS_BLAST, "montus_blast");
        registerItem(MONTUS_STRIKE, "montus_strike");
        //registerItem(THOTHS_BEARINGS, "thoths_bearings");
        //registerItem(THOTHS_DIRECTION, "thoths_direction");
        registerItem(ANUBIS_MERCY, "anubiss_mercy");
        registerItem(ANUBIS_WRATH, "anubiss_wrath");
        registerItem(NUITS_VANISHING, "nuits_vanishing");
        registerItem(NUITS_DUALITY, "nuits_duality");
        registerItem(NUITS_IRE, "nuits_ire");
        registerItem(NUITS_QUARTER, "nuits_quarter");
        registerItem(ANPUTS_HUNGER, "anputs_hunger");
        registerItem(MUMMY_HELMET, "mummy_helmet");
        registerItem(MUMMY_CHEST, "mummy_chest");
        registerItem(MUMMY_LEGS, "mummy_legs");
        registerItem(MUMMY_BOOTS, "mummy_boots");
        registerItem(WANDERER_HELMET, "wanderer_helmet");
        registerItem(WANDERER_CHEST, "wanderer_chest");
        registerItem(WANDERER_LEGS, "wanderer_legs");
        registerItem(WANDERER_BOOTS, "wanderer_boots");
        registerItem(DESERT_HELMET_IRON, "desert_helmet_iron");
        registerItem(DESERT_CHEST_IRON, "desert_chest_iron");
        registerItem(DESERT_LEGS_IRON, "desert_legs_iron");
        registerItem(DESERT_BOOTS_IRON, "desert_boots_iron");
        registerItem(DESERT_HELMET_GOLD, "desert_helmet_gold");
        registerItem(DESERT_CHEST_GOLD, "desert_chest_gold");
        registerItem(DESERT_LEGS_GOLD, "desert_legs_gold");
        registerItem(DESERT_BOOTS_GOLD, "desert_boots_gold");
        registerItem(DESERT_HELMET_DIAMOND, "desert_helmet_diamond");
        registerItem(DESERT_CHEST_DIAMOND, "desert_chest_diamond");
        registerItem(DESERT_LEGS_DIAMOND, "desert_legs_diamond");
        registerItem(DESERT_BOOTS_DIAMOND, "desert_boots_diamond");
        registerItem(PAPYRUS_PLANT, "papyrus_plant");
        registerItem(DESERT_WOLF_IRON_ARMOR, "desert_wolf_iron_armor");
        registerItem(DESERT_WOLF_GOLD_ARMOR, "desert_wolf_gold_armor");
        registerItem(DESERT_WOLF_DIAMOND_ARMOR, "desert_wolf_diamond_armor");
        registerItem(CAMEL_IRON_ARMOR, "camel_iron_armor");
        registerItem(CAMEL_GOLD_ARMOR, "camel_gold_armor");
        registerItem(CAMEL_DIAMOND_ARMOR, "camel_diamond_armor");
        registerItem(GRAVEROBBERS_MAP, "graverobbers_map");
        registerItem(DISENCHANTING_SCROLL, "disenchanting_scroll");
        registerItem(SCROLL, "scroll");
        registerItem(SCRAP, "cloth_scrap");
        registerItem(LINEN_BANDAGE, "linen_bandage");
        registerItem(LINEN_THREAD, "linen_thread");
        registerItem(LINEN_CLOTH, "linen_cloth");
        registerItem(DYE_BLACK, "dye_black");
        registerItem(DYE_BROWN, "dye_brown");
        registerItem(FLAX_SEEDS, "flax_seeds");
        registerItem(FLAX, "flax");
        registerItem(OPHIDIAN_TONGUE_FLOWER, "ophidian_tongue_flower");
        registerItem(EMMER_SEEDS, "emmer_seeds");
        registerItem(EMMER, "emmer");
        registerItem(EMMER_FLOUR, "emmer_flour");
        registerItem(EMMER_DOUGH, "emmer_dough");
        registerItem(EMMER_BREAD, "emmer_bread");
        registerItem(CAMEL_RAW, "camel_raw");
        registerItem(CAMEL_COOKED, "camel_cooked");
        registerItem(DATE, "date");
        registerItem(GLISTERING_DATE, "glistering_date");
        registerItem(GOLDEN_DATE, "golden_date");
        registerItem(ENCHANTED_GOLDEN_DATE, "golden_date_enchanted");
        registerItem(ECTOPLASM, "ectoplasm");
        registerItem(MANDIBLES, "mandibles");
        registerItem(DUSTY_BONE, "dusty_bone", "bone");
        registerItem(WOLF_PELT, "wolf_pelt");
        registerItem(FERTILE_SOIL_PILE, "fertile_soil_pile");
        registerItem(ANPUTS_FINGERS_SPORES, "anputs_fingers_spores");
        registerItem(FORSAKEN_FISH, "fish_forsaken");
        registerItem(MUMMIFIED_FISH, "fish_mummified");
        registerItem(JEWELED_FISH, "fish_jeweled");
        registerItem(SKELETAL_FISH, "fish_skeletal");
        registerItem(CRUNCHY_SCARAB, "crunchy_scarab");
        registerItem(CRUNCHY_GOLD_SCARAB, "crunchy_golden_scarab");
    }

    public static void setItemInfo() {
        OreDictHelper.add(Items.BLAZE_ROD, "rodBlaze");
        OreDictHelper.add(Items.BLAZE_POWDER, "dustBlaze");
        OreDictHelper.add(DYE_BLACK, "dyeBlack");
        OreDictHelper.add(DYE_BROWN, "dyeBrown");
        OreDictHelper.add(DUST_BONE_STICK, "stickWood");
        OreDictHelper.add(EFREET_HEART, "rodBlaze");
        OreDictHelper.add(ANPUTS_FINGERS_SPORES, "cropNetherWart");
        OreDictHelper.add(LINEN_THREAD, "string");
        OreDictHelper.add(SCROLL, "paper");
        OreDictHelper.add(FLAX, "cropFlax");
        OreDictHelper.add(FLAX_SEEDS, "seed");
        OreDictHelper.add(FLAX_SEEDS, "seedFlax");
        OreDictHelper.add(EMMER, "cropEmmer");
        OreDictHelper.add(EMMER_DOUGH, "foodDough");
        OreDictHelper.add(EMMER_SEEDS, "seed");
        OreDictHelper.add(EMMER_SEEDS, "seedEmmer");
        OreDictHelper.add(EMMER_BREAD, "foodBread", "bread");
        OreDictHelper.add(KHNUMITE, "ingotKhnumite");

        MinecraftForge.EVENT_BUS.register(GEBS_MIGHT);
    }
}