import java.util.Scanner;
class CircleArea
{
  public double areaCircle(double redius)
   {
   double area=Math.PI*Math.pow(redius,2);
   return area;
   } 

  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Redius Of Circle : ");
   double redius=sc.nextDouble();
   CircleArea obj=new CircleArea();
   double area=obj.areaCircle(redius);
   System.out.println("Area of a Circle = "+area);
   }
}