package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import java.util.Arrays;
import java.util.List;

public class FelineTest {
    @Mock
    Feline allFeline;
    @Test
    public void testEatMeatFromListOfPredators() throws Exception {
        AllFeline animal = new Animal();
        Feline feline = new Feline(animal);
        List<String> expectedAnimalList = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedAnimalList, feline.eatMeat());
    }
    @Test
    public void testGetFamilyReturnSpecifiedValue() {
        Feline feline = new Feline(allFeline);
        String returnValue = feline.getFamily();
        Assert.assertEquals("Кошачьи", returnValue);
    }

    @Test
    public void testGetKittensReturnKittensCountIs1() {
        Feline feline = new Feline(allFeline);
        int returnValue = feline.getKittens();
        Assert.assertEquals(1, returnValue);
    }
}