package com.company.collections.arraylist;
//.add .set .get .remove
import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("First");//.add create element of arraylist
        stringArrayList.add("Second");
        stringArrayList.add("Third");
        stringArrayList.add("Forth");
        stringArrayList.add("Fifth");
        System.out.println(stringArrayList);//[First, Second, Third, Forth, Fifth]
        for (String arr:stringArrayList) {//FirstSecondThirdForthFifth
            System.out.print(arr);
        }
        System.out.println();
        //.get
        for (int i = 0; i < stringArrayList.size(); i++) {//FirstSecondThirdForthFifth
            System.out.print(stringArrayList.get(i));
        }
        stringArrayList.set(0,"ChangedFirst");
        System.out.println(stringArrayList);
        stringArrayList.add(0,"Added0elelment");
        System.out.println(stringArrayList);
        stringArrayList.remove(2);
        System.out.println(stringArrayList);
    }
}
