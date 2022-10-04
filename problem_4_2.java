package opensource;
import java.util.Scanner;

class Grade{
    int math, science, english;
    Grade(int a, int b, int c){
        math = a;
        science = b;
        english = c;
    }
    public int average(){
        return (math + science + english) / 3;
    }
}

public class problem_4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴

        sc.close();
    }
}