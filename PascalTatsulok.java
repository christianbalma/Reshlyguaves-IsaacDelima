package projectsadiscrete;
import java.math.*;
import java.util.Scanner;
public class PascalTatsulok extends ProjectSaDiscrete{
    
	public static void Tatsulok(long en){
		
		for(int U = 0; U <= en; U++){
			int hate = U;
			System.out.print(" "+Pascal(en,hate) +" ");		
		} 
	}
	public static BigInteger Pascal(long en, long Sub){
		BigInteger hanzo = new BigInteger("1");
		BigInteger jawhead = new BigInteger("1");
		BigInteger nana = new BigInteger("1");
		BigInteger aurora;
		long c = en - Sub;
		BigInteger alice;
		
		for(long i = 1;i<=en;i++){
			
			hanzo = hanzo.multiply(BigInteger.valueOf(i));			
		}

		for(long i = 1;i<=Sub;i++){
			
			jawhead = jawhead.multiply(BigInteger.valueOf(i));	
		}
		
		for(long i=1 ; i<=c ; i++ ){
			
			nana = nana.multiply(BigInteger.valueOf(i));	
		}
		
		alice = jawhead.multiply(nana);
		
		aurora = hanzo.divide(alice);
		
		return aurora;
	}
	public static void exit(){
		
		ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println("           --END OF THE PROGRAM--           ");
                System.out.println("--------------------------------------------");
                System.out.println("                                            ");
		System.out.println("                 1 = YES");
		System.out.println("                 2 = NO ");
                System.out.println("          **************************");
		System.out.println("          *DO YOU WANT TO CONTINUE?*"); 
                System.out.println("          **************************");
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
	public static void Pascal(){
		
		Scanner lee = new Scanner(System.in);
		
		
		System.out.println("                                   ");
		System.out.println("                 -                 ");
		System.out.println("                ---                ");
                System.out.println("               -----              " );
                System.out.println("              -------              ");
                System.out.println("             ---------             ");
                System.out.println("            -----------            ");
                System.out.println("           -------------           ");
                System.out.println("          ---------------          ");
		System.out.println("         -----------------         ");
                System.out.println("        -------------------        ");
                System.out.println("       ---------------------       ");
                System.out.println("      ----PASCAL*TRIANGLE----      ");
                System.out.println("     -------------------------     ");
                System.out.println("    ---------------------------    ");
                System.out.println("   -----------------------------   ");
                System.out.println("  -------------------------------  ");
                System.out.println(" --------------------------------- ");
                System.out.println("-----------------------------------");
                System.out.println("                                   ");
                System.out.println("                                   ");
                
		System.out.print("ENTER HOW MANY ROW/S FOR THE VALUE OF 'N' :");
                long enn = lee.nextLong();
		if( enn < 0 ){
                    System.out.println("*******************************");
                    System.out.println("*DO NOT ENTER A NEGATIVE VALUE*");
		    System.out.println("*******************************");	
                    exit();
		}
		else if(enn > 500){
                    System.out.println("*****************************************************");
                    System.out.println("*INVALID INPUT DO NOT ENTER A VALUR GREATER THAN 500*");
                    System.out.println("*****************************************************");
                    exit();
		}
		else{	
                    System.out.println("                                                 ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("THE ROW "+ enn + " IS: ");
                    Tatsulok(enn);
                    exit();
		}
	}
}
