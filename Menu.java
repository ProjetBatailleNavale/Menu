package console;
import java.util.Scanner;
import static java.lang.System.exit;
public class Menu {
	
	public static void main(String[] args) {
		int userChoix;
		
		do {
			userChoix = Smenu();
			switch(userChoix){
			case 1: 
				System.out.println("Jouer la partie a été choisi"); 
			break;
			
            case 2: 
            	System.out.println("Charger la partie a été choisi");
            	
            break;
            
            case 3: 
            	System.out.println("Aide a été choisi");
            break;
            
            default:
            	exit (0);
            	break;

			}
			
		}
		while (userChoix < 4); 
		
	}
	
	public static int Smenu() 
	 {
		int elements;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisir une option:");
		System.out.println("\n");
        System.out.println("-Jouer la partie");
        System.out.println("-Charger la partie ");
        System.out.println("-Aide ");
        System.out.println("-Quitter ");
        System.out.println("\n");
        
        System.out.println("Ton choix est:");
        elements = scanner.nextInt() ;
        return elements;
        
	}
	

} 

 
