import java.util.Scanner;
class AverageThreeNumber
{
  public static void main(String []args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter three Numbers : ");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   int num3=sc.nextInt();
   double average=(num1+num2+num3)/3;
   System.out.println("Average Of Three Number = "+average);
  }
}