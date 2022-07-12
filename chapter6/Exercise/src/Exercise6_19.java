public class Exercise6_19 {
    public static void change(String str) {
        str+="456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);            // change 메서드 호출, 매개변수에 str 전달

        System.out.println("After change : "+str);
        // change 메서드 종료 후 change 메서드 지역변수 str이 메모리에서 제거됨
        // 다시 main 메서드에 돌아와서 str을 참조 하지만

    }
}