import java.util.Scanner;

public class Console {

    public void  print(String word){

        Scanner scanner = new Scanner(System.in);

            System.out.println("1. Почати гру.");
            System.out.println("2. Вийти з гри.");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Гра почалась!");
                    printStartGame(scanner, word);
                    break;

                case 2:
                    System.exit(0);
            }

    }

    public void printStartGame(Scanner scanner, String word){

        char[] charArray = new char[word.length()];
        int mistakesCount = 0;
        boolean flag = false;

        System.out.println(word);
        System.out.println("Введіть букву!");

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '-';
        }

        while (mistakesCount < 5){
            flag = false;

            char symbol = scanner.next().charAt(0);

            for (int i = 0; i < charArray.length; i++) {
                if (symbol == word.charAt(i)){
                    charArray[i] = symbol;
                    flag = true;
                }

                System.out.print(charArray[i]);
            }
            System.out.println();

            if (!flag){
                mistakesCount++;
                System.out.println("The number of your mistakes: " + mistakesCount);
            }

           if (word.equals(String.valueOf(charArray))){
               System.out.println("You won!!!");
               return;
           }
        }

        System.out.println(charArray.toString());
        if (!word.equals(String.valueOf(charArray))){
            System.out.println("You lost!!!");
        }

    }

}
