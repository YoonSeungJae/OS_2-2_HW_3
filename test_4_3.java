package opensource;

public class test_4_3 {
int radius;
String name;
public test_4_3() { // 매개 변수 없는 생성자
radius = 1; name = ""; // radius의 초기값은 1
}
public test_4_3(int r, String n) { // 매개 변수를 가진 생성자
radius = r; name = n;
}
public double getArea() {
return 3.14*radius*radius;
}
public static void main(String[] args) {
test_4_3 pizza = new test_4_3(10, "자바피자"); // Circle 객체 생성, 반지름 10
double area = pizza.getArea();
System.out.println(pizza.name + "의 면적은 " + area);
test_4_3 donut = new test_4_3(); // Circle 객체 생성, 반지름 1
donut.name = "도넛피자";
area = donut.getArea();
System.out.println(donut.name + "의 면적은 " + area);
}
}