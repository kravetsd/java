public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(65.677));
        printConversion(-2.5);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long  toMilesPerHour = -1;
        if (kilometersPerHour >= 0) {
            toMilesPerHour = Math.round(kilometersPerHour/1.609);
        }

        return  toMilesPerHour;
    }

    public  static  void  printConversion(double kilometersPerHour){
        if (toMilesPerHour(kilometersPerHour) < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
