package com.gildedrose;

public class AgedBrieItem extends Item {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItem(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    public void updateQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
        }
    }
}
