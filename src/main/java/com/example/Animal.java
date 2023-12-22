package com.example;

import java.util.List;

public class Animal implements AllFeline{

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {   //проверить
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    @Override
    public int getKittens(int kittensCount) {
        return 0;
    }
}