import java.util.Random;
import java.util.Arrays;

public class myarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]  a = new int[10];
         Random rand=new Random();
         
         for(int x=0; x<a.length;x++){
        	 a[x]=rand.nextInt(100);
        	 System.out.println("a["+x+"]:"+a[x]);
        	 
         }
         Arrays.sort(a);
         System.out.println("\n\nArray sorted:\n\n");
         for(int x=0; x<a.length;x++){
        	 
        	 System.out.println("a["+x+"]:"+a[x]);
        	 
         }
         
	}

}
