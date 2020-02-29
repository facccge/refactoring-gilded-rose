package com.gildedrose;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void toStringTest() {
        Item item = new NormalItem("foo", 1, 5);

        assertEquals("foo, 1, 5", item.toString());
    }
}
