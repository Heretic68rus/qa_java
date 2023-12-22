package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import java.util.Arrays;
import java.util.List;


public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void testGetKittens() {
        Lion lion = new Lion(this.feline);
        int kittensCount = 0;
        int returnValue = lion.getKittens(kittensCount);
        Assert.assertEquals(0, returnValue);
    }

    @Test
    public void testGetFoodFromListOfPredators() throws Exception {
        AllFeline animal = new Animal();
        Lion lion = new Lion(animal);
        List<String> expectedAnimalList = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedAnimalList, lion.getFood("Хищник"));
    }
    @Test
    public void testLionThrowExeptionWithInvalidSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Не определен", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}



