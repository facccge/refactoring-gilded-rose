package com.gildedrose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.gildedrose.AgedBrieItem.AGED_BRIE;

public class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateItemsQuality() {
        Arrays.asList(items).stream().forEach(Item::updateQuality);
    }
}
