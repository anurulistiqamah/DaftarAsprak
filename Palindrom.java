/**
 * Created by lenovo on 7/12/2017.
 */
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = false;
        char fi, la;
        String str;
        int opt;

        do {
            System.out.print("1. Input \n2. Exit\nAnswer : ");
            opt = in.nextInt();
            switch (opt){
                case 1 :{
                    System.out.print("Input your word or sentence : ");
                    str = in.next();
                    int y = -1;
                    for (int x = str.length()-1; x >= 0; x--){
                        y++;
                        fi = str.charAt(y);
                        la = str.charAt(x);
                        if (fi == la) result = true;
                        else {
                            result = false;
                            break;
                        }
                    }
                    System.out.println("Result : " + result);
                    break;
                }case 2 :{
                    System.out.println("Thank you");
                    break;
                }default:{
                    System.out.println("Your input was fault");
                    break;
                }
            }
        } while (opt != 2);
    }
}