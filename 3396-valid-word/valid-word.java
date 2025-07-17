class Solution {
    public boolean isValid(String word) {

        if(word.length()<3){
            return false;
        }
        boolean t=false;
        boolean t1=false;
         for (int i = 0; i<word.length() ; i++) {
            char ch = word.charAt(i);



            if(Character.isDigit(ch) || Character.isLetter(ch)){
                if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    t=true;
                    continue;

                }
                if(Character.isLetter(ch)){
                    t1=true;
                    continue;

                }

            }
            else{
                return false;
            }
         }
        if(t1 && t){
            return true;
        }
        else{
            return false;
        }
        
    }
}