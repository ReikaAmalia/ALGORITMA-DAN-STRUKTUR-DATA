import java.util.ArrayList;

public class mobil23main {
    public static void main(String[] args) {
        ArrayList<mobil23> cars = new ArrayList<>();
        cars.add(new mobil23("BMW", "M2 Coupe", 2016, 6816, 728));
        cars.add(new mobil23("Ford", "Fiesta ST", 2014, 3921, 575));
        cars.add(new mobil23("Nissan", "370Z", 2009, 4360, 657));
        cars.add(new mobil23("Subaru", "BRZ", 2014, 4058, 609));
        cars.add(new mobil23("Subaru", "Impreza WRX STI", 2013, 6255, 703));
        cars.add(new mobil23("Toyota", "AE86 Trueno", 1986, 3700, 553));
        cars.add(new mobil23("Toyota", "86/GT86", 2014, 4180, 609));
        cars.add(new mobil23("Volkswagen", "Golf GTI", 2014, 4180, 631));

        int maxAcceleration = maxDivideConquer(cars, 0, cars.size() - 1);
        int minAcceleration = minDivideConquer(cars, 0, cars.size() - 1);

        double averagePower = averageBruteForce(cars);

        System.out.println("a) Top acceleration tertinggi: " + maxAcceleration);
        System.out.println("b) Top acceleration terendah: " + minAcceleration);
        System.out.println("c) Rata-rata top power dari seluruh mobil: " + averagePower);
    }

    public static int maxDivideConquer(ArrayList<mobil23> cars, int low, int high) {
        if (low == high)
            return cars.get(low).top_acceleration;

        int mid = (low + high) / 2;
        int leftMax = maxDivideConquer(cars, low, mid);
        int rightMax = maxDivideConquer(cars, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }

    public static int minDivideConquer(ArrayList<mobil23> cars, int low, int high) {
        if (low == high)
            return cars.get(low).top_acceleration;

        int mid = (low + high) / 2;
        int leftMin = minDivideConquer(cars, low, mid);
        int rightMin = minDivideConquer(cars, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }

    public static double averageBruteForce(ArrayList<mobil23> cars) {
        int totalPower = 0;
        for (mobil23 car : cars) {
            totalPower += car.top_power;
        }
        return (double) totalPower / cars.size();
    }
}