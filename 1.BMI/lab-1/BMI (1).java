import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        System.out.println("\t\t\tWelcome!");

        Scanner input = new Scanner(System.in);
        double result, mass, height;


            int i = 1;

            while (i != 2) {
                System.out.print("Input your weight in kg:");
                mass = input.nextDouble();
                System.out.print("Input your height in m:");
                height = input.nextDouble();
                if (mass > 0 && height > 0) {
                    result = mass / height*height;
                    System.out.println("Your BMI is:" + result);

                } else {
                    System.out.print("Please input correctly!\n");
                }
            }
        }
    }
    /*
    FAYYOZ NAIMOV
    U1910071*/


