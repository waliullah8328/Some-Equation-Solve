package com.company;

import java.util.Scanner;



public class Question1
{
    public static int equation1(int A,int B,int C,int D)
    {
        int result;
        result = (A * B - C * D);

        return result;

    }

    public static int equation2(int A,int B,int D)
    {
       
       int result2 = (((2*A) - (B)) + (3*D));


        int result21 = result2;
        return result21;

    }

    public static int equation3(int A,int B,int C,int D)
    {

        int result3 = 	A*A + B*B - C*C + D*D;


        int result31 = result3;
        return result31;

    }

    public static int equation4(int A,int B,int C)
    {

        int result4 = 	A*A*A + B -C*C;


        int result31 = result4;
        return result31;

    }

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int a,b,c,d;
        System.out.print("Enter A = ");
        a =input.nextInt();

        System.out.print("Enter B = ");
        b =input.nextInt();

        System.out.print("Enter C = ");
        c =input.nextInt();

        System.out.print("Enter D = ");
        d =input.nextInt();
        int result2 = equation1(a,b,c,d);
        System.out.println("Solution of Equation - 1 =  " +result2);

        int result3 = equation2(a,b,d);
        System.out.println("Solution of Equation - 2 =  " +result3);

        int result4 = equation3(a,b,c,d);
        System.out.println("Solution of Equation - 2 =  " +result4);

        int result5 = equation4(a,b,c);
        System.out.println("Solution of Equation - 2 =  " +result5);

    }
}
