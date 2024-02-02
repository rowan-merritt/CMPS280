public class ContainerTesterMerrittAubrey{
    public static void main (String[] args){
        InsideRussianDollMerrittAubrey insideDoll = new InsideRussianDollMerrittAubrey("Very Important Message: wawawawa");
        String littleRussianDoll = insideDoll.toString();
        
        BackpackMerrittAubrey backpack = new BackpackMerrittAubrey("Nylon", "Black", true, 92, "Textbooks", 6);
        RussianDollMerrittAubrey russianDoll = new RussianDollMerrittAubrey("Porecelain","Red",true,100,littleRussianDoll);
        LunchboxMerrittAubrey lunchbox = new LunchboxMerrittAubrey("Plastic","Blue",false,0, "Air", 3);
        
        System.out.print("Lunchbox:\n" + lunchbox.toString());
        System.out.println();
        System.out.print("\nBackpack:\n" + backpack.toString());
        System.out.println();
        System.out.print("\nRussian Nesting Doll:\n" + russianDoll.toString());
    }
}