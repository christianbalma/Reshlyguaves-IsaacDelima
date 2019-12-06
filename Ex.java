package projectsadiscrete;
import java.util.*;
public class Ex extends ProjectSaDiscrete{    
	
	public static void exit(){
		
		ProjectSaDiscrete mamamo = new ProjectSaDiscrete();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                                            ");
		System.out.println("--------------------------------------------");
		System.out.println("              1 = YES");
		System.out.println("              2 = NO");
                System.out.println("         **************************         ");
		System.out.println("         *DO YOU WANT TO CONTINUE?*         ");
                System.out.println("         **************************         ");
                int c = In.nextInt();
		
		if (c == 1){
			
			mamamo.main(null);
			
		}
		
		else if(c == 2 ){
			System.out.println("------------");
			System.out.println("-THANK YOU!-");
			System.out.println("------------");
		}
		
		else{
			System.out.println("***************");
			System.out.println("*INVALID INPUT*");
			System.out.println("***************");
                        exit();
		}

	}

	public static void display1(){
		
		Scanner In = new Scanner(System.in);
		
		System.out.println("                                                    ");
		System.out.println("----------------------------------------------------");
		System.out.println("        ---PERUTATIONS AND COMBINATIONS---          ");
		System.out.println("----------------------------------------------------");
                System.out.println("       1 = PERMUTATIONS WTHOUT REPETITIONS          ");
		System.out.println("       2 = PERMUTATIONS WITH REPETITIONS            ");
		System.out.println("       3 = COMINATIONS WITHOUT REPETITIONS          ");
		System.out.println("       4 = COMBINATIONS WITH REPETITIONS            ");
		System.out.println("                                                    ");
                System.out.println("                ********************                ");
		System.out.println("                *ENTER YOUR CHOICE:*                ");
                System.out.println("                ********************                ");
                int pilian = In.nextInt();
		PermutationWORep choice = new PermutationWORep();
		PermutationWithRep choice2 = new PermutationWithRep();
		CombinationWORep choice3 = new CombinationWORep();
		CombinationWithRep choice4 = new CombinationWithRep();
		
		if (pilian == 1){
			
			choice.Mei();
			exit();
			
		}
		
		else if (pilian == 2){
			
			choice2.Mei();
			exit();
			
		}
		
		else if (pilian == 3){
			
			choice3.FRANCINE();
			exit();
			
		}
		
		else if (pilian == 4){
			
			choice4.FRANCINE();
			exit();
			
		}
		
		else{
                        System.out.println("***************");			
			System.out.println("*INVALID INPUT*");
                        System.out.println("***************");
			exit();
			
		}
	}
		
}
	
	
