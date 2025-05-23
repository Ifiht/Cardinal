package org.evlis.cardinal.tooltrims;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.evlis.cardinal.Cardinal;

import java.util.List;

public enum SmithingTemplate {
    LINEAR(313001, Material.TERRACOTTA),
    TRACKS(313002, Material.COBBLESTONE),
    CHARGE(313003, Material.COBBLED_DEEPSLATE),
    FROST(313004, Material.SNOW_BLOCK);
    public final ItemStack item;
    public final ShapedRecipe dupeRecipe;
    private final int ModelData;
    SmithingTemplate(int modelData, Material dupeMaterial) {
        ModelData = modelData;
        ItemStack x = new ItemStack(Material.STRUCTURE_BLOCK);
        ItemMeta xMeta = x.getItemMeta();
        xMeta.setCustomModelData(modelData);
        xMeta.displayName(Component.translatable("item.tooltrims.smithing_template", Style.style(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)));
        xMeta.lore(List.of(
                Component.translatable("tool_trim_pattern.tooltrims."+this.name().toLowerCase(), Style.style(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)),
                Component.empty(),
                Component.translatable("item.tooltrims.smithing_template.applies_to", Style.style(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)),
                Component.text(" ").append(Component.translatable("item.tooltrims.smithing_template.tool_trim.applies_to", Style.style(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false))),
                Component.translatable("item.tooltrims.smithing_template.ingredients", Style.style(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)),
                Component.text(" ").append(Component.translatable("item.tooltrims.smithing_template.tool_trim.ingredients", Style.style(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)))
        ));
        x.setItemMeta(xMeta);
        this.item = x;
        dupeRecipe = new ShapedRecipe(
                new NamespacedKey(Cardinal.Instance, this.name().toLowerCase() + "_duplication_recipe"),
                item.asQuantity(2));
        dupeRecipe.shape(
                "DTD",
                "DMD",
                "DDD");
        dupeRecipe.setIngredient('T', Material.STRUCTURE_BLOCK);
        dupeRecipe.setIngredient('M', dupeMaterial);
        dupeRecipe.setIngredient('D', Material.DIAMOND);
    }
    public boolean isMyTemplate(ItemMeta meta){
        return meta.hasCustomModelData() && meta.getCustomModelData() == ModelData;
    }
}
