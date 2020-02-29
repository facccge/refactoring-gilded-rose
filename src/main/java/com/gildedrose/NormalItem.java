package com.gildedrose;

public class NormalItem extends Item {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            if (getQuality() > 0) {
                setQuality(getQuality() - 1);
            }
        }
    }
}
