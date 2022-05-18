package package1;

import java.util.Scanner;

public class Class2 {
 void add(int n1,int n2) {
	int sum =n1+n2;
	System.out.println("sum of two numbers :" + sum);
 }
 public static void main(String[] args) {
	 Class2 class2 = new Class2();
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	class2.add(num1, num2);
	sc.close();
}
}
