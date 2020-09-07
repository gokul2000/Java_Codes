/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.collections.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Gokul on Sep,2020,07-09-2020 at 18:16
 */
public class SetImplementaion4 {
    public static void main(String[] args) {
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
        integerNavigableSet.add(23);
        integerNavigableSet.add(253);
        integerNavigableSet.add(123);
        integerNavigableSet.add(2534);
        System.out.println(integerNavigableSet.ceiling(120));//returns the least element that is greater than or equal to the given element
        System.out.println(integerNavigableSet.ceiling(123));
        System.out.println(integerNavigableSet.higher(123));// returns the least element greater than the given element
        integerNavigableSet.descendingIterator().forEachRemaining(System.out::println);
        System.out.println(integerNavigableSet.floor(23122));// returns the greatest element less than or equal to the given number
        System.out.println(integerNavigableSet.floor(10));// here as there is no number less than or equal to 10 so it gives null
        System.out.println(integerNavigableSet.floor(23));// here as there is no number less than or equal to 10 so it gives null
        System.out.println(integerNavigableSet.headSet(123,false));
        System.out.println(integerNavigableSet.headSet(123,true));
        System.out.println(integerNavigableSet.lower(23));//strictly lower
        System.out.println(integerNavigableSet.lower(23122));
        System.out.println(integerNavigableSet.pollFirst());//it removes 23 and returns the value
        System.out.println(integerNavigableSet);
        integerNavigableSet.add(23);
        System.out.println(integerNavigableSet.pollLast());
        System.out.println(integerNavigableSet);
        integerNavigableSet.add(2534);
        System.out.println(integerNavigableSet.subSet(23,true,123,true));
        System.out.println(integerNavigableSet.subSet(23,false,123,true));
        System.out.println(integerNavigableSet.subSet(23,true,123,false));
        System.out.println(integerNavigableSet);
        System.out.println(integerNavigableSet.headSet(123,true));
        System.out.println(integerNavigableSet.headSet(123,false));
        System.out.println(integerNavigableSet.tailSet(123,true));
        System.out.println(integerNavigableSet.tailSet(123,false));

    }
}
