package VongLapFor;

public class ForCaiTien {
    public static void main(String[] args) {
        int stt[] = {40,3,50, 100, 200};

        for(int i : stt) {
            System.out.println(i);
        }
        //for cơ bản để duyệt mảng
        for (int i = 1; i < 5; i++){
            System.out.println(stt[i]);
        }
        String menu[] = {"Dashboard", "Custumer", "Project", "Task"};
        for(String j : menu) {
            System.out.println(j);
        }

    }
}
