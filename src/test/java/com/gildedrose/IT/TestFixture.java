package com.gildedrose.IT;

import com.gildedrose.*;
import com.gildedrose.Items.AgedBrie;
import com.gildedrose.Items.Backstage;
import com.gildedrose.Items.Sulfuras;

public class TestFixture {
    public static Item[] getItemsFixture() {
        return new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new AgedBrie(2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Sulfuras(0, 80),
                new Sulfuras(-1, 80),
                new Backstage(15, 20),
                new Backstage(10, 49),
                new Backstage(5, 49),
                new Backstage(1, 20),
                new Item("Conjured Mana Cake", 3, 6)};
    }
}
