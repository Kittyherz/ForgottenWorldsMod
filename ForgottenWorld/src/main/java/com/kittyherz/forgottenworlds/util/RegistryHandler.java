package com.kittyherz.forgottenworlds.util;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.blocks.BlockItemBase;
import com.kittyherz.forgottenworlds.blocks.ScrapMetalBlock;
import com.kittyherz.forgottenworlds.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ForgottenWorlds.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ForgottenWorlds.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register( "scrap_metal", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> SCRAP_METAL_BLOCK = BLOCKS.register("scrap_metal_block", ScrapMetalBlock::new);

    //Block Items
    public static final RegistryObject<Item> SCRAP_METAL_BLOCK_ITEM = ITEMS.register("scrap_metal_block", () -> new BlockItemBase(SCRAP_METAL_BLOCK.get()));
}
