class Solution {
    public int largestInteger(int num)
    {
        String s = String.valueOf(num);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i = 0; i<s.length(); i++)
        {
            int digit = s.charAt(i) - '0';

            if(digit % 2 == 0)
            {
                even.add(digit);
            }
            else
            {
                odd.add(digit);
            }

        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even,Collections.reverseOrder());
        
        int evenIdx = 0;
        int oddIdx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            int digit = s.charAt(i) - '0';
            if(digit % 2 == 0)
            {
                sb.append(even.get(evenIdx++));
            }
            else
            {
                sb.append(odd.get(oddIdx++));
            }

        }
        return Integer.parseInt(sb.toString());


    }
}