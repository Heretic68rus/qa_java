package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
    @Mock
    Feline allFeline;
    @Test
    public void testGetSoundReturnSpecifiedValue() {
        Cat cat = new Cat(feline);
        String returnValue = cat.getSound();
        assertEquals("Мяу", returnValue);
    }
    @Test
    public void testGetFoodCatEatingPredatorFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }
    @Test
    public void testGetFoodWithSweetFoodThrowsException() {
        Feline feline = new Feline(allFeline);
        Cat catWithEmptyValues = new Cat(feline);
        Exception exception = Assert.assertThrows(Exception.class, () -> catWithEmptyValues.getFood("Конфета"));
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}