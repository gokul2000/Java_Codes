/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.collections.set;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Gokul on Sep,2020,06-09-2020 at 19:23
 */

/**
 * Implementation of Set Using AbstractSet
 * As Abstract Set is an abstract class and have to implement abstract methods*/
public class SetImplementaion1 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);
        Iterator<Integer> integerIterator = integerStream.iterator();
        Set<Integer> set = new AbstractSet<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return integerIterator;
            }

            @Override
            public int size() {
                return 7;
            }
        };
        //Printing using spliterator
        while (set.spliterator().tryAdvance(System.out::println)){

        }
        //as spliterator counts for stream operations so once a terminal operation or stream is closed then it doesnot execute for second time
        while (set.spliterator().tryAdvance(System.out::println)){
            //as this while loop never exectes... and it is always false
        }
    }
}
