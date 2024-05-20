
public class RoundedSquares {
	public static void main(String[] args) {
		System.out.println(mySqrt(64));
	}
	
    public static int mySqrt(int x) {
        int left = x / 2;
        int right = x / 10;
        int y = Integer.MIN_VALUE;

        while (y * y != x) {
            if (left * left == x) {
                return left;
            }

            if (right * right == x) {
                return right;
            }

            if ((x - left * left) < (x - right * right)) {
                left++;
            }

            if ((x - right * right) < (x - left * left)) {
                right++;
            }

            if (right * right > x && (right * right - x) < (x - left * left)) {
                right--;
            }
            
            if (left * left > x && (left * left - x) < (right * right - x)) {
                left--;
            }

        }

        return y;
    }	
}
