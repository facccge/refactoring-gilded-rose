package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

public class NormalItemTest {

    @Test
    public void updateQualityWhenQualityGreaterThan0AndSellInNotLessThan1() {
        NormalItem normalItem = new NormalItem("Normal item",1, 1);
        normalItem.updateQuality();
        assertEquals("Normal item, 0, 0", normalItem.toString());
    }

    @Test
    public void updateQualityWhenQualityNotGreaterThan0AndSellInNotLessThan1() {
        NormalItem normalItem = new NormalItem("Normal item",1, 0);
        normalItem.updateQuality();
        assertEquals("Normal item, 0, 0", normalItem.toString());
    }

    @Test
    public void updateQualityWhenQualityGreaterThan0AndSellInLessThan1() {
        NormalItem normalItem = new NormalItem("Normal item",0, 1);
        normalItem.updateQuality();
        assertEquals("Normal item, -1, 0", normalItem.toString());
    }

    @Test
    public void updateQualityWhenQualityNotGreaterThan0AndSellInLessThan1() {
        NormalItem normalItem = new NormalItem("Normal item",0, 0);
        normalItem.updateQuality();
        assertEquals("Normal item, -1, 0", normalItem.toString());
    }
}
