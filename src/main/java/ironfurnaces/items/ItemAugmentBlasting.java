package ironfurnaces.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemAugmentBlasting extends ItemAugment {


    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent("+Halves the cooktime for blasting recipes.").func_230530_a_(Style.field_240709_b_.func_240712_a_((TextFormatting.GREEN))));
        tooltip.add(new StringTextComponent("-Only allows for blasting recipes.").func_230530_a_(Style.field_240709_b_.func_240712_a_(TextFormatting.DARK_RED)));
    }
}
