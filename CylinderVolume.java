import java.util.Scanner;
class CylinderVolume
{
  public double areaCylinder(double redius,double height)
   {
   double area=Math.PI*Math.pow(redius,2)*height;
   return area;
   } 

  public static void main(String []args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Redius And Height Of Cylinder : ");
   double redius=sc.nextDouble();
   double height=sc.nextDouble();
   CylinderVolume obj=new CylinderVolume();
   double area=obj.areaCylinder(redius,height);
   System.out.println("Volume Of A Cylinder = "+area);
   }
}