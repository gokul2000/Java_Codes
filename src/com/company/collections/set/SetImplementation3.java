/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BinaryOperator;

/**
 * Created by Gokul on Sep,2020,07-09-2020 at 18:06
 */
public class SetImplementation3 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(23);
        integerHashSet.add(9);
        integerHashSet.add(223);
        HashSet<Integer> integerHashSet1=(HashSet<Integer>)integerHashSet.clone();
        integerHashSet1.forEach(System.out::println);
        Integer [] integers = integerHashSet.toArray(Integer[]::new);
        Arrays.stream(integers).forEachOrdered(System.out::println);//Ordered Stream
        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(integerHashSet);
        int k=integerSet.stream().reduce(Integer::sum).get();
        System.out.println(k);
    }
}
