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
    static void PrintHelloWorld() 
    {
        System.out.println("Hello World");
    }
    static void Summator(int a, int b) 
    {
        System.out.println( a + b );
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
        PrintHelloWorld();
        Summator(6, 18);
        Summator(5, 7);
    }
    
}
