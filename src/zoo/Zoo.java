package zoo;

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
        System.out.println(SectionChoice);
        choice = Bob.nextInt();
        switch(choice){
            case 1:
                   break;
            case 2:
                   break;
            case 3:
                   break;
            default: System.out.println("Please retry");
                   break;
                   
        }
    }
    
}
