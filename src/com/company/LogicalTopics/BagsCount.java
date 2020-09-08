/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.LogicalTopics;

/**
 * Created by Gokul on Sep,2020,08-09-2020 at 19:42
 */
import java.util.*;
import java.util.stream.*;
public class BagsCount {
    static int C;
    static List<List<Integer>> allPossibilites=new ArrayList<>();
    public static boolean isPresent(List<Integer> list,int v){
        for(int l:list){
            if(l==v)
                return false;
        }
        return true;
    }
    public static void findAllPossibilities(List<Integer> arr){
        int u=0;
        int b=2;

        for(int i=0;i<arr.size();i++){
            allPossibilites.add(List.of(arr.get(i)));

        }
        for(int i=0;i<=arr.size()-b;i++){

            for(int j=i+1;j<=arr.size()-(b-1);j++){
                List<Integer> array=new ArrayList<>();
                array.add(arr.get(i));
                for(int k=j;k<j+(b-1);k++){
                    array.add(arr.get(k));
                }
                allPossibilites.add(array);
            }

        }
        int k=3;


        while(k<=arr.size()){
            for(int i=0;i<allPossibilites.size();i++){
                if(allPossibilites.get(i).size()==k-1){
                    List<Integer> lit = new ArrayList<>(allPossibilites.get(i));
                    for(int v=0;v<arr.size();v++){
                        if(isPresent(lit,arr.get(v))){
                            lit.add(arr.get(v));
                            allPossibilites.add(lit);
                            lit=null;
                            lit=new ArrayList<>(allPossibilites.get(i));
                        }
                    }
                }
            }
            k++;
        }




    }
    public static boolean sumOfList(List<Integer> list){
        int c= list.stream().reduce((x1,x2)->x1+x2).get();
        return c<=C?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int N=sc.nextInt();
        C=sc.nextInt();
        for(int i=0;i<N;i++)
            map.put(sc.nextInt(),sc.nextInt());
        List<Map.Entry<Integer,Integer>>mapList=map.entrySet().stream().collect(Collectors.toList());
        List<Map.Entry<Integer,Integer>>sortedKeys=map.entrySet().stream().sorted((map1,map2)->-(map1.getValue().compareTo(map2.getValue()))).collect(Collectors.toList());
        Map<Integer,List<Integer>> mapResult = new TreeMap<>(Collections.reverseOrder());
        List<Integer>keySet=sortedKeys.stream().map(Map.Entry::getKey).collect(Collectors.toList());
        findAllPossibilities(keySet);
        List<List<Integer>> filtered = allPossibilites.stream().filter(BagsCount::sumOfList).collect(Collectors.toList());
        for(List<Integer> listInteger : filtered){

            int sum=0;
            for(int k:listInteger){
                sum+=map.get(k);
            }
            mapResult.put(sum,listInteger);
        }
        List<Map.Entry<Integer,List<Integer>>> resultInteger=new ArrayList<>(mapResult.entrySet());
        List<Integer> result=resultInteger.get(0).getValue();
        Set<Integer> set = map.keySet();
        for(int k:set){
            if(!isPresent(result,k))
                System.out.print(k+" ");
        }
    }
}
