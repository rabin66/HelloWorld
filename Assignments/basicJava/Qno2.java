package Assignments.basicJava;

import java.util.Scanner;

/**
 * Created by Jagriti on 1/21/2019.
 */

/**
show the following output from the following input
        input
        java 100
        cpp 65
        python 50
        output
        ================================
        java           100
        cpp            065
        python         050
        ================================
 */
public class Qno2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);      
        
        String[] S=new String[3];
        for(int i=0;i<3;i++){
            String str=sc.next();
            int num=sc.nextInt(); 
            String asString1b=String.format("%03d",num);
            String asString1a=String.format("%-15s",str);
            S[i]=asString1a.concat(asString1b);
        }
        for(String a:S){
            System.out.println(a);
        }

    }
}


