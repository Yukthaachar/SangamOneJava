
package yy2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import yy2.ReverseString;
public class reversestr {
    

    public static void main(String[] args) throws FileNotFoundException {
        ReverseString r=new ReverseString();
        String info="";
        File f1=new File("names.txt");
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            info=sc.nextLine();
            String res=r.rev1(info);
            System.out.println(res);
        }
       
    }
    
}
