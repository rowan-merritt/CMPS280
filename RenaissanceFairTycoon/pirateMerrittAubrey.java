public class pirateMerrittAubrey extends AttractionMerrittAubrey implements ChildFriendlyMerrittAubrey {
    String Name = "Pirate Academy";

    @Override
    public String toString() {
        return Name;
    }
    public String getName() {
        return Name;
    }
}