public class Main {
    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a text");

        System.out.println("This is" +
                " another" +
                " still more .");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("My variable =" + myVariable);


        if (anotherVariable == 50)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");
        }
    }
}