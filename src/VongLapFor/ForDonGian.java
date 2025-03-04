package VongLapFor;

public class ForDonGian {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i+=2) {
            System.out.println(i);
            if(i==6) {
                break;//thoát khỏi vòng lặp for
            }
        }
    }
}
