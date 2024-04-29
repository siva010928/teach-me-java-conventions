package powerpackage;


/* 2^3 = 8 */
public class PowerFinder {
    public int getPowerOf(int base, int exponent) {
        int power = 1;
        for (int expo = 0; expo < exponent; expo++) {
            power *= base;
        }
        return power;
    }
}
