public class LunchboxMerrittAubrey extends ContainerMerrittAubrey {
    private String material;
    private String color;
    private boolean filled;
    private double percentage;
    private String contents;
    private int lidSnaps;

    public LunchboxMerrittAubrey(String material, String color, boolean filled, double percentage, String contents,int lidSnaps){
        this.material = material;
        this.color = color;
        this.filled = filled;
        this.percentage = percentage;
        this.contents = contents;
        setSnapAmount(lidSnaps);
    }
    public void setSnapAmount(int lidSnaps){
        this.lidSnaps = lidSnaps;
    }
    public String toString(){
        return ("\n\tMaterial: " + material + "\n\tColor: " + color + 
        "\n\tFilled: " + filled + "\n\tPercentage filled: " + percentage + "%" + 
        "\n\tContents: " + contents + "\n\tAmount of snaps on the lid: " + lidSnaps);
    }
}