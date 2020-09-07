/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Gokul on Sep,2020,06-09-2020 at 20:13
 */
public class SetImplementation2 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        //here we can use only treeSet has it only has comparator logic implicitly
        sortedSet.add(121);
        sortedSet.add(29);
        sortedSet.add(1212);
        sortedSet.add(2123);
        sortedSet.add(1231);
        sortedSet.add(1121);
        sortedSet.add(3121);
        sortedSet.add(1525);
        System.out.println(sortedSet);
        System.out.println(sortedSet.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10<=o2%10){
                    return -1;
                }
                return 1;
            }
        }).get());
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.headSet(121));
        System.out.println(sortedSet.tailSet(121));
        System.out.println(sortedSet.subSet(121,1525));


    }
}
