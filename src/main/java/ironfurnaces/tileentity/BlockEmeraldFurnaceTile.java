package ironfurnaces.tileentity;

import ironfurnaces.Config;
import ironfurnaces.container.BlockEmeraldFurnaceContainer;
import ironfurnaces.init.Registration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeType;

public class BlockEmeraldFurnaceTile extends BlockIronFurnaceTileBase {
    public BlockEmeraldFurnaceTile() {
        super(Registration.EMERALD_FURNACE_TILE.get());
    }

    @Override
    protected int getCookTimeConfig()
    {
        int i = Config.emeraldFurnaceSpeed.get();
        if (this.recipeType != IRecipeType.SMELTING)
        {
            if (this.world.getRecipeManager().getRecipe((IRecipeType<AbstractCookingRecipe>)this.recipeType, this, this.world).map(AbstractCookingRecipe::getCookTime)
                    .orElse((i / 2))
                    < (i / 2))
            {
                return this.world.getRecipeManager().getRecipe((IRecipeType<AbstractCookingRecipe>)this.recipeType, this, this.world).map(AbstractCookingRecipe::getCookTime)
                        .orElse((i / 2));
            }
        }
        else if (this.world.getRecipeManager().getRecipe((IRecipeType<AbstractCookingRecipe>)this.recipeType, this, this.world).map(AbstractCookingRecipe::getCookTime)
                .orElse(i)
                < i)
        {
            return this.world.getRecipeManager().getRecipe((IRecipeType<AbstractCookingRecipe>)this.recipeType, this, this.world).map(AbstractCookingRecipe::getCookTime)
                    .orElse(i);
        }
        return i;
    }

    @Override
    public String IgetName() {
        return "container.emerald_furnace";
    }

    @Override
    public Container IcreateMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new BlockEmeraldFurnaceContainer(i, world, pos, playerInventory, playerEntity, this.fields);
    }

}
