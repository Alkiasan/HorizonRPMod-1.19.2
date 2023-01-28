package com.alkia.horizonrpmod.registry;

import com.alkia.horizonrpmod.HorizonRPMod;
import com.alkia.horizonrpmod.block.*;
import com.alkia.horizonrpmod.items.ModItemGroup;
import com.ibm.icu.impl.CalendarAstronomer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.alkia.horizonrpmod.HorizonRPMod.MOD_ID;

public class ModItems {
	//Items
	public static final Item LilyPlush = new Item(new Item.Settings().maxCount(1).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item Keycard = new Item(new Item.Settings().maxCount(1).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item RiCoin = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item OkaneCoin = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item DenariCoin = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item CrownCoin = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item FloppyDisk = new Item(new Item.Settings().maxCount(1).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item MortarAndPestle = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item USBStick = new Item(new Item.Settings().maxCount(1).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item Pearl = new Item(new Item.Settings().maxCount(1).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item PearlShard = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item Notepad = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item WornNotepad = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item Amulet = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item VoidEssence = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item VoidTendril = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	public static final Item VoidChunk = new Item(new Item.Settings().maxCount(64).group(ModItemGroup.Horizon).rarity(Rarity.UNCOMMON));
	//Music Discs Sound Events
	public static final SoundEvent cardinalbox = registerSoundEvent("cardinalbox");
	public static final SoundEvent crimsonbox = registerSoundEvent("crimsonbox");
	public static final SoundEvent treesmelody = registerSoundEvent("treesmelody");
	public static final SoundEvent mothersmelody = registerSoundEvent("mothersmelody");
	public static final SoundEvent leftbehind = registerSoundEvent("leftbehind");
	public static final SoundEvent crimson = registerSoundEvent("crimson");
	public static final SoundEvent thirtyminutes = registerSoundEvent("thirtyminutes");
	public static final SoundEvent library = registerSoundEvent("library");
	public static final SoundEvent scarlet = registerSoundEvent("scarlet");
	public static final SoundEvent scarlet2 = registerSoundEvent("scarlet2");
	public static final SoundEvent scarletmusicbox = registerSoundEvent("scarletmusicbox");
	public static final SoundEvent fragmentoffairytale = registerSoundEvent("fragmentoffairytale");
	public static final SoundEvent princeoffate = registerSoundEvent("princeoffate");
	public static final SoundEvent tyingstrings = registerSoundEvent("tyingstrings");
	public static final SoundEvent deniedprophecy = registerSoundEvent("deniedprophecy");
	public static final SoundEvent ladyofprophecy = registerSoundEvent("ladyofprophecy");
	public static final SoundEvent whatwebecame = registerSoundEvent("whatwebecame");
	public static final SoundEvent festival = registerSoundEvent("festival");
	public static final SoundEvent realityforplant = registerSoundEvent("realityforplant");
	public static final SoundEvent thornyandscattered = registerSoundEvent("thornyandscattered");
	public static final SoundEvent warriorofthelost = registerSoundEvent("warriorofthelost");
	public static final SoundEvent abandonedblade = registerSoundEvent("abandonedblade");
	public static final SoundEvent adaigo = registerSoundEvent("adaigo");
	public static final SoundEvent linone = registerSoundEvent("waves");
	public static final SoundEvent lintwo = registerSoundEvent("flow");
	//Music Discs
	public static final Item cardinalbox_disc = new MusicDiscItem(7, cardinalbox, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 80);
	public static final Item crimsonbox_disc = new MusicDiscItem(7, crimsonbox, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 49);
	public static final Item treesmelody_disc = new MusicDiscItem(7, treesmelody, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 129);
	public static final Item mothersmelody_disc = new MusicDiscItem(7, mothersmelody, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 209);
	public static final Item leftbehind_disc = new MusicDiscItem(7, leftbehind, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 265);
	public static final Item crimson_disc = new MusicDiscItem(7, crimson, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 276);
	public static final Item thirtyminutes_disc = new MusicDiscItem(7, thirtyminutes, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 200);
	public static final Item library_disc = new MusicDiscItem(7, library, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 255);
	public static final Item scarlet_disc = new MusicDiscItem(7, scarlet, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 356);
	public static final Item scarlet2_disc = new MusicDiscItem(7, scarlet2, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 299);
	public static final Item scarletmusicbox_disc = new MusicDiscItem(7, scarletmusicbox, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 108);
	public static final Item fragmentoffairytale_disc = new MusicDiscItem(7, fragmentoffairytale, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 238);
	public static final Item princeoffate_disc = new MusicDiscItem(7, princeoffate, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 220);
	public static final Item tyingstrings_disc = new MusicDiscItem(7, tyingstrings, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 254);
	public static final Item deniedprophecy_disc = new MusicDiscItem(7, deniedprophecy, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 283);
	public static final Item ladyofprophecy_disc = new MusicDiscItem(7, ladyofprophecy, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 270);
	public static final Item whatwebecame_disc = new MusicDiscItem(7, whatwebecame, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 148);
	public static final Item festival_disc = new MusicDiscItem(7, festival, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 201);
	public static final Item realityforplant_disc = new MusicDiscItem(7, realityforplant, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 229);
	public static final Item thornyandscattered_disc = new MusicDiscItem(7, thornyandscattered, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 150);
	public static final Item warriorofthelost_disc = new MusicDiscItem(7, warriorofthelost, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 205);
	public static final Item abandonedblade_disc = new MusicDiscItem(7, abandonedblade, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 245);
	public static final Item adaigo_disc = new MusicDiscItem(7, adaigo, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 190);
	public static final Item linone_disc = new MusicDiscItem(7, linone, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 233);
	public static final Item lintwo_disc = new MusicDiscItem(7, lintwo, new Item.Settings().maxCount(1).group(ModItemGroup.HorizonDiscs).rarity(Rarity.UNCOMMON), 261);
	//Blocks
	public static final Identifier id(String s) {
		return new Identifier("horizonrpmod", s);
	}
	public static final Block PlantCore_BLOCK = Registry.register(Registry.BLOCK, id("plant_core"), new PlantCoreBlock());
	public static final BlockItem PlantCore_ITEM = Registry.register(Registry.ITEM, id("plant_core"),
			new BlockItem(PlantCore_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block PlantMatter_BLOCK = Registry.register(Registry.BLOCK, id("plant_matter"), new PlantMatterBlock());
	public static final BlockItem PlantMatter_ITEM = Registry.register(Registry.ITEM, id("plant_matter"),
			new BlockItem(PlantMatter_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block SakuraLeaves_BLOCK = Registry.register(Registry.BLOCK, id("sakura_leaves"), new SakuraLeavesBlock());
	public static final BlockItem SakuraLeaves_ITEM = Registry.register(Registry.ITEM, id("sakura_leaves"),
			new BlockItem(SakuraLeaves_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block Nectar_BLOCK = Registry.register(Registry.BLOCK, id("nectar"), new NectarBlock());
	public static final BlockItem Nectar_ITEM = Registry.register(Registry.ITEM, id("nectar"),
			new BlockItem(Nectar_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block Voidblock_BLOCK = Registry.register(Registry.BLOCK, id("voidblock"), new VoidblockBlock());
	public static final BlockItem Voidblock_ITEM = Registry.register(Registry.ITEM, id("voidblock"),
			new BlockItem(Voidblock_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block ExplosiveVoid_BLOCK = Registry.register(Registry.BLOCK, id("explosive_void"), new ExplosiveVoidBlock());
	public static final BlockItem ExplosiveVoid_ITEM = Registry.register(Registry.ITEM, id("explosive_void"),
			new BlockItem(ExplosiveVoid_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block StaticVoidBlock_BLOCK = Registry.register(Registry.BLOCK, id("static_void"), new StaticvoidBlock());
	public static final BlockItem StaticVoidBlock_ITEM = Registry.register(Registry.ITEM, id("static_void"),
			new BlockItem(StaticVoidBlock_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block HardenedVoidBlock_BLOCK = Registry.register(Registry.BLOCK, id("hardened_void"), new HardenedVoidBlock());
	public static final BlockItem HardenedVoidBlock_ITEM = Registry.register(Registry.ITEM, id("hardened_void"),
			new BlockItem(HardenedVoidBlock_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block CrystalizedVoidBlock_BLOCK = Registry.register(Registry.BLOCK, id("crystalized_void"), new CrystalizedVoidBlock());
	public static final BlockItem CrystalizedVoidBlock_ITEM = Registry.register(Registry.ITEM, id("crystalized_void"),
			new BlockItem(CrystalizedVoidBlock_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block VoidFlower_BLOCK = Registry.register(Registry.BLOCK, id("void_flower"), new VoidFlower());
	public static final BlockItem VoidFlower_ITEM = Registry.register(Registry.ITEM, id("void_flower"),
			new BlockItem(VoidFlower_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));
	public static final Block BlueLilac_BLOCK = Registry.register(Registry.BLOCK, id("blue_lilac"), new BlueLilac());
	public static final BlockItem BlueLilac_ITEM = Registry.register(Registry.ITEM, id("blue_lilac"),
			new BlockItem(BlueLilac_BLOCK, new Item.Settings().group(ModItemGroup.Horizon)));

	//misc
	//registering sound events
	private static SoundEvent registerSoundEvent(String name){
		Identifier id = new Identifier(HorizonRPMod.MOD_ID, name);
		return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
	}
	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lilyplush"), LilyPlush);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "keycard"), Keycard);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "okane"), OkaneCoin);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "denari"), DenariCoin);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crown"), CrownCoin);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ri"), RiCoin);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "floppydisk"), FloppyDisk);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mortar_and_pestle"), MortarAndPestle);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "usbstick"), USBStick);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pearl"), Pearl);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pearl_shard"), PearlShard);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "notepad"), Notepad);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "worn_notepad"), WornNotepad);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amulet"), Amulet);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "void_essence"), VoidEssence);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "void_tendril"), VoidTendril);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "void_chunk"), VoidChunk);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_box_cardinal"), cardinalbox_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_box_owen"), crimsonbox_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "trees_melody"), treesmelody_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mothersmelody"), mothersmelody_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "leftbehind"), leftbehind_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson"), crimson_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "thirtyminutes"), thirtyminutes_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "library"), library_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarlet"), scarlet_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarlet_2"), scarlet2_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scarlet_music_box"), scarletmusicbox_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cardinalbattle"), fragmentoffairytale_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "princeoffate"), princeoffate_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tyingthe_string"), tyingstrings_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "deniedprophecy"), deniedprophecy_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ladyofprophecy"), ladyofprophecy_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "whatwebecame"), whatwebecame_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "festival"), festival_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lilymemory"), realityforplant_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "thornyandscattered"), thornyandscattered_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warriorofthelost"), warriorofthelost_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "abandonedblade"), abandonedblade_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "adaigo"), adaigo_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "waves"), linone_disc);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flow"), lintwo_disc);


	}
}
