
package yy4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import yy4.s2;

public class greeting4 {

    public static void main(String[] args) throws FileNotFoundException {
        File f1=new File("greeting2.txt");
        Scanner sc1=new Scanner(f1);
        ArrayList<String>names=new ArrayList<>();
	ArrayList<String>gender=new ArrayList<>();
	String[] arr1=null;
        s2 ss2=new s2();
        while(sc1.hasNextLine()) {
            arr1=sc1.nextLine().split("\n");
            names.add(arr1[0]);
        }
        for (String name : names) {
            String[] parts = name.split(",");
            if (parts.length == 1) {
                System.out.println(ss2.greeting(parts[0]));
            } else if (parts.length == 2) {
                System.out.println(ss2.greeting(parts[0], parts[1]));
            } else {
                System.out.println("Error: Invalid input - " + name);
            }
        }
    }    
}
    

