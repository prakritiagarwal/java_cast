package winprog;

import java.util.Scanner;
public class Calculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());
       
//Addition
int numbers1 = add(numOne, numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + numbers1);


//Subtraction
int numbers2 = subtract(numOne, numTwo);
System.out.println(numOne + " - " + numTwo + " = " + numbers2);

//Multiplication
int numbers3 = multiply(numOne, numTwo);
        System.out.println(numOne + " * " + numTwo + " = " + numbers3);


//Division
float numbers4 = divide(numOne, numTwo);
System.out.println(numOne + " / " + numTwo + " = " + numbers4);



//Modulus
int numbers5 = numOne % numTwo;
        System.out.println(numOne + " % " + numTwo + " = " + numbers5);
        scanner.close();
    }

    public static int add(int a, int b) 
    {
            return a+b;
    }

    public static int subtract(int a, int b) 
    {
            return a-b;
    }

    public static int multiply(int a, int b)
    {
            return a*b;
    }

    public static float divide(int a, int b)
    {
            return (float)a/ (float)b;
    }


}    