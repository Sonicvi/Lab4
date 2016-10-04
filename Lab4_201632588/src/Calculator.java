/*
 * Lab assignment 4
 * Team leader : Lo�c Villaum� 201632588
 * Programmer A :
 * Programmer B : 
 * 
 * github repository : https://github.com/Sonicvi/Lab4.git
 */
public class Calculator {
	public double add(double x,double y){
		return 0;
	}
	public double substract(double x,double y){
		return x-y;
	}
	public double multiply(double x,double y){
		return 0;
	}
	public double divide(double x,double y){
		
		if(x == 0)
			return 0;
		
		else if(y == 0)
			System.out.println("Can't divide by zero");
		else
			return x/y;
	}
	public int remainder(int x,int y){
		
		return (x - (x/y)*y);
		
	}
}
