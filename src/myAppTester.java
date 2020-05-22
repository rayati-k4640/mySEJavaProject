/**
 * 
 */

/**
 * @author KimiaR
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Hello Software Engineering World");
         System.out.println("The nested loop pattern");
         /**
          * Git is on branch b1
          * from now on until switching out of branch b1
          * any changes occur will be tracked in branch b1
          * is merged later with that branch
          */
         for(int i = 0 ; i < 7 ; i++) 
         {
        	 for (int j = 0 ; j < 7 ; j++) 
        	 {
        		 
        		 if (j ==6-i || j==i ) 
        			 System.out.print("*");
        		 else
        			 System.out.print(" ");
        	 }
             System.out.println();
         }

	}

}
