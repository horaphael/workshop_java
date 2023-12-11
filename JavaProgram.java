public class JavaProgram {
    public static void main(String []args) {
        Vehicule voiture = new Vehicule("Volkswagen", "Scirocco", 2008);
        voiture.Describe(null);
        voiture.Accelerate(null);
        
        Car car = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
        car.Describe(null);
        car.aout(null);

        Truck truck = new Truck("Scania", "Frostfire", 2022, 6000, 6);
        truck.Describe(null);
        truck.aout(null);

        Motorcycle moto = new Motorcycle("Kawazaki", "Ninja", 2013, 170, 2);
        moto.Describe(null);
        moto.aout(null);

        car.Accelerate(null);
        truck.Accelerate(null);
        moto.Accelerate(null);
    }
}