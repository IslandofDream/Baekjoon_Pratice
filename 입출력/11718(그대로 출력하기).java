import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st;

        try {

            while ((st = sc.nextLine()) != null) {
                System.out.println(st);
            }
        }

        catch (NoSuchElementException e){

        }

        }
    }

