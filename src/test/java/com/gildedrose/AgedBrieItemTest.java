package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieItemTest {

    @Test
    public void updateQualityWhenSellInNotLessThan1AndQualityNotLessThan50() {
        AgedBrieItem agedBrieItem = new AgedBrieItem(1, 50);
        agedBrieItem.updateQuality();
        assertEquals("Aged Brie, 0, 50", agedBrieItem.toString());
    }

    @Test
    public void updateQualityWhenSellInNotLessThan1QualityLessThan50() {
        AgedBrieItem agedBrieItem = new AgedBrieItem(1, 40);
        agedBrieItem.updateQuality();
        assertEquals("Aged Brie, 0, 41", agedBrieItem.toString());
    }

    @Test
    public void updateQualityWhenSellInLessThan1AndQualityNotLessThan50() {
        AgedBrieItem agedBrieItem = new AgedBrieItem(0, 50);
        agedBrieItem.updateQuality();
        assertEquals("Aged Brie, -1, 50", agedBrieItem.toString());
    }

    @Test
    public void updateQualityWhenSellInLessThan1AndQualityLessThan50() {
        AgedBrieItem agedBrieItem = new AgedBrieItem(0, 40);
        agedBrieItem.updateQuality();
        assertEquals("Aged Brie, -1, 42", agedBrieItem.toString());
    }
}
