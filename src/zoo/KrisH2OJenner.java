package zoo;

/**
 *
 * @author mmireles5341
 */
class KrisH2OJenner extends CaitswimJenner {
    private String Color;
    private boolean LivesinWater = true;
    private String Diet;
    private boolean BreatheAir = true;
    
    
    
    public static void BreatheAir()
    {
        System.out.println("I'm a dolphin and I breathe air!");
    }
    
    public void Color()
    {
        System.out.println("MY COLOR IS " + getColor());
    }
    public void Diet()
    { 
        System.out.println("I eat " + getDiet());
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
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the LivesinWater
     */
    public boolean isLivesinWater() {
        return LivesinWater;
    }

    /**
     * @return the Diet
     */
    public String getDiet() {
        return Diet;
    }

    /**
     * @param Diet the Diet to set
     */
    public void setDiet(String Diet) {
        this.Diet = Diet;
    }

    /**
     * @return the BreatheAir
     */
    public boolean isBreatheAir() {
        return BreatheAir;
    }

    
}
