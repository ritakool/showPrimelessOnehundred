import java.util.Scanner;

public class Main {
    public static boolean check(int number) {
        if (number < 2){
            return false;
        }else {
            for (int i = 2; i<= Math.sqrt(number); i++){
                if (number % i == 0){
                    return false;
                }
            }
//            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        byte i = 0;
        while (i < 100){
            if (check(i) == true){
                System.out.println(i);
            }
            i++;
        }
    }
}