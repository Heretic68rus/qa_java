package com.example;

import java.util.List;

public class Lion implements  AllFeline {

    boolean hasMane;
    private AllFeline allFeline;
    public Lion(AllFeline allFeline) {
        this.allFeline = allFeline;
    }
    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    Animal animal = new Animal();
    @Override
    public int getKittens() {
        return allFeline.getKittens();
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
