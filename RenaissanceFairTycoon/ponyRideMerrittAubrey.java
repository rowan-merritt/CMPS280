public class ponyRideMerrittAubrey extends RideMerrittAubrey implements ChildFriendlyMerrittAubrey, ChildOnlyMerrittAubrey {
    String Name = "Pegasus Pony Rides";

    @Override
    public String toString() {
        return Name;
    }
    public String getName() {
        return Name;
    }
}
