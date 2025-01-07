import java.util.Scanner;
class CelsiusToFahrenheit
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Temperature In Celsius : ");
   double celsius=sc.nextDouble();
   double fahrenheit= (celsius * 9/5) + 32;
   System.out.println("Temperature In Fahrenheit Is = "+fahrenheit);
  }
}