import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(args[0]))) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> list2 = new ArrayList<>();
        try (Scanner scc = new Scanner(new File(args[1]))) {
            while (scc.hasNextLine()) {
                list2.add(scc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String[] nums = list.get(0).split(" ");
        String[] numsR = list.get(1).split(" ");


        float xk = Float.parseFloat(nums[0]);
        float yk = Float.parseFloat(nums[1]);
        float xR = Float.parseFloat(numsR[0]);


        for (String s : list2) {
            String[] nums2 = s.split(" ");
            float x = Float.parseFloat(nums2[0]);
            float y = Float.parseFloat(nums2[1]);
            double v = pow(x - xk, 2) / pow(xR, 2) + pow(y - yk, 2) / pow(xR, 2);
            if (v < 1) {
                System.out.println("1");
            } else if (v == 1) {
                System.out.println("0");
            } else {
                System.out.println("2");
            }

        }



    }
}