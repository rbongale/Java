public class ObjectRefrenceApp {


    public static void main(String[] args) {

        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 236384683483468932L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.934793467936493649634;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';
        String carModel = "DodgeChanllenger SRT 392";
        String carModelNew = new String("DodgeChanllenger SRT 392");

        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Horsepowe: " + horsePower);
        System.out.println("Price $: " + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Combined fuel Consumption: " + fuelConsumptionCombined);
        System.out.println("Precise fuel Consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Energy Efficiency Category: " + energyEfficiencyCategory);

        System.out.println("The car model:" + carModel);
        System.out.println("The car model:" + carModel.toUpperCase());
        System.out.println("The car model:" + carModel.toLowerCase());
        System.out.println("The car model and car model with ne keyword:" + carModel.equals(carModelNew));
        System.out.println("The car model with new Keyword:" + carModelNew);

    }
}
