public class eastIndiaTradingCompanyMerrittAubrey extends FoodStallMerrittAubrey implements ChildFriendlyMerrittAubrey  {
    String Name = "East India Trading Company";
    String[] wares = {"Loose leaf tea" , "Bagged tea" , "Hot tea", "Cold tea"};
    String[] food = {"Fresh scones"};

    public String[] getWares(String[] wares){
        return wares;
    }
    public String getName() {
        return Name;
    }
    @Override
    public String toString() {
        return Name;
    }
}