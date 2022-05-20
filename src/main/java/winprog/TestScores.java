package winprog;

import java.util.Scanner;
public class TestScores{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a value between 0 and 100:");
        int number = Integer.valueOf(scanner.nextLine());
        getGrade(number);        
    scanner.close();
}

    public static String getGrade(int number)
    {
        if (number >= 90 && number <=100) {
                return "Your grade is an A";
        } else if (number >= 80 && number <=89) {
                return "Your grade is B";
        } else if (number >= 70 && number <=79) {
                return "Your grade is C";
        } else if (number >= 60 && number <=69) {
                return "Your grade is D";
        }
            else {
                return "Your grade is F";
        }

    }

    
}
