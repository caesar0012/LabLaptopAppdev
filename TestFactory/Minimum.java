class Minimum extends Laptop{

    //This is the step 2 where it creates 3 private variables
    private int ram, ssd;
    private String cpu;

    //Step 3 where it creates constructor for minimum class

    public Minimum(int ram, int ssd, String cpu){
        this.ram=ram;
        this.ssd=ssd;
        this.cpu=cpu;
        }


        
    //This is step where you I need to create 3 public getter method
    @Override
    public int getRAM() {
        return this.ram;
    }

    @Override
    public int getSSD() {
        return this.ssd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}