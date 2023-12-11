public class Motorcycle extends Vehicule{
    public Motorcycle(String Brand, String model, int year, int weight, int wheels) {
        super(Brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }
    public void Describe(String describe) {
        System.out.printf("I'm a " +Brand+ " " +Model+ " made in " +Year+ "\n");
    }
    public void aout(String aout) {
        System.out.printf("I'm a motorcycle, I weight " +Weight+ " kg and I have " +Wheels+ " weels\n\n");
    }
    public void Accelerate(String accelerate) {
        System.out.printf("My " +Brand+ " goes like this : vrrrrRRRRRRRrrrrr !\n");
    }
}
