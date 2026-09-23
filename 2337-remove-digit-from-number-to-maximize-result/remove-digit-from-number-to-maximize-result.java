class Solution {
    public String removeDigit(String number, char digit) {

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == digit) {

                if (i + 1 < number.length() &&
                    number.charAt(i + 1) > digit) {

                    return number.substring(0, i) +
                           number.substring(i + 1);
                }
            }
        }

        int index = number.lastIndexOf(digit);

        return number.substring(0, index) +
               number.substring(index + 1);
    }
}