class Solution {
    public String sortSentence(String s) 
    {
        String[] str = s.split(" ");
        String[] finalArr = new String[str.length];

        for(String word : str)
        {
            int len = word.length();
            int pos= word.charAt(len-1)-'0';
            finalArr[pos-1]=word.substring(0,len-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String finalStr : finalArr)
        {
            sb.append(finalStr+" ");
        }
        return sb.toString().trim();

    }
}