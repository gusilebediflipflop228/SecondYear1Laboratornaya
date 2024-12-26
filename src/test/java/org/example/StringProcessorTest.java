package org.example;

import org.example.StringProcessor;
import org.junit.Assert;
import org.junit.Test;


public class StringProcessorTest {
    @Test
    public void multiplyOfString() {
        Assert.assertEquals("я не знаю про анализя не знаю про анализя не знаю про анализ", StringProcessor.multiplyOfString("я не знаю про анализ", 3));
        Assert.assertEquals("123123123", StringProcessor.multiplyOfString("123", 3));
        Assert.assertEquals("", StringProcessor.multiplyOfString("", 3));
        Assert.assertEquals("", StringProcessor.multiplyOfString("", 0));
    }
    @Test
    public void multiplyOfError() {
        Assert.assertThrows(IllegalArgumentException.class, () -> StringProcessor.multiplyOfString("", -1));
    }


    @Test
    public void searchForSubstring(){
        Assert.assertEquals(3,StringProcessor.searchForSubstring("123123123","123"));
        Assert.assertEquals(2,StringProcessor.searchForSubstring("aaa","aa"));
        //Assertions.assertEquals(3,StringProcessor.searchForSubstring("123","124"));

    }

    @Test
    public void replaceNums(){
        Assert.assertEquals("Мне нужен один кофе, два пончика и три салфетки", StringProcessor.replaceNums("Мне нужен 1 кофе, 2 пончика и 3 салфетки"));
        Assert.assertEquals("одинодинодинодин4", StringProcessor.replaceNums("11114"));
    }

    @Test
    public void delStr(){
        Assert.assertEquals(new StringBuilder("1111").toString(),StringProcessor.delStr(new StringBuilder("12121212")).toString());
    }

    @Test
    public void searchForSubstringErrors() {
        Assert.assertThrows(IllegalArgumentException.class, () -> StringProcessor.searchForSubstring("132", ""));
    }



}