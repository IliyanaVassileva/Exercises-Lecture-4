ublic class ExercisesLecture6 {
    public static void main(String[] args) {
        //System.out.println(exercise1(3,6,7));
        //System.out.println(exercise2(3,6,7));
        //exercise3("module");
        //String middleChar1;
        //System.out.println(exercise4("The example from exercise four from lecture six"));
       Exercise5();

    }


    public static void exercise3(String value) {
        int length = value.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            char middleChar1 = value.charAt(middle - 1);
            char middleChar2 = value.charAt(middle);
            System.out.println(+middleChar1 + middleChar2);

        } else {
            char middleChar = value.charAt(middle);
            System.out.println(+middleChar);

        }

    }

    static int exercise1(int a, int b, int c) {
        int smallestnumber = a;
        if (smallestnumber > b) {
            smallestnumber = b;
        }
        if (smallestnumber > c) {
            smallestnumber = c;
        }
        return smallestnumber;
    }

    public static int exercise2(int a, int b, int c) {

        return ((a + b + c) / 3);
    }

    public static int exercise4(String text) {
        String trimmedText = text.trim();
        int counter = 0;
        int textLenght = trimmedText.length();
        if (textLenght > 1) {
            counter++;
            for (int i = 1; i < textLenght; i++) {
                if (trimmedText.charAt(i) == ' ') {
                    counter++;
                }
            }

        }


        return counter;
    }
    public static void Exercise5() {




}
