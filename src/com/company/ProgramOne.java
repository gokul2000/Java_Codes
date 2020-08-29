package com.company;//Folder
//import java.lang.*;
//Class Object

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


import java.util.*;
import java.util.stream.IntStream;

public class ProgramOne {
    public static void main(String[] args) {
        Person p1 = new Person(3, "Dinesh");
        Person p3 = new Person(2, "Dinesh");
        Person p2 = new Person(2, "Gokul");
        List<Person> persons = new ArrayList<>();
        persons.add(p2);
        persons.add(p1);
        persons.add(p3);
        Collections.sort(persons, new Person());
        for (Person p : persons) {
            System.out.println(p);
        }
        String key = "footballplayer";


    }

}

class Person implements Comparable<Person>, Comparator<Person> {
    int id;
    String name;

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name.equals(o2.name)) {
            return Integer.compare(o1.id, o2.id);
        } else {
            return o1.name.compareTo(o2.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//hashCode
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
