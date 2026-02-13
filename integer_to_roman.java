class Solution {
    public String intToRoman(int num) {
         int[] v = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] r = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while(num > 0){
            if(num >= v[i]){
                num -= v[i];
                roman.append(r[i]);
            }
            else
                i++;
        }
        return roman.toString();
    }
}