
public class Main {
    public static void main(String[] args) {
        ISBNValidator("9513218589");
    }
    public static String ISBNValidator(String isbn10) {
        String isbn13 = isbn10;
        isbn13 = "978" + isbn13.substring(0, 9);
        int numbers;
        char letter;

        int sum = 0;
        for (int i = 0; i < isbn13.length(); i++) {
            numbers = ((i % 2 == 0) ? 1 : 3);
            sum += ((((int) isbn13.charAt(i)) - 48) * numbers);
        }
        sum = 10 - (sum % 10);
        if (sum == 10) {
            letter = 'X';
        } else if (sum == 11) {
            letter = 0;
        } else {
            System.out.println("The isbn number is Invalid");
        }
        isbn13 += sum;
        System.out.println(isbn13);
        return isbn13;


    }
    }

