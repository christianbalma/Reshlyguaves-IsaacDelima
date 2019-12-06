
package projectsadiscrete;
import java.util.Scanner;
import java.math.*;
public class PermutationWORep extends Ex{

	public static BigInteger PermutationWithoutRepetition(long N,long R){
		BigInteger layla = new BigInteger("1");
		BigInteger tank = new BigInteger("1");
		BigInteger choox = new BigInteger("0");
		long L = N - R;
		System.out.println("                ---                                   ");
		System.out.println("         -----*RESULTt*------                          ");
		System.out.println("               ------                                 ");
		
		for(long i = 1;i<=N;i++){
			
			layla = layla.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                   ");
		System.out.println("THE FACTORIAL OF "+ N + " IS " + layla);
		
		
		for(long i=1 ; i<=L ; i++ ){
			
			tank = tank.multiply(BigInteger.valueOf(i));
		}
		System.out.println("                                   ");
		System.out.println("THE N - R FACTORIAL IS "+ tank);
		System.out.println("                                   ");
		
		choox = layla.divide(tank);
		return choox;
	
	}
	
	public static void exit(){
		
            ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("------------------------------------");
		System.out.println("            1 = YES");
		System.out.println("            2 = NO ");
                System.out.println("    **************************");
		System.out.println("    *DO YOU WANT TO CONTINUE?*"); 
                System.out.println("    **************************");
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
	public static void Mei(){

		
		Scanner lee = new Scanner(System.in);
		System.out.println("                                                                  ");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("         WELCOME TO PERMUTATIONS WITHOUT REPETITIONS              ");
                System.out.println("                                                                  ");
                System.out.println("------------------------------------------------------------------");
		System.out.print("                ENTER A NUMBER FOR THE VALUE OF N:");
                long en = lee.nextLong();
		System.out.print("                ENTER A NUMBER FOR THE VALUE OF R:");
                long ar = lee.nextLong();
		
		if(ar < 0 || en < 0 ){
			System.out.println("***********************************************");
			System.out.println("*INVALID! PLEASE DO NOT ENTER A NEGATIVE VALUE*");
			System.out.println("***********************************************");
                        exit();
			
		}
		
		else if(ar > 500 || en > 500){
			System.out.println("*************************************************************");
			System.out.println("*INVALID INPUT PLEASE DO NOT ENTER A NUMBER GREATER THAN 500*");
			System.out.println("*************************************************************");
                        exit();
		}
		
		else if(ar > en){ 
			System.out.println("********************************************************************");
			System.out.println("*THE VALUE OF 'R'  SHOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'*");
                        System.out.println("********************************************************************");
			exit();
		}

		else{
			System.out.println("                                                         ");
			System.out.println("---------------------------------------------------------");
			System.out.println(" "+ en +" P "+ar+" IS "+PermutationWithoutRepetition(en, ar));
                        
			exit();
		}
		
	}
}
