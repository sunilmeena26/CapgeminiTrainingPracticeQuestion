import java.util.Scanner;
class SimpleInterest
{
  public int simpleInterest(int principle,int rate, int time)
   {
   int simpleinterest=(principle*rate*time)/100;
   return simpleinterest;
   } 

  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Priciple : ");
   int principle=sc.nextInt();
   System.out.println("Enter Rate in % : ");
   int rate=sc.nextInt();
   System.out.println("Enter Time In Year : ");
   int time=sc.nextInt();
   SimpleInterest obj=new SimpleInterest();
   int simpleinterest=obj.simpleInterest(principle,rate,time);
   System.out.println("Simple Interest Is = "+simpleinterest);
   }
}