package fizzbuzz;

/**
 * Created by mairaaraujo on 26/05/17.
 */
public class FizzBuzz {

    public static boolean isDivisibleByThree(int number){

        return (number % 3 == 0);
    }

    public static boolean isDivisibleByFive(int number){
        return (number % 5 == 0);
    }

    public static boolean isDivisibleByFifteen(int number){
        return (number % 15 == 0);
    }

    public static void printNumber(int number){

        if(isDivisibleByFifteen(number)){
            System.out.println("FizzBuzz");
        }
        else if(isDivisibleByThree(number)){
            System.out.println("Fizz");
        }

        else if(isDivisibleByFive(number)){
            System.out.println("Buzz");
        }

        else
            System.out.println(number);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            printNumber(i);
        }
    }
}
