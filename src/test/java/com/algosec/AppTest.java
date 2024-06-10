package com.algosec;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void add() {
        Assert.assertEquals(5, new Main().add(3, 2));
    }

    @Test
    public void subtract() {
        Assert.assertEquals(1, new Main().subtract(3, 2));
    }
}
