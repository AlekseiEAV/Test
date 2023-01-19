import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String>list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(args[0]))) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] nums = list.toArray(new String[0]);
        int[]numss = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            numss[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(numss);

        for (int j : numss) {
            k = k + j;
        }

        k = k / numss.length;
        int count = 0;
        for (int num : numss) {
            while (num != k) {
                if (num < k) {
                    num += 1;
                } else {
                    num -= 1;
                }
                count++;
            }
        }
        System.out.println(count);

    }
}