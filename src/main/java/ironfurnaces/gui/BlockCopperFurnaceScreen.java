package ironfurnaces.gui;

import ironfurnaces.container.BlockCopperFurnaceContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockCopperFurnaceScreen extends BlockIronFurnaceScreenBase<BlockCopperFurnaceContainer> {


    public BlockCopperFurnaceScreen(BlockCopperFurnaceContainer container, Inventory inv, Component name) {
        super(container, inv, name);
    }
}
