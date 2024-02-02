public class ContainerMerrittAubrey {
    private String material;
    private String color;
    private boolean filled;
    private double percentage;
    private String contents;

        public void getMat(String material){
            this.material = material;
        }
        public void getColor(String color){
            this.color = color;
        }
        public void getFilled(boolean filled){
            this.filled = filled;
        }
        public void getPer(double percentage){
            this.percentage = percentage;
        }
        public void getCon(String contents){
            this.contents = contents;
        }
        
    // String representation of this object
    public String toString(){
        return ("\n\tMaterial: " + material + "\n\tColor: " + color + 
        "\n\tFilled: " + filled + "\n\tPercentage filled: " + percentage + "%" + 
        "\n\tContents: " + contents);
    }
}