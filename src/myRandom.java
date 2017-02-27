import java.util.Random;


public class myRandom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
 Random r1 = new Random();
 Random r2= new Random();
 
 int n1;
 int n2;	

 for(int x=0; x<20; x++){
	 n1 = r1.nextInt(50)+1;
	 n2 = r1.nextInt(50)+1;
	 System.out.print(" "+n1+" ");
	 System.out.print(" <"+n2+">\n");
 }
	
	}
	
}
