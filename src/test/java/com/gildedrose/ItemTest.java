package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void toStringTest() {
        Item item = new Item("foo", 1, 5);

        assertEquals("foo, 1, 5", item.toString());
    }
}
