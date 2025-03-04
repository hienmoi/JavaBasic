import DieuKien.DemoIf;

public class PhuongThuc {

    int sum;
    int res;
   static int sta = 100;
    //Hàm KHÔNG trả về kết quả
    public void cong2so () {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);

    }

    //Hàm CÓ trả về kết quả
    public int nhan2so () {
        int a = 5;
        int b = 10;
        sum = a * b;
        //System.out.println(sum); dùng hàm in ở đây cũng được
        return sum;

    }

    public static int chia2so() {
        int a = 5;
        int b = 10;
        int sum = a * b;
        return(sum);
    }

    //Hàm có tham số
    public void cong2so( int number1, int number2){
        System.out.println(number1 + number2);
    }

    public long nhan3so(int a, int b, int c){

        return a * b * c;

    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2so();
        System.out.println(phuongThuc.nhan2so() + 10);
        System.out.println(chia2so() + 10);
        phuongThuc.cong2so(20,50);
        phuongThuc.cong2so(30,50);
        System.out.println(phuongThuc.nhan3so(1,50,3)/5);
        //System.out.println(phuongThuc.cong2so()) => Không được dùng hàm voin vào hàm in do hàm void ko trả ra giá trị



    }
}
