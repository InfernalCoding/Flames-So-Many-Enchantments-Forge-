package dev.infernal_coding.flamesenchants.enchantments.normal;

import dev.infernal_coding.flamesenchants.Registry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.inventory.EquipmentSlotType;

public class AdvancedFrostWalker extends FrostWalkerEnchantment {

    @Override
    public boolean canVillagerTrade() {
        return false;
    }

    public AdvancedFrostWalker(Rarity p_i46728_1_, EquipmentSlotType... p_i46728_2_) {
        super(p_i46728_1_, p_i46728_2_);
    }

    @Override
    public int getMinEnchantability(int p_77321_1_) {
        return (int) (super.getMinEnchantability(p_77321_1_) * 1.5);
    }

    @Override
    public int getMaxEnchantability(int p_223551_1_) {
        return (int) (super.getMaxEnchantability(p_223551_1_) * 1.5);
    }

    @Override
    public boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && ench != Enchantments.FROST_WALKER && ench != Registry.SUPREME_FROST_WALKER.get();
    }
}
