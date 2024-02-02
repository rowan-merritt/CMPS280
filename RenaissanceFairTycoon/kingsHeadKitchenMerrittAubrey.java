public class kingsHeadKitchenMerrittAubrey extends FoodStallMerrittAubrey implements ChildFriendlyMerrittAubrey {
    String Name = "Kings Head Kitchen";
    String[] food = {"Leg of mutton", "Jester's Chips", "Chicken Tenders", "Hamburger", "Hotdog", "Subs"};
    String[] drinks = {"Lemonade"};
    String[] treats = {"Brownies", "Funnel Cake"};
    public String getName() {
        return Name;
    }
    @Override
    public String toString() {
        return Name;
    }
}
