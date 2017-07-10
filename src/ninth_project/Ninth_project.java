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
    
    static int DividerSimple(int x, int y)
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
        int mas[] = {2,3,4};
        Print3(mas);
    }
}
