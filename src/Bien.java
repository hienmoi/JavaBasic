public class Bien {
    String DiaChi = "Cần Thơ";//Biến toàn cục
    static String phone = "04354325";//Biến static
    public void getInfo(){
        System.out.println(DiaChi);
        System.out.println(phone);

    }
    public static void main(String[] args) {
        //Đây là ghi chú
        //Khai báo biến local
        int number1 = 123456;
        int Number1 = 789;
        String name = "Hiền";
        //in giá trị của biến ra màn hình
        System.out.println(number1);
        System.out.println(Number1);
        System.out.println(name);
        System.out.println(phone);

        //Cách thức để gọi một thành phâần trong 1 class vào hàm bất kỳ
        Bien bien = new Bien();
        System.out.println(bien.DiaChi);
        int n;
        n = 100;
        System.out.println(n);
    }



}
