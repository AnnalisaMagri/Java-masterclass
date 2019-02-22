public class Car {
    private int door;
    public int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validmodel= model.toLowerCase();
        if (validmodel.equals("carrera")|| validmodel.equals("commodore")){
            this.model=model;
        }else{
            this.model="Unknown";
        }

    }

    public String getModel() {
        return this.model=model;
    }
}
