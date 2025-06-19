
class Plus_One_66 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

// Input: digits = [1,2,3]
// Output: [1,2,4]

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]

// Input: digits = [9]
// Output: [1,0]