public class TestFactory {
    //this is the main method
    public static void main(String[] args) {
        //step 7 instantiate the laptop object of min and reco
        Laptop min = LaptopFactory.getSpecs("min", 8, 256, "i5-12450Hz");
        Laptop reco = LaptopFactory.getSpecs("reco", 16, 512, "i7-12700Hz");

        System.out.println("Minimum Specs:");
        System.out.println(min);
        System.out.println("Recommended Specs:");
        System.out.println(reco);
    }
}
