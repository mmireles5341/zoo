package zoo;

/**
 *
 * @author mmireles5341
 */
class CaitswimJenner {
    private String EyeColor = "ice blue";
    private boolean BreathinWater = true;
    private boolean RepellentSkin = true;
   
    
    public static void BreatheInWater()
    {
        System.out.println("I'm a dolphin and I breathe air ALL THE TIME!");
    }
    
    public void EyeColor()
    {
        System.out.println("MY EYECOLOR IS " + getEyeColor() + " it's the cooooliest");
    }
    public static void RepellentSkin()
    { 
        System.out.println("My skin repels water... it slides RIGHT OFF!");
    }  
    
    public void Play(){
        System.out.println("I love to play!!!!!! WOOOOOOOOOOO!!!!");
    }
    
    public void Party(){
        System.out.println("I love to PARTAYYY! *dolphin noise*");
    }
    
    public void Bowling(){
        System.out.println("I use the 4lb ball when I go bowling!! *dolphin noise*");
    }

    /**
     * @return the EyeColor
     */
    public String getEyeColor() {
        return EyeColor;
    }

    /**
     * @return the BreathinWater
     */
    public boolean isBreathinWater() {
        return BreathinWater;
    }

    /**
     * @return the RepellentSkin
     */
    public boolean isRepellentSkin() {
        return RepellentSkin;
    }
    
}
