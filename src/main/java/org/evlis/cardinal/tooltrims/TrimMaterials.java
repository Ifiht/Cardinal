package org.evlis.cardinal.tooltrims;

import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;

public enum TrimMaterials {
    AMETHYST(TextColor.color(154, 92, 198), Material.AMETHYST_SHARD),
    COPPER(TextColor.color(180, 104, 77), Material.COPPER_INGOT),
    DIAMOND(TextColor.color(110, 236, 210), Material.DIAMOND),
    EMERALD(TextColor.color(17, 160, 54), Material.EMERALD),
    GOLD(TextColor.color(222, 177, 45), Material.GOLD_INGOT),
    IRON(TextColor.color(236, 236, 236), Material.IRON_INGOT),
    LAPIS(TextColor.color(65, 110, 151), Material.LAPIS_LAZULI),
    NETHERITE(TextColor.color(98, 88, 89), Material.NETHERITE_INGOT),
    QUARTZ(TextColor.color(227, 212, 196), Material.QUARTZ),
    REDSTONE(TextColor.color(151, 22, 7), Material.REDSTONE);


    public final TextColor color;
    public  final Material material;

    private TrimMaterials(TextColor color, Material material) {
        this.color = color;
        this.material = material;
    }
}
