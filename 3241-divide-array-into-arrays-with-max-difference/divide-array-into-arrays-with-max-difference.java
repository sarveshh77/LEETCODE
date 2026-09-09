class Solution {
    public int[][] divideArray(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int[][] newArr = new int[nums.length / 3][3];

        int row = 0;

        for (int i = 0; i < nums.length; i += 3) {

            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }

            newArr[row][0] = nums[i];
            newArr[row][1] = nums[i + 1];
            newArr[row][2] = nums[i + 2];

            row++;
        }

        return newArr;

    }
}