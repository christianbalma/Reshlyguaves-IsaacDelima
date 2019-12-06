package projectsadiscrete;
import java.util.*;
import java.math.BigInteger;
public class CombinationWithRep extends Ex{
	
	public static BigInteger CombinationWithRepetition(long en,long ar){
		
		long miya = en + ar -1;
		BigInteger kufra = new BigInteger("1");
		long layla = en - 1;
		BigInteger minotaur = new BigInteger("1");
		BigInteger uranus = new BigInteger("1");
		BigInteger akai = new BigInteger("0");
		BigInteger tigreal = new BigInteger("0");
                System.out.println("                                         ");
                System.out.println("                ---                      ");
		System.out.println("         -----*RESULT---                 ");
		System.out.println("                ---                      ");
	
		for(long i = 1; i <= miya; i++){
	 
			kufra = kufra.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                     ");
		System.out.println("THE FACTORIAL OF (N + R - 1) IS "+ kufra);
		for(long i = 1; i <=ar ; i++){
			
			uranus = uranus.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                     ");
		System.out.println("THE FACTORIAL OF 'R' IS "+ uranus);

		for(long i = 1 ;i <= layla; i++){ 
			
			minotaur = minotaur.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("                                     ");
		System.out.println("THE FACTORIAL OF (N - 1) IS : "+ minotaur);
		System.out.println("                                     ");
		akai = uranus.multiply(minotaur);
		System.out.println("THE ANSWER IN R!(N-1)! IS "+akai);
		tigreal = kufra.divide(akai);
		
		return tigreal;
		
	}
	public static void exit(){
		
		ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                                                ");
		System.out.println("------------------------------------------------");
		System.out.println("          -----END OF THE PROGRAM------         ");
                System.out.println("------------------------------------------------");
                System.out.println("                  1 = YES");
		System.out.println("                  2 = NO");
                System.out.println("         **************************");
		System.out.println("         *DO YOU WANT TO CONTINUE?*");
                System.out.println("         **************************");
                
                int Niki = In.nextInt();
                
		if (Niki == 1){
			
			mamamo.main(null);
		}
		else{
                    System.out.println("***********");
		    System.out.println("*THANK YOU*");
		    System.out.println("***********");
		}

	}
	public static void FRANCINE(){
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("                                                      ");
		System.out.println("------------------------------------------------------");
		System.out.println("      --COMBINATIONS WITH  REPETITIONS--              ");
                System.out.println("------------------------------------------------------");
                System.out.println("                                                      ");
		System.out.println("       ENTER A NUMBER FOR THE VALUE OF 'N':");
                long en = lee.nextLong();
		System.out.println("       ENTER A NUMBER FOR THE VALUE OF 'R':");
                long ar = lee.nextLong();
		if(ar < 0 || en < 0 ){
                    System.out.println("*************************************");
                    System.out.println("*PLEASE DO NOT ENTER ANEGATIVE VALUE*");
                    System.out.println("*************************************");
			exit();	
		}		
		else if(ar > 500 || en > 500){
                        System.out.println("******************************************************");
			System.out.println("*INVALID INPUT DO NOT ENTER A NUMBER GREATER THAN 500*");
			System.out.println("******************************************************");
                        exit();	
		}
		else{
			System.out.println("                                                                        ");
			System.out.println("------------------------------------------------------------------------");
			System.out.println(" "+ en +" C "+ ar +" WITH REPETITION IS "+CombinationWithRepetition(en, ar));
			exit();
		}		
	}
}
