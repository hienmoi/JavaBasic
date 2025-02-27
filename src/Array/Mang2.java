package Array;

public class Mang2 {
    public static void main(String[] args) {
        int number2[] = {1, 23, 45, 15, 56};
        number2[2] = 100;
        System.out.println(number2[2]);
        for (int i = 0; i < number2.length; i++){
            System.out.println(number2[i]);
        }

        String ten[] = {"Hiền", "Huệ", "Linh"};
        for (int i = 0; i < ten.length; i++){
            if (ten[i].equals("Linh")) {
                System.out.println(ten[i]);
            } else
                System.out.println("Không có Linh");
        }
    }
}