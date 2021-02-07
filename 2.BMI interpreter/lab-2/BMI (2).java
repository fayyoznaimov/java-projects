import java.util.Locale;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        int i = 1;
        while (i != 0) {
            System.out.println("\t\t\tWelcome to BMI Calculator!!!\n" +
                    "\t\t\t1)BY kg per m\n" +
                    "\t\t\t2)BY Ib per in\n" +
                    "\t\t\t0)to stop program\n");
            Scanner input = new Scanner(System.in).useLocale(Locale.US);
            int choose = input.nextInt();
            if (choose == 1) {

                System.out.print("Input your weight in kg:");
                double mass;
                mass = input.nextDouble();
                System.out.print("Input your height in m:");
                double height = input.nextDouble();
                if (mass > 0 && height > 0) {

                    double result;
                    result = (mass / (height * height));
                    if (result < 18.5)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are UNDERWEIGHT(:\n");
                    else if (result > 18.5 && result < 24.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are NORMAL:)\n");
                    else if (result > 25 && result < 29.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are OVERWEIGHT(:(:\n");
                    else if (result > 30 && result < 34.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are OBESE(:\n");
                    else if (result > 35)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are EXTREMELY OBESE(:\n");
                } else
                    System.out.print("Please input correctly!\n");


            }
            if (choose == 2) {

                System.out.print("Input your weight in Ib:");
                double mass = input.nextDouble();
                System.out.print("Input your height in in:");
                double height = input.nextDouble();
                if (mass > 0 && height > 0) {

                    double result = (mass / (height * height)) * 703;
                    if (result < 18.5)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are UNDERWEIGHT(:\n");
                    else if (result > 18.5 && result < 24.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are NORMAL:)\n");
                    else if (result > 25 && result < 29.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are OVERWEIGHT(:(:\n");
                    else if (result > 30 && result < 34.9)
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are OBESE(:\n");
                    else
                        System.out.println("Your BMI is:" + result + "\t Conclusion: You are EXTREMELY OBESE(:\n");
                } else
                    System.out.print("Please input correctly!\n");


            }
            if (choose == 0) {
                i = 0;
                System.out.println("BYE\n");
            }
        }
    }
}
    /*
    FAYYOZ NAIMOV
    U1910071*/
