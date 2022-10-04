package opensource;

public class test_4_5 {
String title;
String author;
void show() { System.out.println(title + " " + author); }
public test_4_5() {
this("", "");
System.out.println("생성자 호출됨");
}
public test_4_5(String title) {
this(title, "작자미상");
}
public test_4_5(String title, String author) {
this.title = title; this.author = author;
}
public static void main(String [] args) {
test_4_5 littlePrince = new test_4_5("어린왕자", "생텍쥐페리");
test_4_5 loveStory = new test_4_5("춘향전");
test_4_5 emptyBook = new test_4_5();
loveStory.show();
}
}