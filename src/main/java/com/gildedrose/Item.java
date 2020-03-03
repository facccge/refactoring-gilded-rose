package com.gildedrose;

public class Item {
    protected String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItemQuality() {
        updateQuality();

        updateSellIn();

        if (isExpire()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected void updateQualityAfterExpiration() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpire() {
        return sellIn < 0;
    }
}
