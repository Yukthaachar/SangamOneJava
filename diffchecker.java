
package yy1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class diffchecker {

    public static void main(String[] args) throws FileNotFoundException {
        File  f1=new File("file1.txt");
        File  f2=new File("file2.txt");
        List<String>list1=new ArrayList<>();
        List<String>list2=new ArrayList<>();
        List<String>diff=new ArrayList<>();
        String s1;
        String s2;
        Scanner sc1=new Scanner(f1);
        Scanner sc2=new Scanner(f2);
        while(sc1.hasNextLine()){
         list1.add(sc1.nextLine());  
        }
        while(sc2.hasNextLine()){
         list2.add(sc2.nextLine());  
        }
        for( int i=0;i<4;i++) {
        s1=list1.get(i);
        s2=list2.get(i);
        if(!(s1.equals(s2))){
            diff.add(s2);
        }    
    }
        
         System.out.println(list1);
         System.out.println(list2);
         System.out.println(diff);
       
    }
    
}
