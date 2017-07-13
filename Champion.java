import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lenovo on 7/13/2017.
 */
public class Champion {
    int number, score;
    String name;

    public Champion(int number, String name, int score){
        this.number = number;
        this.name = name;
        this.score = score;
    }

//    @Override
//    public String toString() {
//        return this.number + " " + this.name + " " + this.score;
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Champion> arrayList = new ArrayList<>();
        int number;
        System.out.println("Isi 9999 pada nomor untuk keluar dari aplikasi");
        do{
            System.out.print("Nomor : "); number = in.nextInt();
            if (number != 9999){
                System.out.print("Nama  : "); String name = in.next();
                System.out.print("Nilai : "); int score = in.nextInt();
                Champion champion = new Champion(number, name, score);

                System.out.println();
//                arrayList.add(champion);
            } else {
                System.out.println("Juara 1 : ");

                System.out.println("Juara 2 : ");

                System.out.println("Juara 3 : ");

                System.out.println("Thank you");
            }
        }while (number != 9999);
    }
}
