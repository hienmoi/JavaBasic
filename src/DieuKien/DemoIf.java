package DieuKien;

public class DemoIf {
    public static void main(String[] args) {

        int age = 20;
        String address = "Cần Thơ";
        String quequan = "Hồ Chính Minh";

        //so sánh bằng trong chuỗi dùng hàm equals()
        if ((age > 18) && address.equals("Cần Thơ")) {
            System.out.println("Được đi NVQS");
        }

        //so sánh chứa trong chuỗi dùng hàm contains()
        if (quequan.contains("Minh")){
            System.out.println("Bạn ở Hồ Chính Minh");
        }

    }
}
