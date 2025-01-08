import java.util.Scanner;
class RectanglePerimeter
{
  public int perimeterRectangle(int length,int width)
   {
   int perimeter=2*(length+width);
   return perimeter;
   } 

  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Length Of Rectangle : ");
   int length=sc.nextInt();
   System.out.println("Enter Width Of Rectangle : ");
   int width=sc.nextInt();
   RectanglePerimeter obj=new RectanglePerimeter();
   int perimeter=obj.perimeterRectangle(length,width);
   System.out.println("Perimeter Of A Rectangle = "+perimeter);
   }
}