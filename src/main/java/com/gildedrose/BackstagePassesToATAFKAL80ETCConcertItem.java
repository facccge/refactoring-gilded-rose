package com.gildedrose;

public class BackstagePassesToATAFKAL80ETCConcertItem extends Item {
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePassesToATAFKAL80ETCConcertItem(int sellIn, int quality) {
        super(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, sellIn, quality);
    }

    public void updateQuality() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
            if (getQuality() < 50) {
                if (getSellIn() < 11) {
                    setQuality(getQuality() + 1);
                }
                if (getSellIn() < 6) {
                    setQuality(getQuality() + 1);
                }
            }
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            setQuality(getQuality() - getQuality());
        }
    }
}
