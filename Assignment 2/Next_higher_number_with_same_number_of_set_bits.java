public class Next_higher_number_with_same_number_of_set_bits {

    // this function returns next higher
    // number with same number of set bits as x.
    static int snoob(int x) {

        int rightOne, nextHigherOneBit, rightOnesPattern, next = 0;

        if (x > 0) {

            rightOne = x & -x;

            nextHigherOneBit = x + rightOne;

            rightOnesPattern = x ^ nextHigherOneBit;

            rightOnesPattern = (rightOnesPattern) / rightOne;

            rightOnesPattern >>= 2;
            next = nextHigherOneBit | rightOnesPattern;
        }

        return next;
    }
    public static void main(String[] args) {
        int x = 156;
        System.out.println(snoob(x));
    }
}
