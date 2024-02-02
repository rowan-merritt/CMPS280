import java.util.ArrayList;
public class AmusementParkMerrittAubrey {
    String name;
    String cf[];
    
    ArrayList<RideMerrittAubrey> ride = new ArrayList<RideMerrittAubrey>();
    ArrayList<FoodStallMerrittAubrey> foodStall = new ArrayList<FoodStallMerrittAubrey>();
    ArrayList<AttractionMerrittAubrey> attraction = new ArrayList<AttractionMerrittAubrey>();
    ArrayList<ChildFriendlyMerrittAubrey> ChildFriendly = new ArrayList<ChildFriendlyMerrittAubrey>();
    // attractions
    forgeMerrittAubrey forge = new forgeMerrittAubrey();
    catapultsMerrittAubrey catapult = new catapultsMerrittAubrey();
    cannonMerrittAubrey cannon = new cannonMerrittAubrey();
    pirateMerrittAubrey pirate = new pirateMerrittAubrey();
    // food stalls
    eastIndiaTradingCompanyMerrittAubrey tea = new eastIndiaTradingCompanyMerrittAubrey();
    kingsHeadTravenMerrittAubrey traven = new kingsHeadTravenMerrittAubrey();
    millerPastriesMerrittAubrey pastries = new millerPastriesMerrittAubrey();
    kingsHeadKitchenMerrittAubrey kitchen = new kingsHeadKitchenMerrittAubrey();
    
    // rides
    warhorseRidesMerrittAubrey war = new warhorseRidesMerrittAubrey();
    ponyRideMerrittAubrey pony = new ponyRideMerrittAubrey();
    swordChallengeMerrittAubrey sword = new swordChallengeMerrittAubrey();
    barrelOfBedlamMerrittAubrey barrel = new barrelOfBedlamMerrittAubrey();
    
    public void addRide(RideMerrittAubrey s){
        ride.add(s);
    }
    public void addAttraction(AttractionMerrittAubrey s){
        attraction.add(s);
    }
    public void addFoodStall(FoodStallMerrittAubrey s){
        foodStall.add(s);
    }
    public void addChildFriendly(ChildFriendlyMerrittAubrey cf){
        ChildFriendly.add(cf);
    }

    // getting some names
    public String getName(RideMerrittAubrey s){
        return s.getName();
    }
    public String getName(AttractionMerrittAubrey s){
        return s.getName();
    }
    public String getName(FoodStallMerrittAubrey s){
        return s.getName();
    }

    
    public AmusementParkMerrittAubrey(){}

    // Create an amusement park
    public AmusementParkMerrittAubrey(String name){
        System.out.println("Welcome to " + name + "!");
        if (name.equals("Louisiana Renaissance Faire")){
            addFoodStall(pastries);
            addFoodStall(tea);
            addFoodStall(traven);
            addAttraction(catapult);
            addAttraction(pirate);
            addAttraction(cannon);
            addRide(barrel);
            addRide(sword);
            addRide(pony);
        }
        else if (name.equals("New York Renaissance Faire")){
            addFoodStall(kitchen);
            addFoodStall(pastries);
            addFoodStall(traven);
            addAttraction(cannon);
            addAttraction(catapult);
            addAttraction(forge);
            addRide(war);
            addRide(pony);
            addRide(barrel);
        }
        else if (name.equals("Bristol Renaissance Faire")){
            addFoodStall(traven);
            addFoodStall(tea);
            addFoodStall(kitchen);
            addAttraction(pirate);
            addAttraction(forge);
            addAttraction(cannon);
            addRide(war);
            addRide(sword);
            addRide(barrel);
        }
    }

    // String representation of this object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nExperience the thrills of ");
        for (int i = 0; i < ride.size(); i++){
            if (ride.get(i) == ride.get(0)) {
                sb.append(getName(ride.get(i)));
            }
            else if (i < ride.size() - 1) {
                sb.append(", " + getName(ride.get(i)));
            }
            else if (i == ride.size() - 1) {
                sb.append(", and " + getName(ride.get(i)));
            }
        }
        sb.append(" while you immerse yourself in the lively amosphere of the faire. Stroll through the marketplace, where you'll find " );
        for (int i = 0; i < foodStall.size(); i++){
            if (foodStall.get(i) == foodStall.get(0)) {
                sb.append(getName(foodStall.get(i)));
            }
            else if (i < foodStall.size() - 1) {
                sb.append(", " + getName(foodStall.get(i)));
            }
            else if (i == foodStall.size() - 1) {
                sb.append(", and " + getName(foodStall.get(i)));
            }
        }
        sb.append(". Take part in the festivities with our ");
        for (int i = 0; i < attraction.size(); i++){
            if (attraction.get(i) == attraction.get(0)) {
                sb.append(getName(attraction.get(i)));
            }
            else if (i < attraction.size() - 1) {
                sb.append(", " + getName(attraction.get(i)));
            }
            else if (i == attraction.size() - 1) {
                sb.append(", and " + getName(attraction.get(i)));
            }
        }
        // Child friendly message
        sb.append(". Children are welcome at our ");

        for (int i = 0; i < ride.size(); i++) {
            if (ride.get(i)  instanceof ChildFriendlyMerrittAubrey) {
                sb.append(getName(ride.get(i)));
                sb.append(", ");
            }
        }
        for (int i = 0; i < foodStall.size(); i++) {
            if (foodStall.get(i)  instanceof ChildFriendlyMerrittAubrey) {
                sb.append(getName(foodStall.get(i)));
                sb.append(", ");
            }
        }
        for (int i = 0; i < attraction.size(); i++) {
            if (attraction.get(i) instanceof ChildFriendlyMerrittAubrey) {
                sb.append(getName(attraction.get(i)));
            }
            if ((i < attraction.size() - 1) && (attraction.get(i) instanceof ChildFriendlyMerrittAubrey)) {
                sb.append(", " + getName(attraction.get(i)));
            }
            if ((i == attraction.size() - 1) && (attraction.get(i) instanceof ChildFriendlyMerrittAubrey)) {
                sb.append(", and " + getName(attraction.get(i)));
            }
        }

        return sb.toString();
    }
}