class Solution {
    public String[] createGrid(int m, int n) {

        String[] str=new String[m];
        for(int i=0;i<m;i++){
             StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if((i==0 && j==0) || i==m-1 || j==0){
                sb.append(".");
                }
                else{
                    sb.append("#");
                }
            }
            str[i]=sb.toString();
        }
        return str;
    }
}