import java.util.Scanner;
class PowerCalculation
{
  public static int  power(int base, int exponent)
   {
    if(exponent==0)
     {
     return 1;
     }
     else
     {
      return base*power(base,exponent-1);
     }
   } 

  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the base : ");
   int base=sc.nextInt();
   System.out.println("Enter the Exponent : ");
   int exponent=sc.nextInt();
   int result=power(base,exponent);
   System.out.println(base + " raised to the power of " + exponent + " is: " + result);
   sc.close();
   }
}