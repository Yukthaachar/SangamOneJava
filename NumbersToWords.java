
package yy3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class number_2 {
    public static ArrayList<String> loadfile(String fname) throws FileNotFoundException {
		File f1=new File(fname);
		ArrayList<String> list1=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNextLine()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}
    public static void convert10000000(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0;
                num2=num1/100000;
                part1=num1%100000;
                if (num1>0) {
                    convert100(num2,lst1);
                if (part1==0) {
                System.out.print(" Lakh ");
            }
        }
       convert1000000(part1, lst1);
    }
    public static void convert1000000(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0;
                num2=num1/100000;
                part1=num1%100000;
                if (num1>0) {
                    System.out.print(lst1.get(num2) + " Lakh ");
        }
       convert100000(part1, lst1);
    }
    public static void convert100000(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0;
                num2=num1/1000;
                part1=num1%1000;
                if (num1>0) {
            convert100(num2,lst1);
            if (part1==0) {
                System.out.print(" Thousand ");
            }
        }
       convert10000(part1, lst1);
    }
    public static void convert10000(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0;
                num2=num1/1000;
                part1=num1%1000;
                if (num1>0) {
            System.out.print(lst1.get(num2) + " Thousand ");
        }
       convert1000(part1, lst1);
    }
    public static void convert1000(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0;
                num2=num1/100;
                part1=num1%100;
                if (num1>0) {
            System.out.print(lst1.get(num2) + " Hundred ");
            if (part1>0) {
                System.out.print("and ");
            }
        }
       convert100(part1, lst1);
    }
    
	public static void convert100(int n1,ArrayList<String> a2) throws IOException {
		int num1=n1;
		ArrayList<String> lst1=new ArrayList<>();
		lst1=a2;
		int num2=0,part1=0,part2=0;
		if(num1<=20) {
			convert20(num1,lst1);
		}
		else {
			num2=(num1/10)-2;
                        part1=num1%10;
			System.out.print(lst1.get(20+num2)+" "+lst1.get(part1));
		}
	}
     public static void convert20(int n1,ArrayList<String> a1)throws IOException {
		String word1;
		int num1=n1;
		word1=a1.get(num1);
		System.out.print(word1+" ");
	}


    public static void main(String[] args) throws IOException {
        System.out.println("This program will work upto 29");
		System.out.println("Enter any number: ");
		ArrayList<String> lst1=new ArrayList<>();
		int num2=0,part1=0,len1=0;
		lst1=loadfile("words6.txt");
		Scanner sc2=new Scanner(System.in);
		int num1=sc2.nextInt();
                String str;
                str=String.valueOf(num1);
                len1=str.length();
		switch(len1){
                    case 1:
                    case 2:convert100(num1,lst1);
                    break;
                    case 3:convert1000(num1,lst1);
                    break;
                    case 4:convert10000(num1,lst1);
                    break;
                    case 5:convert100000(num1,lst1);
                    break;
                    case 6:convert1000000(num1,lst1);
                    break;
                    case 7:convert10000000(num1,lst1);
                    break;
                    default:System.out.println("number out of range");
                }
    }
    
}
