public class VariablesTheme {   

    public static void main(String[] args) {
        byte processorFrequency = 3;
        short hddSize = 256;
        int iMacYear = 2019;
        long memory = 16384;
        float MacVersion = 13.3f;
        double hhdFreeSpace = 104.33d;
        char videoCardVersion = 'X';
        boolean isOSWindows = false;

        System.out.println("\n 1. Вывод характеристик компьютера\n");
        System.out.println("Processor Frequency (GHz): " + processorFrequency);
        System.out.println("Hard Disk Drive Size (GB): " + hddSize);
        System.out.println("iMac Production Year: " + iMacYear);
        System.out.println("Operating Memory (MB): " + memory);
        System.out.println("MacOS Ventura Version: " + MacVersion);
        System.out.println("Hard Disk Drive Free Space (GB): " + hhdFreeSpace);
        System.out.println("Video Card Version: " + videoCardVersion);
        System.out.println("Is OS Windows?: " + isOSWindows + '\n');

        int pen = 100;
        int book = 200;
        int sumNoDiscount = 100+200;
        int discountedSum = sumNoDiscount * 11 / 100;
        int sumWithDiscount = sumNoDiscount - discountedSum;

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        System.out.println("i. Общая стоимость товаров без скидки: " + sumNoDiscount);
        System.out.println("ii. Сумма скидки: " + discountedSum);
        System.out.println("iii. Общая стоимость товаров со скидкой: " + sumWithDiscount + '\n');

        System.out.println("3. Вывод слова JAVA\n");
        System.out.println("    J    a  v     v  a    ");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a\n");

// В данной задаче сначала я решил  сделать декремент, так как изначальные значения и так максимальные.
// А потом сделал инкремент (вернулся к исходным значениям).

        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;

        System.out.println("4. Вывод min и max значений целых числовых типов\n");
        System.out.println(" * Первоначальные значения\n");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        num1--;
        num2--;
        num3--;
        num4--;

        System.out.println("\n * Значение после декремента на единицу\n");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        num1++;
        num2++;
        num3++;
        num4++;

        System.out.println("\n * Значение после инкремента на единицу\n");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        int x = 2;
        int y = 5;

        System.out.println("\n 5. Перестановка значений переменных\n");
        System.out.println("* 'Исходные значения переменных'\n");
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');

        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("* 'Перестановка с помощью третьей переменной'\n");
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');

        // в первой задаче с перестановкой с помощью 3-ей переменной мы уже поменяли значения, поэтому сейчас вернемся к исходным значениям
        // в данном случае, х теперь равен 5, а у равен 2
        x = x * y;  
        y = x / y; 
        x = x / y; 
        // итого, теперь х снова равен 2, а у равен 5

        System.out.println("* 'Перестановка с помощью арифметической операции'\n");
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');

         x = x ^ y;
         y = x ^ y;
         x = x ^ y; 

        System.out.println("* 'Перестановка с помощью побитовой операции'\n");
        System.out.println("x = " + x);
        System.out.println("y = " + y + '\n');

        char char1 = '#';
        int ascii1 = char1;

        char char2 = '&';
        int ascii2 = char2;

        char char3 = '@';
        int ascii3 = char3;

        char char4 = '^';
        int ascii4 = char4;

        char char5 = '_';
        int ascii5 = char5;

        System.out.println("6. Вывод символов и их кодов\n");
        System.out.println(ascii1 + "- #");
        System.out.println(ascii2 + "- &");
        System.out.println(ascii3 + "- @");
        System.out.println(ascii4 + "- ^");
        System.out.println(ascii5 + "- _\n");

        String sym1 = "/";
        String sym2 = "\\";
        String sym3 = "_";
        String sym4 = "(";
        String sym5 = ")";

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");
        System.out.println("          " + sym1 + sym2);
        System.out.println("         " + sym1 + " " + " " + sym2);
        System.out.println("        " + sym1 + sym3 + sym4 + " " + sym5 + sym2);
        System.out.println("       " + sym1 + "  " + "    " + sym2);
        System.out.println("      " + sym1 + sym3 + sym3 + sym3 + sym3 + sym1 + sym2 + sym3 + sym3 + sym2 + '\n');

        int givenNum = 123;
        int hundreds = givenNum / 100;
        int tens = givenNum / 10 % 10;
        int units = givenNum % 10;
        int sum = hundreds + tens + units;
        int multiply = hundreds * tens * units;

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");
        System.out.println("Число 123 содержит:\n");
        System.out.println(hundreds + " - сотен");
        System.out.println(tens + " - десятков");
        System.out.println(units + " - единиц");
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + multiply + '\n');

        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println("9. Вывод времени\n");
        System.out.println(hours + ":" + minutes + ":" + seconds + '\n');

    }
}