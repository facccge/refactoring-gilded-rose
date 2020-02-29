package com.gildedrose.IT;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.gildedrose.IT.TestFixture.getItemsFixture;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    @Test
    public void printTestWhenDay1() {
        Item[] items = getItemsFixture();
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.update_quality();
        List<String> itemStringListWhenDay1 = Arrays.asList(items).stream().map(Item::toString).collect(Collectors.toList());

        assertEquals(Arrays.asList(
                "+5 Dexterity Vest, 9, 19",
                "Aged Brie, 1, 1",
                "Elixir of the Mongoose, 4, 6",
                "Sulfuras, Hand of Ragnaros, 0, 80",
                "Sulfuras, Hand of Ragnaros, -1, 80",
                "Backstage passes to a TAFKAL80ETC concert, 14, 21",
                "Backstage passes to a TAFKAL80ETC concert, 9, 50",
                "Backstage passes to a TAFKAL80ETC concert, 4, 50",
                "Backstage passes to a TAFKAL80ETC concert, 0, 23",
                "Conjured Mana Cake, 2, 5"
        ), itemStringListWhenDay1);
    }

    @Test
    public void printTestWhenDay2() {
        Item[] items = getItemsFixture();
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.update_quality();
        gildedRose.update_quality();
        List<String> itemStringListWhenDay2 = Arrays.asList(items).stream().map(Item::toString).collect(Collectors.toList());

        assertEquals(Arrays.asList(
                "+5 Dexterity Vest, 8, 18",
                "Aged Brie, 0, 2",
                "Elixir of the Mongoose, 3, 5",
                "Sulfuras, Hand of Ragnaros, 0, 80",
                "Sulfuras, Hand of Ragnaros, -1, 80",
                "Backstage passes to a TAFKAL80ETC concert, 13, 22",
                "Backstage passes to a TAFKAL80ETC concert, 8, 50",
                "Backstage passes to a TAFKAL80ETC concert, 3, 50",
                "Backstage passes to a TAFKAL80ETC concert, -1, 0",
                "Conjured Mana Cake, 1, 4"
        ), itemStringListWhenDay2);
    }

    @Test
    public void printTestWhenDay6() {
        Item[] items = getItemsFixture();
        GildedRose gildedRose = new GildedRose(items);
        int days = 6;
        for (int i = 0; i < days; i++) {
            gildedRose.update_quality();
        }
        List<String> itemStringListWhenDay2 = Arrays.asList(items).stream().map(Item::toString).collect(Collectors.toList());

        assertEquals(Arrays.asList(
                "+5 Dexterity Vest, 4, 14",
                "Aged Brie, -4, 10",
                "Elixir of the Mongoose, -1, 0",
                "Sulfuras, Hand of Ragnaros, 0, 80",
                "Sulfuras, Hand of Ragnaros, -1, 80",
                "Backstage passes to a TAFKAL80ETC concert, 9, 27",
                "Backstage passes to a TAFKAL80ETC concert, 4, 50",
                "Backstage passes to a TAFKAL80ETC concert, -1, 0",
                "Backstage passes to a TAFKAL80ETC concert, -5, 0",
                "Conjured Mana Cake, -3, 0"
        ), itemStringListWhenDay2);
    }

    @Test
    public void printTestWhenDay16() {
        Item[] items = getItemsFixture();
        GildedRose gildedRose = new GildedRose(items);
        int days = 16;
        for (int i = 0; i < days; i++) {
            gildedRose.update_quality();
        }
        List<String> itemStringListWhenDay2 = Arrays.asList(items).stream().map(Item::toString).collect(Collectors.toList());

        assertEquals(Arrays.asList(
                "+5 Dexterity Vest, -6, 0",
                "Aged Brie, -14, 30",
                "Elixir of the Mongoose, -11, 0",
                "Sulfuras, Hand of Ragnaros, 0, 80",
                "Sulfuras, Hand of Ragnaros, -1, 80",
                "Backstage passes to a TAFKAL80ETC concert, -1, 0",
                "Backstage passes to a TAFKAL80ETC concert, -6, 0",
                "Backstage passes to a TAFKAL80ETC concert, -11, 0",
                "Backstage passes to a TAFKAL80ETC concert, -15, 0",
                "Conjured Mana Cake, -13, 0"
        ), itemStringListWhenDay2);
    }
}
