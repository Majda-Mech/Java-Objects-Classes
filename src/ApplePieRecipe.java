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
        Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
        Ingredient kristalSuiker = new Ingredient(75, "gram", "kristalsuiker");
        Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
        Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");



    // printen ingredienten

        public void printIngredients ()
        { // roomboter blijft onbereikbaar tenzij ik de printlns hierondere in de method appelPieRecipe zet, maar dan wordt de methode weer onbereikbaar en wil intelliJ een nwe public static void method toevoegen?
            System.out.println("\nIngredienten:");
            System.out.println(roomboter.getHoeveelheid() + " " + roomboter.getEenheid() + " " + roomboter.getNaam());
            System.out.println(basterSuiker.getHoeveelheid() + " " + basterSuiker.getEenheid() + " " + basterSuiker.getNaam());
            System.out.println(bakmeel.getHoeveelheid() + " " + bakmeel.getEenheid() + " " + bakmeel.getNaam());
            System.out.println(ei.getHoeveelheid() + " " + ei.getEenheid() + " " + ei.getNaam());
            System.out.println(vanillesuiker.getHoeveelheid() + " " + vanillesuiker.getEenheid() + " " + vanillesuiker.getNaam());
            System.out.println(zout.getHoeveelheid() + " " + zout.getEenheid() + " " + zout.getNaam());
            System.out.println(appels.getHoeveelheid() + " " + appels.getEenheid() + " " + appels.getNaam());
            System.out.println(kristalSuiker.getHoeveelheid() + " " + kristalSuiker.getEenheid() + " " + kristalSuiker.getNaam());
            System.out.println(kaneel.getHoeveelheid() + " " + kaneel.getEenheid() + " " + kaneel.getNaam());
            System.out.println(paneermeel.getHoeveelheid() + " " + paneermeel.getEenheid() + " " + paneermeel.getNaam());
        }


    public void printAllSteps() {
//        ApplePieRecipe printingRecipeStepForStep = new ApplePieRecipe();
        ApplePieRecipe.stappen();
        ApplePieRecipe.ovenVoorverwarmen();
        ApplePieRecipe.eiKloppen();
        ApplePieRecipe.mengen();
        ApplePieRecipe.appels();
        ApplePieRecipe.sringvormInvetten();
        ApplePieRecipe.deegInSpringvorm();
        ApplePieRecipe.springvormVullen();
        ApplePieRecipe.strokenVanDeeg();
        ApplePieRecipe.toplaagVanStroken();
        ApplePieRecipe.bakken();
    }



        // printen recept in losse methods zoals omschreven
        public static void stappen () {
            System.out.println("\nStappen:");
        }

        public static void ovenVoorverwarmen () {
            System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        }

        public static void eiKloppen () {
            System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        }

        public static void mengen () {
            System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        }

        public static void appels () {
            System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        }

        public void sringvormInvetten () {
            System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
        }

        public void deegInSpringvorm () {
            System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        }

        public void springvormVullen () {
            System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        }

        public void strokenVanDeeg () {
            System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        }

        public void toplaagVanStroken () {
            System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        }

        public void bakken () {
            System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
        }


} // closing class ApplePieRecipe
