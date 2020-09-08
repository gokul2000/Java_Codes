/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gokul on Sep,2020,08-09-2020 at 16:08
 */
public class AllPossibleSubArrays {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        int b=2;
        List<String> array = new ArrayList<>();
        for(int i=0;i<=5-b;i++){

            for(int j=i+1;j<=5-(b-1);j++){
                String str =(arr.get(i)+"");
                for(int k=j;k<j+(b-1);k++){
                    str+=(arr.get(k)+"");
                }
                array.add(str);
            }


        }
        int k=3;
        while(k<5){
            for(int i=0;i<array.size();i++){
                if(array.get(i).length()==k-1){
                    for(int v=0;v<arr.size();v++){
                        String s=arr.get(v)+"";
                        if(!(array.get(i).contains(s))){
                            String result=array.get(i)+s;

                            array.add(result);
                        }
                    }
                }
            }
            k+=1;
        }
        System.out.println(array);
    }
    }

