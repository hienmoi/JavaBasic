package DemoCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai báo kiểu dữ lệu Set
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        System.out.println("Các phần tử của Set");
        System.out.println("\t" + menu + "\n");

        // Show set through Iterator\
        System.out.println("\n----------------");
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        // Duyệt dữ liệu kiểu Set bẳng for cải tiến
        //Không dùng for cơ bản do các phần tử trong Set không có thứ tự
        System.out.println("\n----------------");
        for (String obj : menu) {
            System.out.print(obj + ", ");

        }
        System.out.println("\n----------------");
        menu.remove("Project");
        System.out.println(menu);
    }
}
