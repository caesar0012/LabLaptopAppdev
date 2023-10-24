abstract class Laptop {
    //Step 1 where it declare abstract and this is super Class
    public abstract int getRAM();
    public abstract int getSSD();
    public abstract String getCPU();

    //this prints the output
    public String toString() {
        return "RAM : "+this.getRAM()+"GB, SSD : "+this.getSSD()+", CPU : "+this.getCPU();
        
    
    }
}
