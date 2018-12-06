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
                + "\n1: Fire Nation"
                + "\n2: Water Tribe"
                + "\n3: Air Nomads";
        String FireNation = "Welcome to the Super class La Flame!\n" 
                + "\nTheir behaviors consist of: "
                + "\nTheir attributes consist of: "
                + "\nWhat would you like to see next?"
                + "\n1: Fiery Ye"
                + "\n2: Tinder Malone"
                + "\n3: Quablaze";
        String WaterTribe = "Welcome to the Super class Caitswim Jenner !\n"
                +"\nTheir behaviors consist of:"
                +"\nTheir attributes consist of:"
                +"\nWhat would you like to see next?"
                + "\n1: Kim Karsplashian"
                + "\n2: Klocean Kardashian"
                + "\n3: Kris H20 Jenner";
        String AirNomads = "Welcome to the Super class of Snoop Fogg!\n" 
                 +"\nTheir behaviors consist of:"
                 +"\nTheir attributes consist of:"
                +"\nWhat would you like to see next?"
                + "\n1: Bob Mairley"
                + "\n2: Wiz Khaflya"
                + "\n3: Waka Flocka Flame";
        String FieryYe = "";
        String TinderMalone = "";
        String QuaBlaze = "";
        String KimKarspalshian = "";
        String KloceanKardashian = "";
        String KrisH20 = "";
        String BobMairley = "";
        String WizKhaflya = "";
        String WakaFlockFlame = "";
        System.out.println(SectionChoice);
        choice = Bob.nextInt();
        switch(choice){
            case 1: System.out.println(FireNation);
//<<<<<<< HEAD
                        //CONTINUE BUT INSERT BACKWARDS OPTION
//=======
                    choice = Bob.nextInt();
                    switch(choice){
                        case 1: FieryYe.HotHead();
                                FieryYe.EyeColor();
                                FieryYe.UltralightBeams();
                                FieryYe.Food();
                                FieryYe.Attention();
                                FieryYe.WaterCreature();
                                
                        case 2: TinderMalone.Color();
                                TinderMalone.StartFire();
                                TinderMalone.Small();
                                TinderMalone.SpitFire();
                                TinderMalone.Plays();
                                TinderMalone.Hunt();
                                
                        case 3: Quablaze.Yellow();
                                Quablaze.Mammal();
                                Quablaze.Nocturnal();
                                Quablaze.Hunt();
                                Quablaze.Migrate();
                                Quablaze.Sleeps();
                    }
//>>>>>>> origin/master
                   break;
            case 2: System.out.println(WaterTribe);
                    choice = Bob.nextInt();
                    switch(choice){
                        case 1: KimKarsplashian.Respected();
                                KimKarsplashian.Attention();
                                KimKarsplashian.ReallyMoody();
                                KimKarsplashian.Cries();
                                KimKarsplashian.Sleeps();
                                KimKarsplashian.WaterTemp();
                                
                        case 2: KloceanKardashian.Tall();
                                KloceanKardashian.FakeBlonde();
                                KloceanKardashian.Tsunami();
                                KloceanKardashian.Brag();
                                KloceanKardashian.Clothes();
                                KloceanKardashian.Swim();
                                
                        case 3: Krish20Jenner.Hair();
                                Krish20Jenner.Gills();
                                Krish20Jenner.Kids();
                                Krish20Jenner.Meeting();
                                Krish20Jenner.Clothes();
                                Krish20Jenner.Swim();
                    }
                   break;
            case 3: System.out.println(AirNomads);
                     choice = Bob.nextInt();
                     switch(choice){
                        case 1: BobMairley.Jamaica();
                                BobMairley.Hair();
                                BobMairley.Feathers();
                                BobMairley.Fly();
                                BobMairley.Music();
                                BobMairley.StopWind();
                            
                        case 2: WizKhaflya.BreathAir();
                                 WizKhaflya.Color();
                                 WizKhaflya.Diet();
                                 WizKhaflya.Play();
                                 WizKhaflya.Party();
                                 WizKhaflya.Bowling();
                            
                        case 3: WakaFlockaFlame.Friend();
                                WakaFlockaFlame.RedFeathers();
                                WakaFlockaFlame.NoHands();
                                WakaFlockaFlame.Fly();
                                WakaFlockaFlame.Eat();
                                WakaFlockaFlame.Rap();
                            
                    }
                   break;
            default: System.out.println("Please retry");
                   break;
                   
        }
    }
    
}
