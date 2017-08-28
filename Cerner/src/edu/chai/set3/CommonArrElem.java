package edu.chai.set3;

import java.util.*;
import java.io.*;
 
class CommonArrElem {
 
       public static void main(String a[]) throws Exception
       {
           BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
           String s;
           while((s = in.readLine()) != null)
           {
               
            String a1 = s.split(";")[0];
            String a2 = s.split(";")[1];
               
               String[] temp1 = a1.split(",");
               String[] temp2 = a2.split(",");
               int[] arr1 = new int[temp1.length];
               int[] arr2 = new int[temp2.length];
               for(int i=0;i<temp1.length;i++){
                    arr1[i] = Integer.parseInt(temp1[i]);    
               }
               for(int i=0;i<temp2.length;i++){
                    arr2[i] = Integer.parseInt(temp2[i]);    
               }
               ArrayList<Integer> arr3 = new ArrayList<Integer>();
            for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3.add(arr1[i]);
                }
            }
        }
             for(int i: arr3) {
             System.out.println(i);
        }  
           }}}


