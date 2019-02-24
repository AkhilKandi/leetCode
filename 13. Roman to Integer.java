/* 13. Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

*/
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        hmap.put('I',1) ; hmap.put('V',5);
        hmap.put('X',10);hmap.put('L',50);
        hmap.put('C',100);hmap.put('D',500);
        hmap.put('M',1000);
        
        char[] ch = s.toCharArray();
        
        int res =0, temp =0;
        if(ch.length == 1){
            return hmap.get(ch[0]);
        }
        for(int i=0; i<=ch.length-1; ){
            if( i==ch.length-1 || hmap.get(ch[i])>=hmap.get(ch[i+1])){
                res = res+hmap.get(ch[i]);
                i++;
                
            }
            else{
                temp = hmap.get(ch[i+1])- hmap.get(ch[i]);
                res = res+temp;
                i = i+2;
            }
            
        }
        return res;
    }
}

