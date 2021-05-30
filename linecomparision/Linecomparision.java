package linecomparision;

import java.util.Scanner;

public class Linecomparision {

	private static final double L2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
				double x1, y1, x2, y2; 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter co-ordinates of First Line : ");
				x1=sc.nextDouble();
				y1=sc.nextDouble();
				x2=sc.nextDouble();
				y2=sc.nextDouble();
				
				double L1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
				System.out.println("L of Line1 : "+L1) ;
				
				System.out.println("Enter co-ordinates of Second Line : ");
				x1=sc.nextDouble();
				y1=sc.nextDouble();
				x2=sc.nextDouble();
				y2=sc.nextDouble();
				
				double Lenght2 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
				System.out.println("L of Line2 : "+Lenght2) ;
				
				if(Double.compare(L1,L2)==0)
				
					System.out.println("Length of Line 1 = Lenght of Line 2");
				else if(Double.compare(L1,L2)<0);{
					System.out.println("Length of Line 1 < Lenght of Line 2");
				}
			
				{
					System.out.println("Length of Line 1 > Lenght of Line 2");
				}
	}

}
