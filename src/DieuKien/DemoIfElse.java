package DieuKien;

public class DemoIfElse {
    public static void main(String[] args) {
        String gender = "Male";
        int age = 30;

        if (gender.equals("Male") || age > 40) {
            System.out.println("Cho đi cuốc đất");
        } else {
            System.out.println("Cho đi hái rau");
        }
    }
}
