import java.util.Scanner;


public class javaDemo2 {

	public static void main(String[] args) {
		// declare variables
		boolean x= true;
		char c='g';
		double num1=4.67;
		double num2=5.55;
		int  num3=99;
		String name1="JohnPaul2";
		String name2="Stringger";
		String name3=name1+name2;
		
     System.out.println("--My first Java program in eclpise--");
     System.out.println("-- first part"+ "--second part--");
     System.out.println("x:"+ x);
     System.out.println("c:"+c);
     System.out.println("num1:"+num1);
     System.out.println("num2:"+num2);
     System.out.println("num3:"+num3);
     System.out.println("name1:"+name1);
     System.out.println("name3:"+name3);
     
     System.out.println("---------\n");
     System.out.println("Inputs text: ");
     
     Scanner scan = new Scanner(System.in);
     String input1 = scan.nextLine();
     String input2 = scan.nextLine();
     
     System.out.println("input1:" +input1);
     System.out.println("input2:" + input2);
     
     System.out.println("Inputs integer: ");
     
     int num5= scan.nextInt();
     int num6= scan.nextInt();
     
     System.out.println("input3:" + num5);
     System.out.println("intput4:" + num6);
     int num7 = num5+num6;
     System.out.println(num5 + " + " + num6 + "=" + num7);
     
     
     
     if (num1 == 3){
     	   System.out.println("num is really  three");
     }else  {
     	
     	System.out.println("num is NOT REALLY three!");
     }
     
	}

}
