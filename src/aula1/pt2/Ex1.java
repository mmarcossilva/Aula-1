package aula1.pt2;

import java.util.Arrays;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] nums = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
