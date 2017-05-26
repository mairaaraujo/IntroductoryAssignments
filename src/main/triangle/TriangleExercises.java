package triangle;

import java.util.Scanner;

/**
 * Created by mairaaraujo on 26/05/17.
 */
public class TriangleExercises {

    public static void easiestExerciseEver(){

        System.out.println("*");
    }

    public static void drawHorizontalLine(int numberOfIterations){

        for (int i = 0; i < numberOfIterations; i++) {
            System.out.print("*");
        }
    }

    public static void drawVerticalLine(int numberOfIterations){

        for (int i = 0; i < numberOfIterations; i++) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of iterations: ");
        Scanner scanner = new Scanner(System.in);
        String numberOfIterations = scanner.nextLine();

        drawVerticalLine(Integer.valueOf(numberOfIterations));
        drawHorizontalLine(Integer.valueOf(numberOfIterations));

    }
}
