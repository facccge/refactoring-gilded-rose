package com.gildedrose;

import java.util.Arrays;

public class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void updateItemsQuality() {
        Arrays.asList(items).stream().forEach(Item::updateItemQuality);
    }
}
