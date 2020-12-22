package com.shveed.reproduction.data.client;

import com.shveed.reproduction.ReproductionMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    public ItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ReproductionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("copper_block", modLoc("blocks/copper_block"));
        withExistingParent("copper_ore", modLoc("blocks/copper_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "copper_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
