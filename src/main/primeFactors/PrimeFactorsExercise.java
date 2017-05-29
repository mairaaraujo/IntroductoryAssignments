package primeFactors;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mairaaraujo on 29/05/17.
 */
public class PrimeFactorsExercise {

    public static boolean isPrimeNumber(int number){
        for (int i = 2; i < number; i++) {
            if(number%i == 0)
                return false;
        }

        return true;
    }

    public static void getFactors(int number){

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            if(isPrimeNumber(i) && number%i == 0)
                factors.add(i);
        }

        System.out.println("factors = " + factors.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        getFactors(Integer.valueOf(number));

    }
}
