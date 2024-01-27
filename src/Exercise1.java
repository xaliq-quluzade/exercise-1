import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        dividedIntoTwo();
        primeNumbers();
        sumDigits();
        valueTransfer();
        countNumbers();
        findMonth();
        triangle();
        calculator();
        factorial();
        figures();
    }

    public static void dividedIntoTwo() {
        // 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et

        Scanner s = new Scanner(System.in);
        System.out.println("Ededi daxil edin: ");
        int number = s.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void primeNumbers() {
        // 0-dan verilmish edede qeder sade ededleri chap et.

        Scanner s = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int number = s.nextInt();

        for (int i = 2; i < number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public static void sumDigits() {
        // Verilmish ededin butun ededleri cemini tap.

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println(sum);
    }

    public static void valueTransfer() {
        // 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void countNumbers() {
        // Ededin reqemlerinin sayini tapin

        Scanner s = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int number = s.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
            System.out.println(count);
            return;
        }

        while (number > 0) {
            count++;
            number = number / 10;
        }

        System.out.println(count);
    }

    public static void findMonth() {
        // İstifadəçidən ay nömrəsini daxil etməyi təklif edən proqram yazın. Sonra daxil edilmiş ay nömrəsinə əsasən
        // həmin ayın adını çap edən keçid-case strukturundan istifadə edərək proqramı tamamlayın. Məsələn, istifadəçi
        // 1-i daxil edərsə, proqram bunu etməlidir. 'Yanvar' yaz, istifadəçi 2 daxil edərsə, 'Fevral' yazmalıdır; və s.

        Scanner s = new Scanner(System.in);
        System.out.println("1-12 arasi Eded daxil edin:");
        int number = s.nextInt();

        switch (number) {
            case 1:
                System.out.println("yanvar");
                break;
            case 2:
                System.out.println("fevral");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("aprel");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("iyun");
                break;
            case 7:
                System.out.println("iyul");
                break;
            case 8:
                System.out.println("avqust");
                break;
            case 9:
                System.out.println("sentyabr");
                break;
            case 10:
                System.out.println("oktyabr");
                break;
            case 11:
                System.out.println("noyabr");
                break;
            case 12:
                System.out.println("dekabr");
                break;
            default:
                System.out.println("1-12 arasi eded daxil edin");
        }
    }

    public static void triangle() {
        // Üçbucağın tərəflərinin düzgünlüyünü yoxlayan daha sonra isə sahəsini və perimetrini hesablayan alqoritm yazın.

        int a = 5;
        int b = 6;
        int c = 7;

        if (((a + b) > c) && ((a + c) > b) && ((c + b) > a)) {
            System.out.println("Ucbucagin terefleri duzgundur");
        }

        int perimeter = a + b + c;
        double area = Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)) / 4;

        System.out.println(perimeter);
        System.out.println(area);
    }

    public static void calculator() {
        // Calculator hazirlayın

        Scanner s = new Scanner(System.in);
        System.out.println("ilk ededi daxil edin:");
        int num1 = s.nextInt();
        System.out.println("ikinci ededi daxil edin");
        int num2 = s.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Emri daxil edin: (+,-,*,/,%)");
        String operation = s2.nextLine();

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Emeliyyati duzgun daxil edin");
        }
    }

    public static void factorial() {
        // faktorial

        Scanner s = new Scanner(System.in);

        System.out.println("Ededi daxil edin:");
        int number = s.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        System.out.println(result);
    }

    public static void figures() {
        //*
        //**
        //***
        //****

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j <= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        //   *
        //  **
        // ***
        //****

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i >= j) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
