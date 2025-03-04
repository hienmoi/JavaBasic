public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d , e, f;
        d = e = f = 100;

        //Toán tử số học
        System.out.println("a%b = "+ (a % b));
        System.out.println("a/b = "+ (a/b));
        System.out.println( a + b * c / 5);
        System.out.println(a++);
        System.out.println(a);
        System.out.println("a = " + (a += 5));


        //Toán tủ so sánh và logic
        System.out.println("So sánh a > b: " + (a>b) );
        System.out.println( (a<b) && (b>c));
        System.out.println((a>b) || (b>c));
        System.out.println( ((a> b) && (a>c)) || ((a < b) && (a<c)) );
        //Gọi biến static từ class khaác (class PhuongThuc)
        System.out.println(PhuongThuc.sta);
        //Gọi hàm static từ class khác (class PhuongThuc)
        System.out.println(PhuongThuc.chia2so());

    }
}
