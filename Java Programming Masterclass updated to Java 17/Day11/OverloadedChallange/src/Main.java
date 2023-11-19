public class Main {
    public static void main(String[] args) {
        System.out.println("The height entered in inch is " +
                convertToCentimeters(6,0) + " cm");
        System.out.println("The height entered in inch is " +
                convertToCentimeters(5,8) + " cm");
        System.out.println("The height entered in inch is " +
                convertToCentimeters(60) + " cm");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightAsFeet, int heightAsInches){
        return convertToCentimeters((heightAsFeet * 12) + heightAsInches);
    }
}