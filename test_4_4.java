package opensource;

public class test_4_4 {
String title;
String author;
public test_4_4(String t) { // 생성자
title = t; author = "작자미상";
}
public test_4_4(String t, String a) { // 생성자
title = t; author = a;
}
public static void main(String [] args) {
test_4_4 littlePrince = new test_4_4("어린왕자", "생텍쥐페리");
test_4_4 loveStory = new test_4_4("춘향전");
System.out.println(littlePrince.title + " " + littlePrince.author);
System.out.println(loveStory.title + " " + loveStory.author);
}
}