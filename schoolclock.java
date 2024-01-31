
package yy1;

import static java.lang.Math.abs;

public class schoolclock {
    public static void main(String[] args) {
        System.out.println("Time : Angle");
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
            String t1;
            t1 = ((9+j)%12+":"+String.valueOf(i*5)); 
            double angle1=abs((90-j*30)+i*30-i*2.5);
            if(j == 3){
                t1=(12+":"+String.valueOf(i*5));
            } 
            System.out.println(t1+" : "+angle1%360);
            }
              System.out.println("\n");
        }
    }
    
}
