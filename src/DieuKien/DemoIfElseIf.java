package DieuKien;

public class DemoIfElseIf {
    public static void main(String[] args) {
        double dtb = 0;
        if (dtb > 10 || dtb < 0){
            System.out.println("Không hợp lệ");
        } else if (dtb >= 0 && dtb < 5) {
            System.out.println("Dưới trung bình");
        } else if (dtb >= 5 && dtb < 6.5) {
            System.out.println("Trung bình");
        } else if (dtb >= 6.5 && dtb < 7) {
            System.out.println("Trung bình khá");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
