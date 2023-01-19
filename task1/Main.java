
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(args[0])) {
            list.add(sc.nextLine());
        }
        try (Scanner scc = new Scanner(args[1])) {
                list.add(scc.nextLine());

        }

                int n = Integer.parseInt(list.get(0));
                int[] arr = new int[n];
                int m = Integer.parseInt(list.get(1));

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
                }

                int index = 0;

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[index]);
                    index = ((index + m - 1) % n);
                    if (index == 0) {
                        break;
                    }
                }
            }
        }