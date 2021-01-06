import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m,d;
        int count = 8;
        m = sc.nextInt();
        d = sc.nextInt();

        if(m == 1){ if(d > 0 && d < 32){count = d%7;} else{ count  = 8;} }
        else if(m == 2){if(d > 0 && d < 29){ count = (31 +d) % 7;} else{count  = 8;}}
        else if(m == 3){ if(d > 0 && d < 32){count = (59 +d) % 7;}else{ count  = 8;} }
        else if(m == 4){ if(d > 0 && d < 31){count = (90 +d) % 7; }else{ count  = 8;}}
        else if(m == 5){ if(d > 0 && d < 32){count = (120 +d) % 7; }else{ count  = 8;}}
        else if(m == 6){ if(d > 0 && d < 31){count = (151 +d) % 7; }else{ count  = 8;}}
        else if(m == 7){if(d > 0 && d < 32){ count = (181 +d) % 7;}else{ count  = 8;} }
        else if(m == 8){ if(d > 0 && d < 32){count = (212 +d) % 7; }else{ count  = 8;}}
        else if(m == 9){if(d > 0 && d < 31){ count = (243 +d) % 7; }else{ count  = 8;}}
        else if(m == 10){ if(d > 0 && d < 32){count = (273 +d) % 7; }else{ count  = 8;}}
        else if(m == 11){if(d > 0 && d < 31){ count = (304 +d) % 7; }else{ count  = 8;}}
        else if(m == 12){ if(d > 0 && d < 32){count = (334 +d) % 7;}else{ count  = 8;} }
        else{}

        if(count == 1){
            System.out.println("MON");
        }
        else if(count == 2){
            System.out.println("TUE");
        }
        else if(count == 3){
            System.out.println("WED");
        }
        else if(count == 4){
            System.out.println("THU");
        }
        else if(count == 5){
            System.out.println("FRI");
        }
        else if(count == 6){
            System.out.println("SAT");
        }
        else if (count == 0){
            System.out.println("SUN");
        }
        else{

        }



    }
}

