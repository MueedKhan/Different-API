import java.util.Scanner;

class Calcul{
	void add(double a, double b){
		double res = a + b;
		System.out.println("The sum of the numbers is " + res);
	}
	void sub(double a , double b){
		double res = a - b;
		System.out.println("The substraction of the numbers is " + res);
	}
	void mul(double a, double b){
		double res = a * b;
		System.out.println("The multiplication of the numbers is " + res);
	}
	void div(double a, double b){
		double res = a / b;
		System.out.println("The division of two numbers is " + res);
	}
		public static void main(String[] args) {
		Calcul c = new Calcul();
		System.out.println("Enter your choice");
		System.out.println("Press 1 for Addition\nPress 2 for Substraction\nPress 3 for Multiplication\nPress 4 for Division");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		if (ch > 4) {
			System.out.println("You have enterd wrong choice");
		}
		else{
		System.out.println("You have selected option " + ch);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		double a = sc.nextInt();
		System.out.println("Enter your second number");
		double b = sc.nextInt();
		
		switch (ch) {
			case 1 : 
				c.add(a, b);
				break;
			case 2 :
				c.sub(a, b);
				break;
			case 3 :
				c.mul(a, b);
				break;
			case 4 :
				c.div(a, b);
				break;
			default:
			 	System.out.println("Wrong choice selected"); 
			}
		}
		}
	}
