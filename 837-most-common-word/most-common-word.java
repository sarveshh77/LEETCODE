class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
        int max=-1;
        String finalStr="";
        StringBuilder sb = new StringBuilder();
        HashSet<String> hash = new HashSet<>();
        HashMap<String,Integer> hs = new HashMap<>();
        String n="";
        for(int i=0;i<paragraph.length();i++)
        {
            char ch =paragraph.charAt(i);
            if(ch==' ' || ch=='!' || ch=='?' || ch==',' ||ch==';'|| ch=='.' ||ch=='\'')
            {
                if(n==""){
                    continue;
                }
                // hs.put(n.toLowerCase(),hs.getOrDefault(n,0)+1);
                sb.append(n.toLowerCase()+" ");
            
                n="";
            }
            else
            {

                n+=ch;
                if(i==paragraph.length()-1){
                    sb.append(n.toLowerCase());
                }
                
            }
        }
        

        System.out.println(sb);
        String strs[]=sb.toString().split(" ");
      
        for(int i=0;i<banned.length;i++)
        {
            hash.add(banned[i]);
        }
        for(String str : strs)
        {
            if(!hash.contains(str))
            {
                hs.put(str,hs.getOrDefault(str,0)+1);
            }
            
        }
        for(String str : hs.keySet())
        {
            if(hs.get(str)>max)
            {
                max=hs.get(str);
                finalStr=str;
            }
        }
          
      
        return finalStr;
    }
}