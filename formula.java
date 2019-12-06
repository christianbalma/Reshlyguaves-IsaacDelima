
package projectsadiscrete;
import java.util.*;
import java.math.*;
public class formula extends ProjectSaDiscrete {
    
	public static BigInteger TagapagLoopNiStarla(long en,long ar){
		
		long var = ar;
		long charot = ar;
                //this is for the factorials
		BigInteger dexie = new BigInteger("1");
                //the lastprocess of the program 
		BigInteger diaz = new BigInteger("0");
                //final
		BigInteger Finale = new BigInteger("0");
                //semifinal charot
		BigInteger semis = new BigInteger("0");
                
		BigInteger nikita = new BigInteger("-1");
		
                for(int Sub = 0;Sub<ar;Sub++){
			
			Finale=Finale.add(S(en,ar,Sub,var));
			
			var--;
		}
		
		System.out.println("THE SUMOF ALL NUMBERS "+Finale);
		
		for(int i = 1;i<=charot;i++){
					
			dexie = dexie.multiply(BigInteger.valueOf(i));
					
		}
		System.out.println("THE FACTORIAL OF "+ar+" IS "+dexie);
		diaz=Finale.divide(dexie);
		if (diaz.compareTo(semis) < 0){			
			diaz = diaz.multiply(nikita);
			return diaz;
		}
		else{
			return diaz;
			
		}
	}
	

	public static BigInteger S(long enn, long arr,long Sub,long Temp1){
		long mia = enn;
		
		long lana = Sub; 
		
		long riley = arr;
		long solazola = 0;
		
		
		long rae = arr;
		long Jennie = 0;
		long meow = rae - Sub;
		
		
		int mage = 1;
		int Multi = -1;
		BigInteger Finals = new BigInteger("0");
		
		BigInteger MarksMan = new BigInteger("1");
		BigInteger Fighter = new BigInteger("1");
		BigInteger LaylaTank = new BigInteger("1");
		BigInteger support;
		long Casey = riley - Sub;
		BigInteger cancer;
		
		
		BigInteger Magsasaka = new BigInteger("1");
		
		
		BigInteger F1 = new BigInteger("0");
		BigInteger F2 = new BigInteger("0");
		BigInteger F3 = new BigInteger("0");
		System.out.println("                ---                                   ");
		System.out.println("         -----*RESULT*------                          ");
		System.out.println("               ------                                 ");
	
				for(;lana<=arr;lana++){
					mage *= Multi;		
				}
				
				System.out.println("THE VALUE FOR (-1)^i IS: "+ mage);
			
				for(long i = 1;i<=riley;i++){
					
					MarksMan = MarksMan.multiply(BigInteger.valueOf(i));
					
				};
				
				for(long i = 1;i<=Sub;i++){
					
					Fighter = Fighter.multiply(BigInteger.valueOf(i));
					
				}
				
				for(long i=1 ; i<=Casey ; i++ ){
					
					LaylaTank = LaylaTank.multiply(BigInteger.valueOf(i));
					
				}
				
				cancer = Fighter.multiply(LaylaTank);

				
				support = MarksMan.divide(cancer);
				
				while(enn != 0){
					
					Magsasaka = Magsasaka.multiply(BigInteger.valueOf(meow));
					
					enn--;
					
				}
				
				F1 = support.multiply(BigInteger.valueOf(mage));
				F2 = F1.multiply(Magsasaka);
				
				
				System.out.println(riley+"C"+Sub+" IS: "+support);
				System.out.println(rae+" - "+Sub+" = "+ meow );
				System.out.println("("+ meow +")^" +mia+" IS: "+Magsasaka);
				System.out.println("FOR "+Sub+" LOOP IS : "+F2);
				return F2;
	}	

	public static void exit(){
		
		
		Scanner Meilee = new Scanner(System.in);
		System.out.println("                                          ");
		System.out.println("------------------------------------------");
		System.out.println("           --END OF THE PROGRAM--         ");
                System.out.println("------------------------------------------");
		
                System.out.println("               1 = YES");
		System.out.println("               2 = NO");
                
                System.out.print("         **************************");
		System.out.print("         *DO YOU WANT TO CONTINUE?*"); 
                System.out.print("         **************************");
                int c = Meilee.nextInt();
		if (c == 1){
			
			main(null);
		}
		else{
                System.out.println("-----------");
		System.out.println("-THANK YOU-");	
		System.out.println("-----------");
                }
	}
	
	public static void Starlaaa() {
		Scanner In = new Scanner(System.in);		
 		System.out.println("                                                           ");
 
		System.out.println("-----------------------------------------------------------");
		System.out.println("      --WELCOME TO STELING OF A SECOND CASE--              ");
                System.out.println("-----------------------------------------------------------");
                System.out.println("                                                           ");
		System.out.print("          ENTER A NUMBER FOR THE VALUE OF 'N':               ");
                long ennn = In.nextLong();
		System.out.print("          ENTER A NUMBER FOR THE VALUE OF 'R':               ");
                long rawr = In.nextLong();
		
		if(rawr < 0 || ennn < 0 ){
			System.out.println("*************************************");
			System.out.println("*PLEASE DO NOT INPUT ANEGATIVE VALUE*");
			System.out.println("*************************************");
                        exit();
			
		}
		
		else if(rawr > ennn){ 
			
			System.out.println("********************************************************************");
			System.out.println("*THE VALUE OF 'R'  SHOULD BE LESS THAN OR EQUAL TO THE VALUE OF 'N'*");
			System.out.println("********************************************************************");
                        exit();
			
		}
		
		else if(rawr > 500 || ennn > 500){
			System.out.println("*****************************************************");
			System.out.println("*INVALID INPUT DONOT ENTER A NUMBER GREATER THAN 500*");
			System.out.println("*****************************************************");
                        exit();
			
		}

		else{
			System.out.println("                                                                          ");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("THE STERLING OF "+ennn+" AND "+rawr+" IS: "+TagapagLoopNiStarla(ennn, rawr));
			exit();
			
		}
		

	}

}