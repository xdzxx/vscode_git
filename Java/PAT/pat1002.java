//读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
import java.util.Scanner;

class pat1002{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] pingyin = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String n = in.nextLine();
        String[] s = n.split("");
        int sum = 0;
        int[] num = new int[n.length()];
        for(int i = 0;i < s.length;i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        for(int j = 0;j < num.length;j++) {
            sum += num[j];
        }
        
        //把sum转换成数组
        String s_1 = String.valueOf(sum);
        int[] x = new int[s_1.length()];
        for(int i = 0;i < s_1.length();i++) {
            x[i] = Integer.parseInt(String.valueOf(s_1.charAt(i)));
        }
        
        String put = "";
        for(int l=0;l<x.length;l++){            
            //System.out.print(pingyin[x[l]] + " "); 
            //一开始用上面这个，因为后面多了一个空格，提交始终格式错误
            put = put + pingyin[x[l]] + " ";
        }

        System.out.println(put.trim());//去掉首尾空格
    }
}