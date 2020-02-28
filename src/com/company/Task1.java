


package com.company;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

            String string1 = "aab";
            String string2 = "aba";
            String string3="aab";

            HashMap<Character, Integer> map1
                    = new HashMap<Character, Integer>();
            HashMap<Character, Integer> map2
                    = new HashMap<Character, Integer>();
            HashMap<Character, Integer> map3
                = new HashMap<Character, Integer>();

            char array1[] = string1.toCharArray();
            char array2[] = string2.toCharArray();
            char array3[] = string3.toCharArray();

            for (int i = 0; i < array1.length; i++) {

                if (map1.get(array1[i]) == null) {
                    map1.put(array1[i], 1);
                } else {
                    Integer c =  map1.get(array1[i]);
                    map1.put(array1[i], ++c);
                }
            }
            for (int j = 0; j < array2.length; j++) {
                if (map2.get(array2[j]) == null) {
                    map2.put(array2[j], 1);
                } else {
                    Integer d = map2.get(array2[j]);
                    map2.put(array2[j], ++d);

                }
            }
        for (int t = 0; t < array3.length; t++) {
            if (map3.get(array3[t]) == null) {
                map3.put(array3[t], 1);
            } else {
                Integer f = map3.get(array3[t]);
                map3.put(array3[t], ++f);

            }
        }


            System.out.println(map1);
            System.out.println(map2);
        System.out.println(map3);
            System.out.println(array1);
            System.out.println(array2);
        System.out.println(array3);

            if (map1.equals(map2)&map2.equals(map3)){
                System.out.println("map1"+map1 + "is anagram with "+ "map2" +"anagram with"+" map3"+map3);
            }
            else {
                System.out.println("map1"+map1 + "is not anagram with "+ "map2"+map2);
            }

        }
    }

