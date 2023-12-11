public class Truck extends Vehicule {
    public Truck(String Brand, String model, int year, int weight, int wheels) {
        super(Brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }
    public void Describe(String describe) {
        System.out.printf("I'm a " +Brand+ " " +Model+ " made in " +Year+ "\n");
    }
    public void aout(String aout) {
        System.out.printf("I'm a Truck, I weight " +Weight+ " kg and I have " +Wheels+ " weels\n\n");
    }
}
