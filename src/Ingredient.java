public class Ingredient {
    // private so we need getters and setters
    private double hoeveelheid;
    private String eenheid;
    private String naam;


    public Ingredient(double hoeveelheid, String eenheid, String naam) {
        this.hoeveelheid = hoeveelheid;
        this.eenheid = eenheid;
        this.naam = naam;
    } // closing method Ingredient

    // getters and setters
    public double getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(double hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public String getEenheid() {
        return eenheid;
    }

    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

} //closing class Ingredient
