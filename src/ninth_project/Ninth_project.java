/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth_project;

/**
 *
 * @author Boro_s99
 */
public class Ninth_project {
    
  /*  static int DividerSimple(int x, int y)
    {
        //System.out.println(x - y);   
        //int sum = x + y;
        //return sum;
        return x + y;
        
    }
    static void Print3(int mas[])
    {
        for (int i = 0; i < mas.length; i++) 
            {
                System.out.println(mas[i]);
            }
    }
     static void Print4(int mas2[])
    {
        for (int i = 0; i < mas2.length; i++) 
            {
                mas2[i] = 10;
                System.out.println(mas2[i]);
            }
    }
    static int[] Print5(int mas2[])
    {
        int size = mas2.length;
        int masMy[] = new int[size];
        for (int i = 0; i < size; i++) 
        {
            masMy[i] = mas2[i];
            masMy[i] = 10;
        }
        return masMy;
    }*/
    static int ThirdPow(int a)
    
    {
        return a * a * a;
    }
    static double Max (double a, double b)
    
    {
        if (a > b)
            return a;
        else return b;
        //return (a > b)? a : b;
    }
    static boolean NegPositive(int a)
    {
        return (a >= 0)? true : false;
    }
    
    static void Rectangle(int n, int k)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < k; j++) 
            {
                System.out.print("*");    
            }
            System.out.println("");    
        }
        
    }
    static void Factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) 
        {
            fact*=i;
            
        }
        System.out.println(fact);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String str1 = "Vasya";
        String str2;
        str2 = str1; //Строки не изменяемые
        System.out.println(str1);
        System.out.println(str2);
        str2 = "Kolya";
        System.out.println(str1);
        System.out.println(str2);*/
    /*    PrintHelloWorld();
        Summator(6, 18);
        Summator(5, 7);
        int a = 6;
        int b = 8;
        Summator(a, b);
        //System.out.println(DividerSimple(5, 4) - DividerSimple(5, 4));
        int num1 = DividerSimple(6, 7);
         System.out.println(num1);
    }
    static void PrintHelloWorld() 
    {
        System.out.println("Hello World");
        Summator(6, 41);
    }
    static void Summator(int a, int b) 
    {
        System.out.println( a + b );
  
        }*/
      /*  int mas[] = {2,3,4};
        int mas2[] = {1,2,3};
        Print3(mas);
        Print4(mas2);*/
    /*    int mas1[] = {2,3,4};
        mas1 = Print5(mas1);
        System.out.println(mas1[0]);*/
        int a = ThirdPow(5);
        System.out.println(a);
        System.out.println(ThirdPow(5));
        System.out.println(Max(4,5));
        System.out.println(NegPositive(-4));
        Rectangle(5,5);
        Factorial(3);
    }
    }
