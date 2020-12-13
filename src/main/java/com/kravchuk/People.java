package com.kravchuk;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

class People {


    private final String name;

    private final Integer age;
    private final Sex sex;

    public People(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(age, people.age) &&
                Objects.equals(sex, people.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }


    public String findCard(Collection<String> collection) {
        String card = null;
        for (String elem : collection) {
            if (elem.equals("a1")) {
                card = elem;
                collection.remove(elem);
            }
        }
        return card;
    }
}

enum Sex {
    MAN,
    WOMEN;

}
