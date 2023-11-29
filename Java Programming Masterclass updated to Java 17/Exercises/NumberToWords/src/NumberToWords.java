    public class NumberToWords {

        public static void numberToWords(int number){
            if (number < 0){
                System.out.println("Invalid Value");
                return;
            }
            else if (number == 0){
                System.out.println("Zero");
                return;
            }

            int numberOfDigit = getDigitCount(number);
            number = reverse(number);
            int reversedOfDigit = getDigitCount(number);

            while (number != 0){
                System.out.println(
                        switch (number % 10){
                            case 0 -> "Zero";
                            case 1 -> "One";
                            case 2 -> "Two";
                            case 3 -> "Three";
                            case 4 -> "Four";
                            case 5 -> "Five";
                            case 6 -> "Six";
                            case 7 -> "Seven";
                            case 8 -> "Eight";
                            case 9 -> "Nine";
                            default -> "Undefined Behavior";
                        }
                );
                number /= 10;
            }


            for (int i = 0; numberOfDigit - reversedOfDigit != 0; i++){
                System.out.println("Zero");
                numberOfDigit--;
            }
        }

        public static int reverse(int number){
            int reversedNum = 0;
            int sign = 1;

            if (number < 0){
                sign *= -1;
            }

            while (number != 0){
                reversedNum *= 10;
                reversedNum += (number % 10);
                number /= 10;
            }

            return reversedNum;
        }

        public static int getDigitCount(int number){
            if (number < 0){
                return -1;
            }
            else if (number == 0){
                return 1;
            }

            int counter = 0;

            while (number != 0){
                number /= 10;
                counter++;
            }

            return counter;
        }
    }
