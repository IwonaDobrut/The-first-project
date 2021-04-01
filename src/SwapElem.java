public class SwapElem {
    public static void main(String [] args) {
        int nums[] = {10, 20};
        int a, b, t;
        int size;
        size = 2;

        System.out.print("Pierwotna tablica:");
        for( int i = 0; i < size; i++)
        System.out.print(" "  + nums[i]);
        System.out.println();

        // Sortowanie
        for( a = 1; a < size; a++)
            for(b = size - 1; b >= a; b--) {
                if(nums[b-1] < nums[b]) {
                    // zamienia elementy
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.print("Posortowana tablica:");
            for(int i =0; i < size; i++)
                System.out.print(" " + nums[i]);
                System.out.println();

    }
}
