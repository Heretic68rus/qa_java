package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionTestDoesHaveMane {
    private final String sex;
    private final boolean expected;

    public LionTestDoesHaveMane(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;

    }
    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };

}
    @Test
    public void testDoesHaveManeWithParametrsMaleTrueFemaleFalse() throws Exception {
        Lion lion = new Lion(sex);
        lion.doesHaveMane();
        Assert.assertEquals(expected, lion.doesHaveMane());
    }
}
