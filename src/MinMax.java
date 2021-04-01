public class MinMax {
    public static void main(String[] args) {
        int nums [] = new int [9];
        int max;
        nums[0] = 10;
        nums[1] = 5;
        nums[2] = 20;
        nums[3] = -7;
        nums[4] = -15;
        nums[5] = 13;
        nums[6] = 43;
        nums[7] = 9;
        nums[8] = 4;

        max = nums[0];
        for(int i = 1; i < 9; i++) {
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("Maximum number: " + " " + max);
    }
}


