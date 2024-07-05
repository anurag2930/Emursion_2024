public class Triples_with_Bitwise_AND_Equal_To_Zero {
    public static int countTriplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = j; k < nums.length; k++) {
                    if (((nums[i] & nums[j]) & nums[k]) == 0) {
                        if (i == j && i ==k) {
                            count++;
                        }
                        else if (i == j || i == k || j == k) {
                            count +=3;
                        }
                        else count +=6;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num={0,0,0};
        System.out.println(countTriplets(num));
    }
}
