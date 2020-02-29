package com.gildedrose;

public class GildedRose {
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateQualityForAgedBrie(int i) {
        if (items[i].getQuality() < 50) {
            items[i].setQuality(items[i].getQuality() + 1);
        }

        items[i].setSellIn(items[i].getSellIn() - 1);

        if (items[i].getSellIn() < 0) {
            if (items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
            }
        }
    }

    public void updateQualityForBackstagePassesToATAFKAL80ETCConcert(int i) {
        if (items[i].getQuality() < 50) {
            items[i].setQuality(items[i].getQuality() + 1);
            if (items[i].getSellIn() < 11) {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);
                }
            }

            if (items[i].getSellIn() < 6) {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);
                }
            }
        }

        items[i].setSellIn(items[i].getSellIn() - 1);

        if (items[i].getSellIn() < 0) {
            items[i].setQuality(items[i].getQuality() - items[i].getQuality());
        }

    }

    public void updateQualityForNormalItem(int i) {
        if (items[i].getQuality() > 0) {
            items[i].setQuality(items[i].getQuality() - 1);
        }

        items[i].setSellIn(items[i].getSellIn() - 1);

        if (items[i].getSellIn() < 0) {
            if (items[i].getQuality() > 0) {
                items[i].setQuality(items[i].getQuality() - 1);
            }
        }

    }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(AGED_BRIE)) {
                updateQualityForAgedBrie(i);
            } else if (items[i].getName().equals(BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                updateQualityForBackstagePassesToATAFKAL80ETCConcert(i);
            } else if (!items[i].getName().equals(SULFURAS_HAND_OF_RAGNAROS)) {
                updateQualityForNormalItem(i);
            }
        }
    }
}
