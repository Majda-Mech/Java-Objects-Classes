public class Ingredient {
    // private so we need getters and setters
    private int amount;
    private String unit;
    private String name;


    public Ingredient(int amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    } // closing method Ingredient


    // getters and setters
    public int getAmount() {
        return amount;
    }

    public void getAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String eenheid) {
        this.unit = eenheid;
    }

    public String getName() {
        return name;
    }

    public void setName(String naam) {
        this.name = naam;
    }

} //closing class Ingredient
