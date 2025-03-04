package Array;

public class Mang1 {
    public static void main(String[] args) {
        //Khai báo mản rỗng chưa mang giá trị
        int number1[] = new int[7];
        //Gán giá trị cho mảng
        number1[0] = 1;
        number1[1] = 10;
        number1[2] = 15;
        number1[3] = 24;
        number1[4] = 35;
        System.out.println("Độ dài mảng: " + number1.length);
        //For cơ bản
        for(int i = 2; i < number1.length; i++){
            System.out.println(number1[i]);
        }
        //for cải tiến
        for(int number : number1){
            System.out.println(number);
        }
        //truy xuất 1 giá trị cụ thế trong mảng
        System.out.println(number1[3]);
    }
}
