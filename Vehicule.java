public class Vehicule {
    String Brand;
    String Model;
    int Year;
    int Weight;
    int Wheels;
    int Sound;
    public Vehicule(String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
    }
    public void Accelerate(String accelerate) {
        System.out.printf("I'm putting the pedal to the metal! (Let's hope the car doesnt explode)\n\n");
    }
    public void Brake(String brake) {
        System.out.printf("Woah! Slow down boy!");
    }
    public void Describe(String describe) {
        System.out.printf("I'm a " +Brand+ " " +Model+ " made in " +Year+ "\n");
    }
}
