import java.util.Scanner;

public class FahrenheitToCelcius {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a degree  Changed in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    double Celcius = (5.0/9)*(fahrenheit-32);
    System.out.println("Fahrenheit "+ fahrenheit +" is "+ Celcius+" in Celcius ");
  }
}    
