package com.lamdas;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //Version1
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                System.out.println("it works!");
                return Integer.compare(s1.length(), s2.length());
            }
        };
        //Version2
        Comparator<String> comparator2 =
                (String s3, String s4) ->
                        Integer.compare(s3.length(), s4.length());
        //Version3
        Comparator<String> comparator3 =
                (s5, s6) ->
                        Integer.compare(s5.length(), s6.length());


        //Version1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("it works!");
                }
            }
        };
        //Version2
        Runnable r2 = () -> {
            int i = 0;
            while(i < 10) {
                System.out.println("it works!");
            }
        };

    }



}
