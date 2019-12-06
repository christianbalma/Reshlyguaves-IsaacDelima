package projectsadiscrete;
import java.math.*;
import java.util.Scanner;
public class PermutationWithRep extends Ex  {
public static BigInteger PermutationWithoutRepetition(long en, long ar){
		
		BigInteger layla = new BigInteger("1");
		while(ar != 0){
			
			layla = layla.multiply(BigInteger.valueOf(en)) ;
			System.out.println(layla);
			ar --;
		}
                System.out.println("                ---                          ");
		System.out.println("         -----*RESULT*------                 ");
		System.out.println("                ---                          ");
		return layla;
	}
	public static void exit(){
		
		ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner lee = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("-----------------------------------");
		System.out.println("     ---END OF THE PROGRAM---      ");
                System.out.println("-----------------------------------");
		System.out.println("1 = YES");
		System.out.println("2 = NO");
                System.out.println("**************************************");
		System.out.println("*DO YOU WANT TO CONTINUE THE PROGRAM?*"); 
                System.out.println("**************************************");
                int c = lee.nextInt();
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
		
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("         --WELCOME TO PERMUTATIONS WITH REPETITIONS--          ");
                System.out.println("---------------------------------------------------------------");
		
		System.out.print("                ENTER A NUMBER FOR THE VALUE OF N:               ");
                long en = lee.nextLong();
		System.out.print("                ENTER A VALUE FOR THE VALUE OF R:                ");
                long ar = lee.nextLong();
		
		if(ar < 0 || en < 0 ){
			System.out.println("**********************************");
			System.out.println("*PLEASE DO ENTER A NEGETIVE VALUE*");
                        System.out.println("**********************************");
			exit();
			
		}
		
		else if(ar > 500 || en > 500){
		System.out.println("*******************************************************");
		System.out.println("*INVALID PLEASE DO NOT ENTER A NUMBER GREATER THAN 500*");
                System.out.println("*******************************************************");	
			exit();
			
		}
		
		else{
			
			System.out.println("                                                   ");

			System.out.println("---------------------------------------------------");
			
			System.out.println(" "+ en +" P "+ ar +" WITH REPETTION IS "+PermutationWithoutRepetition(en, ar));
			exit();
			
		}	
		
	}
}


