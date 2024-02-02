public class ParkTycoonMerrittAubrey {
    public static void main(String[] args) {
        
        
        /* 
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
        */
        try {
            AmusementParkMerrittAubrey LA = new AmusementParkMerrittAubrey("Louisiana Renaissance Faire");
            System.out.println(LA.toString());
            System.out.println();

            AmusementParkMerrittAubrey NY = new AmusementParkMerrittAubrey("New York Renaissance Faire");
            System.out.println(NY.toString());
            System.out.println();
            
            AmusementParkMerrittAubrey B = new AmusementParkMerrittAubrey("Bristol Renaissance Faire");
            System.out.println(B.toString());
            System.out.println();
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
}