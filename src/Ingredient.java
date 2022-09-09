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

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }


} //closing class Ingredient
