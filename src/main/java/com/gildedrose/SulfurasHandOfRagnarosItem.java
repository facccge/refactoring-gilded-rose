package com.gildedrose;

public class SulfurasHandOfRagnarosItem extends Item {
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public SulfurasHandOfRagnarosItem(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        return;
    }
}
