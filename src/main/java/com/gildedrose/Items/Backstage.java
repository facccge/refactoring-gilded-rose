package com.gildedrose.Items;

import com.gildedrose.Item;

public class Backstage extends Item {
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    public Backstage(int sellIn, int quality) {
        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
            if (quality < 50) {
                if (sellIn < 11) {
                    quality = quality + 1;
                }
                if (sellIn < 6) {
                    quality = quality + 1;
                }
            }
        }
    }

    @Override
    protected void updateQualityAfterExpiration() {
        quality = 0;
    }
}
