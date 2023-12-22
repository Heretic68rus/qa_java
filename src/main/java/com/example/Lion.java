package com.example;

import java.util.List;

public class Lion implements  AllFeline {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    Animal animal = new Animal();

    public Lion(AllFeline animal) {
    }

    @Override
    public int getKittens() {
        return feline.getKittens();
    }

    @Override
    public int getKittens(int kittensCount) {
        return 0;
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        return animal.getFood("Хищник");
    }


    public boolean doesHaveMane() {
        return hasMane;
    }
}
