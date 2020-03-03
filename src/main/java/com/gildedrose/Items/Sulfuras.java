package com.gildedrose.Items;

import com.gildedrose.Item;

public class Sulfuras extends Item {
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
    }

    @Override
    protected void updateSellIn() {
    }

    @Override
    protected void updateQualityAfterExpiration() {
    }
}
