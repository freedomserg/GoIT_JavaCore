package com.goit.syrotskiy.module5.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortUtilTest {

    @Test(timeout = 100)
    public void arbitraryDataBubbleSort() throws Exception {
        int[] actualArray = {-5, 7, -13, 45, -100, 61};
        int[] expectedArray = {-100, -13, -5, 7, 45, 61};
        BubbleSortUtil.bubbleSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void sortedInDescendingOrderDataBubbleSort() throws Exception {
        int[] actualArray = {25, 19, 16, 12, -10, -18};
        int[] expectedArray = {-18, -10, 12, 16, 19, 25};
        BubbleSortUtil.bubbleSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void identicalValuesDataBubbleSort() throws Exception {
        int[] actualArray = {25, 19, 19, 12, 12, -18};
        int[] expectedArray = {-18, 12, 12, 19, 19, 25};
        BubbleSortUtil.bubbleSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void twoDiffSortingMethodsBubbleSort() throws Exception {
        int[] actualArray = {25, 19, 16, 12, -10, -18};
        int[] expectedArray = {25, 19, 16, 12, -10, -18};
        BubbleSortUtil.bubbleSort(actualArray);
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}