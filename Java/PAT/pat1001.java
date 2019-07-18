import java.util.*;
import java.lang.*;
public class pat1001{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        if(num <= 1000){    
            while(num != 1){
                if(num % 2 == 0){
                    num = num/2;
                    count++;
                }else{
                    num = (3*num+1)/2;
                    count++;
                }
            }
        }
        in.close();//关闭in
        System.out.println(count);
    }
}