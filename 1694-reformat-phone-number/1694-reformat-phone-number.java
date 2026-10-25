class Solution {
    public String reformatNumber(String number) {

        String digits= number.replace(" ","").replace("-","");

        StringBuilder result= new StringBuilder();
        int i=0;

        while(digits.length()- i > 4)
        {
            result.append(digits.substring(i, i + 3));
            result.append("-");
            i += 3;

        }
        int remaining = digits.length()-i;

        if (remaining== 4)
        {
            result.append(digits.substring(i,i+2));
            result.append("-");
            result.append(digits.substring(i+2,i+4));
        }
        else
        {
            result.append(digits.substring(i));
        }
        return result.toString();
        
    }
}