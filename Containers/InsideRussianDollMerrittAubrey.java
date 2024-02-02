public class InsideRussianDollMerrittAubrey extends ContainerMerrittAubrey {
    String note;
    
    public InsideRussianDollMerrittAubrey(String note){
        setCompartmentAmount(note);
    }
    public void setCompartmentAmount(String note){
        this.note = note;
    }
    public String toString(){
        return ("\n\tA letter that says " + note);
    }
}
