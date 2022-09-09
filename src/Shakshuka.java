public class Shakshuka {
    Ingredient ui = new Ingredient(1, "", "middelgrote ui");
    Ingredient knoflook = new Ingredient(4, "tenen", "knoflook");
    Ingredient trostomaten = new Ingredient(5, "", "trostomaten");
    Ingredient tastyTom = new Ingredient(750, "gram", "Tasty Tom trostomaten");
    Ingredient puntprapika = new Ingredient(2, "", "puntpaprika's");
    Ingredient peterselie = new Ingredient(15, "gram", "platte peterselie");
    Ingredient olijfolie = new Ingredient(1, "el", "olijfolie mild");
    Ingredient komijn = new Ingredient(1, "el", "gemalen komijn");
    Ingredient paprikapoeder = new Ingredient(1, "el", "gerookte-paprikapoeder zoet");
    Ingredient chilivlokken = new Ingredient(1, "tl", "chilivlokken");
    Ingredient zout = new Ingredient(1, "tl", "zout");
    Ingredient ei = new Ingredient(4, "", "witte scharreleieren");
    Ingredient platbroden = new Ingredient(4, "", "Libanees platbroden volkoren");

    public Shakshuka() {
    }

    public void printIngredients() { // roomboter blijft onbereikbaar tenzij ik de printlns hierondere in de method appelPieRecipe zet, maar dan wordt de methode weer onbereikbaar en wil intelliJ een nwe public static void method toevoegen?
        System.out.println("\nRECEPT VOOR SHAKSHUKA MET PLATBROOD");
        System.out.println("Bron: https://www.ah.nl/allerhande/recept/R-R1196843/shakshuka-met-platbrood");
        System.out.println("Ingredienten:");
        System.out.println(ui.getAmount() + " " + ui.getUnit() + " " + ui.getName());
        System.out.println(knoflook.getAmount() + " " + knoflook.getUnit() + " " + knoflook.getName());
        System.out.println(trostomaten.getAmount() + " " + trostomaten.getUnit() + " " + trostomaten.getName());
        System.out.println(tastyTom.getAmount() + " " + tastyTom.getUnit() + " " + tastyTom.getName());
        System.out.println(puntprapika.getAmount() + " " + puntprapika.getUnit() + " " + puntprapika.getName());
        System.out.println(peterselie.getAmount() + " " + peterselie.getUnit() + " " + peterselie.getName());
        System.out.println(olijfolie.getAmount() + " " + olijfolie.getUnit() + " " + olijfolie.getName());
        System.out.println(komijn.getAmount() + " " + komijn.getUnit() + " " + komijn.getName());
        System.out.println(paprikapoeder.getAmount() + " " + paprikapoeder.getUnit() + " " + paprikapoeder.getName());
        System.out.println(chilivlokken.getAmount() + " " + chilivlokken.getUnit() + " " + chilivlokken.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(platbroden.getAmount() + " " + platbroden.getUnit() + " " + platbroden.getName());
    }

    public void printAllSteps() {
        System.out.println("\nStappen:\n" + "1: " +
                "Snipper de ui. Snijd de tenen knoflook fijn en snijd alle tomaten in kleine blokjes van 2 cm. Verwijder de steelaanzet van de paprika’s, snijd in de lengte doormidden en verwijder de zaadlijsten. Snijd het vruchtvlees in blokjes van ca. 2 cm. Snijd de peterselie grof.\n" +
                "2: " +
                "Verwarm de olie in een pan op middelhoog vuur. Fruit de ui en knoflook 3 min. onder regelmatig omscheppen. Voeg de paprika’s en tomaten toe en bak 5 min. op middelhoog vuur mee. Voeg de gemalen komijn, paprikapoeder en chili vlokken toe en breng op smaak met peper en het zout. Breng aan de kook en laat 10 min. zacht koken. Verwarm de oven voor op 200 °C.\n" +
                "3: " +
                "Maak een kuiltje in het tomatenmengsel met de achterkant van een lepel en breek er voorzichtig een ei boven. Herhaal dit met de rest van de eieren. Bestrooi elk ei licht met peper. Leg een deksel op de pan en laat het mengsel 5-8 min. koken op hoog vuur, tot het eiwit net is gestold.\n" +
                "4: " +
                "Verwarm de platbroden volgens de aanwijzingen op de verpakking. Serveer de shakshuka met de peterselie en het brood.Lekker met hummus.");

    }

}
