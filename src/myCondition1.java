import java.util.Scanner;


public class myCondition1 {
	public static void main(String[] args){
	
	
    int num1 = 3;
    
    if (num1 == 3){
    	   System.out.println("num is really  three");
    }else  {
    	
    	System.out.println("num is NOT REALLY three!");
    }
    
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Input number: ");
	
	int num2 = scan.nextInt();
	int rem;
	rem = num2%2;
	
	if (rem==0){
		System.out.println("Number is even");
		
	}else if (rem==1){
		System.out.println("number is odd");	
			
	}
			
	
	}
	
}


