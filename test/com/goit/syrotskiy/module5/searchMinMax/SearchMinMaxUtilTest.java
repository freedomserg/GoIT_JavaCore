package com.goit.syrotskiy.module5.searchMinMax;

import org.junit.Assert;
import org.junit.Test;

public class SearchMinMaxUtilTest {

    @Test(timeout = 100)
    public void testSearchMin() throws Exception {
        int[] data = {1, -7, 55, 46, -100, 756};
        int expectedMin = data[0];
        for (int unit : data) {
            if (unit < expectedMin) {
                expectedMin = unit;
            }
        }
        Assert.assertEquals(expectedMin, SearchMinMaxUtil.searchMin(data));
    }

    @Test
    public void testSearchMax() throws Exception {
        int[] data = {1, -7, 55, 46, -100, 756};
        int expectedMax = data[0];
        for (int unit : data) {
            if (unit > expectedMax) {
                expectedMax = unit;
            }
        }
        Assert.assertEquals(expectedMax, SearchMinMaxUtil.searchMax(data));
    }
}