
package yy2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pemutation {
    public static List perm9(String word9) {
        List<String>result=new ArrayList<>();
        List<String>List9=new ArrayList<>();
        String input1=word9;
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }

        s1=input1.substring(1,2);
        s2=input1.substring(0,1)+input1.substring(2,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }
        s1=input1.substring(2,3);
        s2=input1.substring(0,2)+input1.substring(3,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }
        s1=input1.substring(3,4);
        s2=input1.substring(0,3)+input1.substring(4,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }
        s1=input1.substring(4,5);
        s2=input1.substring(0,4)+input1.substring(5,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }
        s1=input1.substring(5,6);
        s2=input1.substring(0,5)+input1.substring(6,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));       
    }
        s1=input1.substring(6,7);
        s2=input1.substring(0,6)+input1.substring(7,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));
    }
        s1=input1.substring(7,8);
        s2=input1.substring(0,7)+input1.substring(8,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));
    }   
        s1=input1.substring(8,9);
        s2=input1.substring(0,8)+input1.substring(9,9);
        result=perm8(s2);
        for(int i=0;i<40320;i++){
        List9.add(s1+result.get(i));
    }
        return List9;
    }
    public static List perm8(String word8) {
        List<String>result=new ArrayList<>();
        List<String>List8=new ArrayList<>();
        String input1=word8;
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,8);
        
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }

        s1=input1.substring(1,2);
        s2=input1.substring(0,1)+input1.substring(2,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }
        s1=input1.substring(2,3);
        s2=input1.substring(0,2)+input1.substring(3,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }
        s1=input1.substring(3,4);
        s2=input1.substring(0,3)+input1.substring(4,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }
        s1=input1.substring(4,5);
        s2=input1.substring(0,4)+input1.substring(5,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }
        s1=input1.substring(5,6);
        s2=input1.substring(0,5)+input1.substring(6,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));       
    }
        s1=input1.substring(6,7);
        s2=input1.substring(0,6)+input1.substring(7,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));
    }
        s1=input1.substring(7,8);
        s2=input1.substring(0,7)+input1.substring(8,8);
        result=perm7(s2);
        for(int i=0;i<5040;i++){
        List8.add(s1+result.get(i));
    }
        return List8;
    }
    public static List perm7(String word7) {
       List<String>result=new ArrayList<>();
       List<String>List7=new ArrayList<>();
        String input1=word7;
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,7);
        
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }

       s1=input1.substring(1,2);
        s2=input1.substring(0,1)+input1.substring(2,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }
       s1=input1.substring(2,3);
       s2=input1.substring(0,2)+input1.substring(3,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }
       s1=input1.substring(3,4);
       s2=input1.substring(0,3)+input1.substring(4,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }
       s1=input1.substring(4,5);
       s2=input1.substring(0,4)+input1.substring(5,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }
       s1=input1.substring(5,6);
       s2=input1.substring(0,5)+input1.substring(6,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));       
    }
       s1=input1.substring(6,7);
       s2=input1.substring(0,6)+input1.substring(7,7);
       result=perm6(s2);
       for(int i=0;i<720;i++){
        List7.add(s1+result.get(i));
        
    }
      return List7;
    }
    public static List perm6(String word6) {
         List<String>result=new ArrayList<>();
       List<String>List6=new ArrayList<>();
     String input1=word6;
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,6);
        
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }

       s1=input1.substring(1,2);
        s2=input1.substring(0,1)+input1.substring(2,6);
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }
       s1=input1.substring(2,3);
       s2=input1.substring(0,2)+input1.substring(3,6);
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }
       s1=input1.substring(3,4);
       s2=input1.substring(0,3)+input1.substring(4,6);
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }
       s1=input1.substring(4,5);
       s2=input1.substring(0,4)+input1.substring(5,6);
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }
       s1=input1.substring(5,6);
       s2=input1.substring(0,5)+input1.substring(6,6);
       result=perm5(s2);
       for(int i=0;i<120;i++){
        List6.add(s1+result.get(i));       
    }
    return List6;
    }
    public static List perm5(String word5) {
       List<String>result=new ArrayList<>();
       List<String>List5=new ArrayList<>();
       String input1=word5;
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,5);
       result=perm4(s2);
       for(int i=0;i<24;i++){
        List5.add(s1+result.get(i));       
    }

       s1=input1.substring(1,2);
        s2=input1.substring(0,1)+input1.substring(2,5);
       result=perm4(s2);
       for(int i=0;i<24;i++){
        List5.add(s1+result.get(i));       
    }
       s1=input1.substring(2,3);
       s2=input1.substring(0,2)+input1.substring(3,5);
       result=perm4(s2);
       for(int i=0;i<24;i++){
        List5.add(s1+result.get(i));       
    }
       s1=input1.substring(3,4);
       s2=input1.substring(0,3)+input1.substring(4,5);
       result=perm4(s2);
       for(int i=0;i<24;i++){
        List5.add(s1+result.get(i));       
    }
       s1=input1.substring(4,5);
       s2=input1.substring(0,4)+input1.substring(5,5);
       result=perm4(s2);
       for(int i=0;i<24;i++){
        List5.add(s1+result.get(i));       
    }
       
       return List5;  
     }
    public static List perm4(String word4) {
        String input1=word4;
        List<String>List4=new ArrayList<>();
        List<String>result=new ArrayList<>();
       String s1=input1.substring(0,1);
        String s2=input1.substring(1,4);
       result=perm3(s2);
       for(int i=0;i<6;i++){
        List4.add(s1+result.get(i));       
    }
       s1=input1.substring(1,2);
       s2=input1.substring(0,1)+input1.substring(2,4);
       result=perm3(s2);
       for(int i=0;i<6;i++){
        List4.add(s1+result.get(i));       
    }
       
       s1=input1.substring(2,3);
       s2=input1.substring(0,2)+input1.substring(3,4);
       result=perm3(s2);
       for(int i=0;i<6;i++){
        List4.add(s1+result.get(i));       
    }
       
       s1=input1.substring(3,4);
       s2=input1.substring(0,3)+input1.substring(4,4);
       result=perm3(s2);
       for(int i=0;i<6;i++){
        List4.add(s1+result.get(i));       
    }
       return List4;
       
    }
    public static List perm3(String word3) {
         String input1=word3;
        List<String>pw=new ArrayList<>();
        String s1=input1.substring(0,1);
        String s2=input1.substring(1,2);
        String s3=input1.substring(2,3);
        pw.add(s1+s2+s3);
        pw.add(s1+s3+s2);
        pw.add(s2+s1+s3);
        pw.add(s2+s3+s1);
        pw.add(s3+s1+s2);
        pw.add(s3+s2+s1);
        return pw;
    }

    public static void main(String[] args) {
       String input1;
        int len1;
        List<String>result=new ArrayList<>();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a word : ");
        input1=sc.next();
        len1 = input1.length();
        switch(len1){
           case 3:{
           result=perm3(input1);
           System.out.println(result);
           break;
           }
           case 4:{
           result=perm4(input1);
           System.out.println(result);
           break;
           }
           case 5:{
           result=perm5(input1);
           System.out.println(result);
           break;
           }
           case 6:{
           result=perm6(input1);
           System.out.println(result);
           break;
           }
           case 7:{
           result=perm7(input1);
           System.out.println(result);
           break;
           }
           case 8:{
           result=perm8(input1);
           System.out.println(result);
           break;
           }
           case 9:{
           result=perm9(input1);
           System.out.println(result);
           break;
           }
           default:System.out.println("invalid");
          
       }
      
     
}
    
}
