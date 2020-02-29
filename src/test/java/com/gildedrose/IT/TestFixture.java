package com.gildedrose.IT;

import com.gildedrose.*;

public class TestFixture {
    public static Item[] getItemsFixture() {
        return new Item[]{
                new NormalItem("+5 Dexterity Vest", 10, 20),
                new AgedBrieItem(2, 0),
                new NormalItem("Elixir of the Mongoose", 5, 7),
                new SulfurasHandOfRagnarosItem(0, 80),
                new SulfurasHandOfRagnarosItem(-1, 80),
                new BackstagePassesToATAFKAL80ETCConcertItem(15, 20),
                new BackstagePassesToATAFKAL80ETCConcertItem(10, 49),
                new BackstagePassesToATAFKAL80ETCConcertItem(5, 49),
                new BackstagePassesToATAFKAL80ETCConcertItem(1, 20),
                new NormalItem("Conjured Mana Cake", 3, 6)};
    }
}
