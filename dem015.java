
import java.util.Scanner;

public class dem015 {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        double fahrenheit;

        System.out.println("Enter a degree in Fahrenheit:");

        fahrenheit = sc.nextDouble();

        float celsius = (float) ((fahrenheit - 32) * (5.0 / 9));

        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " celsius");

    }

}
