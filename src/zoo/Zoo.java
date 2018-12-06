package zoo;

import java.util.Scanner;

/**
 *
 * @author mmireles5341
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Bob =  new Scanner(System.in);
        int choice;
        String SectionChoice = "What section would you like to see first?\n" 
                + "1: Fire Nation"
                + "2: Water Tribe"
                + "3: Air Nomads";
        String FireNation = "Welcome to the Fire Nation! INSERT SUPERCLASS INFO. What would you like to see next?"
                + "1: Fiery Ye"
                + "2: Tinder Malone"
                + "3: Quablaze";
        String WaterTribe = "Weclome to the Water Tribe! INSERT SUPERCLASS INFO What would you like to see next?"
                + "1: Kim Karsplashian"
                + "2: Klocean Kardashian"
                + "3: Kris H20 Jenner";
         String AirNomads = "Welcome to the Air Nomads! INSERT SUPERCLASS INFO What would you like to see next?"
                + "1: Bob Mairley"
                + "2: Wiz Khaflya"
                + "3: Waka Flocka Flame";
        System.out.println(SectionChoice);
        choice = Bob.nextInt();
        switch(choice){
            case 1: System.out.println(FireNation);
                        //CONTINUE BUT INSERT BACKWARDS OPTION
                   break;
            case 2: System.out.println(WaterTribe);
                   break;
            case 3: System.out.println(AirNomads);
                   break;
            default: System.out.println("Please retry");
                   break;
                   
        }
    }
    
}
