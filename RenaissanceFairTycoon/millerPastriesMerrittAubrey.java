public class millerPastriesMerrittAubrey extends FoodStallMerrittAubrey implements ChildFriendlyMerrittAubrey {
    String Name = "Miller's Pastries";
    String[] treats = {"Cotton Candy", "Caramel Apples", "Cinnamon Roasted Almonds", "Cannoli"};

    public String getName() {
        return Name;
    }
    @Override
    public String toString() {
        return Name;
    }
}