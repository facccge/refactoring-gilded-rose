package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void updateItemQualityWhenQualityGreaterThan0AndSellInNotLessThan1() {
        Item item = new Item("Normal item",1, 1);
        item.updateItemQuality();
        assertEquals("Normal item, 0, 0", item.toString());
    }

    @Test
    public void updateItemQualityWhenQualityNotGreaterThan0AndSellInNotLessThan1() {
        Item item = new Item("Normal item",1, 0);
        item.updateItemQuality();
        assertEquals("Normal item, 0, 0", item.toString());
    }

    @Test
    public void updateItemQualityWhenQualityGreaterThan0AndSellInLessThan1() {
        Item item = new Item("Normal item",0, 1);
        item.updateItemQuality();
        assertEquals("Normal item, -1, 0", item.toString());
    }

    @Test
    public void updateItemQualityWhenQualityNotGreaterThan0AndSellInLessThan1() {
        Item item = new Item("Normal item",0, 0);
        item.updateItemQuality();
        assertEquals("Normal item, -1, 0", item.toString());
    }
}
