/*
 * Lab assignment 4

 * Team leader : Loc Villaum 201632588
 * Programmer A : haeyong 201120268
 * Programmer B : dongjoo 201120287
 * 
 * github repository : https://github.com/Sonicvi/Lab4.git
 */
public class Calculator {
	public double add(double x,double y){
		return x+y;
	}
	public double substract(double x,double y){
		return x-y;
	}
	public double multiply(double x,double y){
		return x*y;
	}
	public double divide(double x,double y){
		
		if(x == 0)
			return 0;
		
		else if(y == 0){
			 System.out.println("Can't divide by zero");
			return 0;
		}
		else
			return x/y;
	}
	public int remainder(int x,int y){
		
		return (x%y);
		
	}
	
	
	public String toString(){
		System.out.println("Leader name : sonicvi");
		System.out.println("Leader ID : 201632588");
		System.out.println("Programmer A name : haeyong");
		System.out.println("Programmer A's ID : 201120268");
		System.out.println("Programmer A name : dongjoo");
		System.out.println("Programmer B's ID : 201120287");
		System.out.println("https://github.com/Sonicvi/Lab4.git");
		return "";
	}
}

