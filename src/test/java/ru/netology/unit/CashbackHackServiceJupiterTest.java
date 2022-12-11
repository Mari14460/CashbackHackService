package ru.netology.unit;


public class CashbackHackServiceJupiterTest {
    @org.junit.jupiter.api.Test
    public void ShouldReturn1000WhenPassed0() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturn200WhenPassed800() {
        int amount = 800;
        int expected = 200;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturn500WhenPassed1500() {
        int amount = 1500;
        int expected = 500;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ShouldReturn0WhenPassed1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}
