/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;
import java.util.*;

/**
 * Created by Gokul on Sep,2020,09-09-2020 at 14:25
 */

public class BagsCount2 {
    static Map<Integer,Integer> map=new LinkedHashMap<>();
    static Map<Double,Integer> mapResult = new TreeMap<>(Collections.reverseOrder());
    static int C,N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        C=sc.nextInt();
        for(int i=0;i<N;i++){
            int r= sc.nextInt();
            int c=sc.nextInt();
            map.put(r,c);
            Double d = ((double)(c/(double)r));
            mapResult.put(d,r);
        }
        int K=C;
        List<Integer> integerList = new ArrayList<>();
        List<Map.Entry<Double,Integer>> mapList = new ArrayList<>(mapResult.entrySet());
        for(Map.Entry<Double,Integer> mapValue :mapList){
            if(mapValue.getValue()<=K){
                integerList.add(mapValue.getValue());
                K-=mapValue.getValue();
            }
        }
        Set<Integer> integerSet = map.keySet();
        for(int keys :integerSet){
            if(integerList.contains(keys)){
                System.out.print(keys+" ");
            }
        }


    }
}
