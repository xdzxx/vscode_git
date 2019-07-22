//读入n (n > 0)名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

import java.util.Scanner;


class pat1004{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        //int n = in.nextInt();
        //不知道为什么这个执行有问题
        String[] name = new String[n];
        String[] id = new String[n];
        Integer[] grade = new Integer[n];

        for(int i = 0;i < n;i++) {
            String str = in.nextLine();
            String[] list = str.split(" ");
            name[i] = list[0];
            id[i] = list[1];
            grade[i] = Integer.valueOf(list[2]);
        }

        int MaxGrade = grade[0];
        int MinGrade = grade[0];
        int MaxNum = 0;
        int MinNum = 0;
        for(int j = 0;j < n;j++) {
            if(grade[j] > MaxGrade) {
                MaxGrade = grade[j];
                MaxNum = j;
            }
            if(grade[j] < MinGrade) {
                MinGrade = grade[j];
                MinNum = j;
            }
        }
        String MaxStudent = name[MaxNum] + " " + id[MaxNum];
        String MinStudent = name[MinNum] + " " + id[MinNum];
        System.out.println(MaxStudent);
        System.out.println(MinStudent);

    }
}