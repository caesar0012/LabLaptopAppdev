//Step 5 create sublass recommended and extend
//to the parent Laptop

public class Recommended extends Laptop{
    
    //5.1 Where the class have the same content with minimum

      private int ram, ssd;
      private String cpu;

      public Recommended(int ram, int ssd, String cpu){
          this.ram=ram;
          this.ssd=ssd;
          this.cpu=cpu;
          }
  
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
