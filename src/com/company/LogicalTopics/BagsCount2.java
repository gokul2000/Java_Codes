/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Gokul on Sep,2020,09-09-2020 at 14:25
 */

public class BagsCount2 {
    static Map<Integer,Integer> map=new LinkedHashMap<>();
    static Map<Integer,Double> mapResult = new LinkedHashMap<>();
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
            mapResult.put(r,d);
        }
        int K=C;
        List<Integer> integerList = new ArrayList<>();
        List<Map.Entry<Integer,Double>> mapList = mapResult.entrySet().stream().sorted(
                new Comparator<Map.Entry<Integer, Double>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                        if(o1.getValue()==o2.getValue()){
                            return -map.get(o1.getKey()).compareTo(map.get(o2.getKey()));
                        }
                        return -o1.getValue().compareTo(o2.getValue());
                    }
                }
        ).collect(Collectors.toList());

        for(Map.Entry<Integer,Double> mapValue :mapList){
            if(mapValue.getKey()<=K){
                integerList.add(mapValue.getKey());
                K-=mapValue.getKey();
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
