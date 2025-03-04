package DemoCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        //Khai báo dữ liệu
        //Được phép khai báo giá trị trùng lặp
        List <String> menu = new ArrayList<>();
        //Thêm dữ liệu
        menu.add("Customer");
        menu.add("Project");
        menu.add("User");
        menu.add("Customer");
        menu.add("Follow");
        menu.set(2, "Projects");
        //Xóa dữ liệu
        menu.remove(3);
        menu.remove("Project");
        //Cập nhật dữ liệu trong Arrlist:
        // Phải xóa phần tử sau đó thêm lại vào đúng chỉ mục đó
        //menu.add(3, "Task");

        System.out.println("--------------------");
        //get giá trị theo chỉ mục
        //System.out.println(menu.get(3));

        System.out.println("----------------------");
        //Duyệt ArrayList
        for (String list : menu){
            System.out.println(list);
        }
        System.out.println("------------------");
        //Nên duyệt dữ liệu ArrayList bằng for cơ bản
        // vì các phần từ trong ArrayList có thú tự
        // => có chỉ mục để chỉ định lấy ra phần tử nào
        for (int i = 0; i < menu.size(); i++ ){
            System.out.println(menu.get(i));
        }
        //Tìm kiếm phần tử nào đó
        System.out.println(menu.contains("Task"));
        System.out.println("===================");

        List <String> menu2 = new ArrayList<>();
        menu2.addAll(menu);

        for (int i = 0; i < menu2.size(); i++ ){
            System.out.println(menu2.get(i));
        }
        //Cách khác để add dữ liệu vào ArrayList
        ArrayList <String> List1 = new ArrayList<>(Arrays.asList("Tester", "Manual"));
        System.out.println(List1);

    }
}
