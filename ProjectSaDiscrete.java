
package projectsadiscrete;

import java.util.*;
import java.io.*;

public class ProjectSaDiscrete {

    public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		System.out.println("               ----------               ");	
		System.out.println("             -----CVSU-----             ");
                System.out.println("            ----------------             ");
                System.out.println("             --------------              ");
                System.out.println("               ---MENU---                ");
                System.out.println("                 ------                  ");
                System.out.println("                   --                    ");
                System.out.println("                                         ");
		System.out.println("    1 = COMBINATIONS AND PERMUTATIONS    ");
                System.out.println("    2 = STERLING NUMBER OF SECOND CASE   ");
                System.out.println("    3 = PASCAL TRIANGLE ROW GENERATOR    ");
		System.out.println("                                         ");
                System.out.println("          --------------------           ");                 
                System.out.println("        ----ENTER YOUR CHOICE----        ");
                System.out.println("          --------------------           ");
		try{
			int PiliKa = In.nextInt();
			
			Ex choox = new Ex();
			formula choox2 = new formula();
			PascalTatsulok choox3 = new PascalTatsulok();
			
			if (PiliKa == 1){
				
				choox.display1();	
				
			}
			
			else if(PiliKa == 2){
				
				choox2.Starlaaa();
				
			}
			
			else if(PiliKa == 3){
				
				choox3.Pascal();
				
			}
	
			else{
				System.out.println("***************");
				System.out.println("*INVALID INPUT*");
				System.out.println("***************");
                                main(null);
				
			}
		}catch(Exception e){
			
			System.out.println("*************************************************");
			System.out.println("*THIS PROGRAM IS CREATED FOR ONLY NUMERIC VALUES*");
                        System.out.println("*************************************************");
                        main(null);
			
		}	
		
            }

        }

    
    

