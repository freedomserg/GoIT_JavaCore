package com.goit.syrotskiy.luhnAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class LuhnAlgorithmUtilTest {

    @Test(timeout = 50)
    public void testForValidMasterCardNumber_16digits() throws Exception {
        int[] validMasterCardNumber = {5,1,0,5,1,0,5,1,0,5,1,0,5,1,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validMasterCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidMasterCardNumber_16digits() throws Exception {
        int[] invalidMasterCardNumber = {5,0,1,6,1,0,5,1,0,5,1,0,5,1,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidMasterCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidVisaCardNumber_16digits() throws Exception {
        int[] validVisaCardNumber = {4,0,1,2,8,8,8,8,8,8,8,8,1,8,8,1};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidVisaCardNumber_16digits() throws Exception {
        int[] invalidVisaCardNumber = {4,0,1,2,8,8,8,8,8,7,7,7,1,8,8,1};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidVisaCardNumber_13digits() throws Exception {
        int[] validVisaCardNumber = {4,2,2,2,2,2,2,2,2,2,2,2,2};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validVisaCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidVisaCardNumber_13digits() throws Exception {
        int[] invalidVisaCardNumber = {4,2,2,2,2,2,2,2,2,2,2,2,1};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidVisaCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidAmericanExpressCardNumber_15digits() throws Exception {
        int[] validAmericanExpressCardNumber = {3,7,8,2,8,2,2,4,6,3,1,0,0,0,5};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidAmericanExpressCardNumber_15digits() throws Exception {
        int[] invalidAmericanExpressCardNumber = {3,7,8,2,8,2,2,4,6,3,1,0,0,0,4};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        int[] validAmericanExpressCorporateCardNumber = {3,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAmericanExpressCorporateCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidAmericanExpressCorporateCardNumber_15digits() throws Exception {
        int[] invalidAmericanExpressCorporateCardNumber = {2,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAmericanExpressCorporateCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidAustralianBankCardNumber_16digits() throws Exception {
        int[] validAustralianBankCardNumber = {3,7,8,7,3,4,4,9,3,6,7,1,0,0,0};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validAustralianBankCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidAustralianBankCardNumber_16digits() throws Exception {
        int[] invalidAustralianBankCardNumber = {3,7,8,7,3,4,4,8,3,6,7,1,0,0,0};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidAustralianBankCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidDinersClubCardNumber_14digits() throws Exception {
        int[] validDinersClubCardNumber = {3,8,5,2,0,0,0,0,0,2,3,2,3,7};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDinersClubCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidDinersClubCardNumber_14digits() throws Exception {
        int[] invalidDinersClubCardNumber = {3,8,5,2,0,0,1,0,0,2,3,2,3,7};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDinersClubCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidDiscoverCardNumber_16digits() throws Exception {
        int[] validDiscoverCardNumber = {6,0,1,1,0,0,0,9,9,0,1,3,9,4,2,4};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validDiscoverCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidDiscoverCardNumber_16digits() throws Exception {
        int[] invalidDiscoverCardNumber = {5,0,1,1,0,0,0,9,9,0,1,3,9,4,2,5};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidDiscoverCardNumber));
    }

    @Test(timeout = 50)
    public void testForValidJCBCardNumber_16digits() throws Exception {
        int[] validJCBCardNumber = {3,5,6,6,0,0,2,0,2,0,3,6,0,5,0,5};
        Assert.assertEquals(true, LuhnAlgorithmUtil.isValidCardNumber(validJCBCardNumber));
    }

    @Test(timeout = 50)
    public void testForInvalidJCBCardNumber_16digits() throws Exception {
        int[] invalidJCBCardNumber = {3,4,6,6,0,0,2,0,2,0,3,6,0,4,0,5};
        Assert.assertEquals(false, LuhnAlgorithmUtil.isValidCardNumber(invalidJCBCardNumber));
    }
}