public class BackpackMerrittAubrey extends ContainerMerrittAubrey {
    private String material;
    private String color;
    private boolean filled;
    private double percentage;
    private String contents;
    private int compartment;

    public BackpackMerrittAubrey(String material, String color, boolean filled, double percentage, String contents, int compartment){
        this.material = material;
        this.color = color;
        this.filled = filled;
        this.percentage = percentage;
        this.contents = contents;
        setCompartmentAmount(compartment);
    }
    public void setCompartmentAmount(int compartment){
        this.compartment = compartment;
    }
    
    public String toString(){
        return ("\n\tMaterial: " + material + "\n\tColor: " + color + 
        "\n\tFilled: " + filled + "\n\tPercentage filled: " + percentage + "%" + 
        "\n\tContents: " + contents + "\n\tAmount of compartments: " + compartment);
    }
}