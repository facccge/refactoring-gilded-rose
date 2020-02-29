package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackstagePassesToATAFKAL80ETCConcertItemTest {
    @Test
    public void updateQualityWhenQualityEquals49AndSellInNotLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(1, 49);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }

    @Test
    public void updateQualityWhenQualityLessThan49AndSellInNotLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(1, 48);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 51", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }

    @Test
    public void updateQualityWhenQualityNotLessThan50AndSellInNotLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(1, 50);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }

    @Test
    public void updateQualityWhenQualityEquals49AndSellInLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(0, 49);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }

    @Test
    public void updateQualityWhenQualityLessThan49AndSellInLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(0, 48);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }

    @Test
    public void updateQualityWhenQualityNotLessThan50AndSellInLessThan1() {
        BackstagePassesToATAFKAL80ETCConcertItem backstagePassesToATAFKAL80ETCConcertItem = new BackstagePassesToATAFKAL80ETCConcertItem(0, 50);
        backstagePassesToATAFKAL80ETCConcertItem.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstagePassesToATAFKAL80ETCConcertItem.toString());
    }
}
