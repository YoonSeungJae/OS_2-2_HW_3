package opensource;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")"+ radius);
    }
    public int getRadius(){
        return radius;
    }
}

public class test_4_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
        for(int i=0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double a = sc.nextDouble(); // x값 읽기.
            double b = sc.nextDouble(); // y값 읽기.
            int d = sc.nextInt(); // radius값 읽기.
            c[i] = new Circle(a,b,d); // Circle 객체 생성
        }
        int max = 0, index = -1;
        for(int i=0; i<c.length; i++){
            c[i].show();
            if(max < c[i].getRadius()){
                index = i;
                max = c[i].getRadius();
            }
        }

        System.out.print("가장 면적이 큰 원은? ");
        c[index].show();
        sc.close();
    }

}