
package yy5;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiple2 {
    public static List<String> multiple1(int limit){
        List<String> list1 = new ArrayList<>();
        int count = limit + 1;

        for(int j = 2; j < count; j++){
            StringBuilder line = new StringBuilder();
            for(int i = 0; i < (count / j) + 1; i++){
                line.append(j * i).append(" ");
            }
            list1.add(line.toString());
        }

        return list1;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        List<String> result = multiple1(limit);
        for (String line : result) {
            System.out.println(line+" ");
        }
    }
}

    
    

