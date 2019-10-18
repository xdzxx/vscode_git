import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        if(s == null||s.length() == 0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            int num = map.get(s.charAt(s.length()-1-i));//逆序查找
            if(num < last){//如果当前值比前一个小则减
                sum -= num;
            }else{//否则则加
                sum += num;
            }
            last = num;//将当前值赋给last
        }
        return sum;
    }
}
// @lc code=end

