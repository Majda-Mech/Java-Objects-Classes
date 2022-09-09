public class ApplePieRecipe {
    // geen variabelen
    // wel een heleboel methodes, zie onder de constructor

    // geen constructor!! las ik een constructor maak, dan herkent ie roomboter.getHoeveelheid niet meer in volgende methode
    // objecten instantieren voor ingredienten
    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient basterSuiker = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1500, "gram", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristalsuiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");


    // printen ingredienten

    public void printIngredients() { // roomboter blijft onbereikbaar tenzij ik de printlns hierondere in de method appelPieRecipe zet, maar dan wordt de methode weer onbereikbaar en wil intelliJ een nwe public static void method toevoegen?
        System.out.println("\nRECEPT VOOR DE HEERLIJKSTE APPELTAART");
        System.out.println("Ingredienten:");
        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
        System.out.println(basterSuiker.getAmount() + " " + basterSuiker.getUnit() + " " + basterSuiker.getName());
        System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
        System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }


    public static void printAllSteps() {
        ApplePieRecipe.steps();
        ApplePieRecipe.warmingOven();
        ApplePieRecipe.eggs();
        ApplePieRecipe.mixing();
        ApplePieRecipe.apples();
        ApplePieRecipe.ButterSpringCakeTin();
        ApplePieRecipe.doughInSpringCakeTin();
        ApplePieRecipe.fillingSpringCakeTin();
        ApplePieRecipe.bandsOfDough();
        ApplePieRecipe.bandsOnFilling();
        ApplePieRecipe.baking();
    }


    // printen recept in losse methods zoals omschreven
    public static void steps() {
        System.out.println("\nStappen:");
    }

    public static void warmingOven() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public static void eggs() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public static void mixing() {
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public static void apples() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public static void ButterSpringCakeTin() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
    }

    public static void doughInSpringCakeTin() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public static void fillingSpringCakeTin() {
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public static void bandsOfDough() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public static void bandsOnFilling() {
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public static void baking() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


} // closing class ApplePieRecipe
