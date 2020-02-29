package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQualityTestWithNormalItem() {
        Item[] items = new Item[]{new NormalItem("foo", 1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateItemsQuality();
        assertEquals("foo", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getQuality(), is(4));
        assertThat(app.getItems()[0].getSellIn(), is(0));
    }
}
