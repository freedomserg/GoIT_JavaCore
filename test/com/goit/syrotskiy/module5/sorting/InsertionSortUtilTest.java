package com.goit.syrotskiy.module5.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortUtilTest {

    @Test(timeout = 100)
    public void arbitraryDataInsertionSort() throws Exception {
        int[] actualArray = {-5, 7, -13, 45, -100, 61};
        int[] expectedArray = {-100, -13, -5, 7, 45, 61};
        InsertionSortUtil.insertionSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void sortedInDescendingOrderDataInsertionSort() throws Exception {
        int[] actualArray = {25, 19, 16, 12, -10, -18};
        int[] expectedArray = {-18, -10, 12, 16, 19, 25};
        InsertionSortUtil.insertionSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void identicalValuesDataInsertionSort() throws Exception {
        int[] actualArray = {25, 19, 19, 12, 12, -18};
        int[] expectedArray = {-18, 12, 12, 19, 19, 25};
        InsertionSortUtil.insertionSort(actualArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(timeout = 100)
    public void twoDiffSortingMethodsInsertionSort() throws Exception {
        int[] actualArray = {25, 19, 16, 12, -10, -18};
        int[] expectedArray = {25, 19, 16, 12, -10, -18};
        InsertionSortUtil.insertionSort(actualArray);
        Arrays.sort(expectedArray);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}