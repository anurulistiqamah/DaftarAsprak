import java.util.Scanner;
/*references https://stackoverflow.com/questions/17967114/how-to-efficiently-remove-duplicates-from-an-array-without-using-set*/
/**
 * Created by lenovo on 7/13/2017.
 */
public class RemoveDuplicate {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[100];
        int opt, sum = 0;

        do{
            System.out.print("1. Add\n2. View before-after sorting then remove duplicate\n3. Exit\nAnswer : ");
            opt = in.nextInt();
            switch (opt){
                case 1:{
                    System.out.print("Add number : ");
                    arr[sum] = in.nextInt();
                    sum++;
                    break;
                }case 2: {
                    System.out.println("Before sorting : ");
                    for (int i = 0; i < sum; i++) {
                        System.out.print(arr[i] + ", ");
                    }

                    bubbleSort(arr);

                    System.out.println("\nAfter sorting : ");
                    for (int i = arr.length - sum; i < arr.length; i++) {
                        System.out.print(arr[i] + ", ");
                    }

                    System.out.println("\nAfter removed duplicate(s) : ");
                    int input[] = arr;
                    int current = input[0];
                    boolean found = false;

                    for (int i = arr.length - sum; i < arr.length; i++) {
                        if (current == input[i] && !found) {
                            found = true;
                        } else if (current != input[i]) {
                            System.out.print(current + ", ");
                            current = input[i];
                            found = false;
                        }
                    }
                    System.out.println(current);
                    break;
                }case 3:{
                    System.out.println("Thank you");
                    break;
                }default:{
                    System.out.println("Your input was fault");
                    break;
                }
            }
        }while (opt != 3);
    }
}
