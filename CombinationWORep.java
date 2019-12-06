
package projectsadiscrete;
import java.math.*;
import java.util.Scanner;
public class CombinationWORep extends Ex{   
public static BigInteger CombinationWithoutRepetition(long en,long ar){
    
		BigInteger layla = new BigInteger("1");
		BigInteger tank = new BigInteger("1");
		BigInteger choox = new BigInteger("1");
		BigInteger batangpasaway;
		long c = en - ar;
		BigInteger miya;
                System.out.println("                ---                                   ");
		System.out.println("         -----*RESULT*------                          ");
		System.out.println("               ------                                 ");
		for(long i = 1;i<=en;i++){
			
			layla =layla.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                       ");
		System.out.println("THE FACTORIAL OF "+ en + " IS "+layla);
		
		for(long i = 1;i<=ar;i++){
			
			tank = tank.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("                                   ");
		System.out.println("THE FACTORIAL "+ ar + " IS " + tank );
		for(long i=1 ; i<=c ; i++ ){	
			choox = choox.multiply(BigInteger.valueOf(i));
		}
		
                System.out.println("                                   ");
		
                System.out.println("THE N - R FACTORIAL IS "+ choox);
		
                System.out.println("                                   ");
		
                miya = tank.multiply(choox);
		
                batangpasaway = layla.divide(miya);
		
                return batangpasaway;
	
	}
	
	public static void exit(){
		
		ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner In = new Scanner(System.in);
		
                System.out.println("                                          ");
		
                System.out.println("---------------------------------------");
                System.out.println("        ----END THE PROGRAM-----       ");
		System.out.println("---------------------------------------");
                System.out.println("              1 = YES                  ");
		System.out.println("              2 = NO                   ");
		System.out.println("       **************************      ");
                System.out.println("       *DO YOU WANT TO CONTINUE?*      ");
                System.out.println("       **************************      ");
                int c = In.nextInt();
		
                if (c == 1){
			mamamo.main(null);
		}
		else{
                    System.out.println("-----------");
                    System.out.println("-THANK YOU-");	
                    System.out.println("-----------");
                }
	}
	public static void FRANCINE(){
		
		Scanner lee = new Scanner(System.in);
		
		
		System.out.println("                                                                         ");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("      ------WELCOME TO COMBINATION WITHOUT REPETITION------              ");
		System.out.println("-------------------------------------------------------------------------");
                System.out.print("                ENTER A NUMBER FOR THE VALUE OF 'N':                       ");
                long en = lee.nextLong();
		System.out.print("                ENTER A NUMBER FOR THE VALUE OF 'R':                       ");
                long ar = lee.nextLong();
		
		if(ar < 0 || en < 0 ){
                System.out.println("**************************************");
		System.out.println("*PLEASE DO NOT ENTER A NEGATIVE VALUE*");
		System.out.println("**************************************");	
                exit();	
		}
		else if(ar > en){ 
		System.out.println("********************************************************************");
		System.out.println("*THE VALUE OF 'R'  SHOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'*");
		System.out.println("********************************************************************");	
                exit();
			
		}
		
		else if(ar > 500 || en > 500){
		System.out.println("*******************************************************");
		System.out.println("*INVALID PLEASE DO NOT ENTER A NUMBER GREATER THAN 500*");
                System.out.println("*******************************************************");			
                exit();
			
		}

		else{
			
		System.out.println("                                                             ");
		System.out.println("-------------------------------------------------------------");
		System.out.println(" "+ en + " C " + ar +" IS "+CombinationWithoutRepetition(en, ar));
			exit();
			
		}
		
	}
}
