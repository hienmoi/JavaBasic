package DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectMap {
    public static void main(String[] args) {
        //Khai báo dữ liệu
        Map<String , String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        //Thêm value
        map1.put("Language", "Java");
        map1.put("Framework", "TestNG");
        map1.put("Library", "Selenium");
        //update value
        map1.put("Library", "Playeright");
        //Xóa value
        map1.remove("Library", "Playeright");
        map2.put(1,10.5);
        map2.put(2,10.D);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.containsKey("Language"));
        System.out.println(map1.containsValue("Java"));

        //Duyệt dữ liệu kiểu Map
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> ten : map1.entrySet()){
            System.out.println(ten.getKey() + ":" + ten.getValue());
        }
        for (Map.Entry<Integer, Double> ten : map2.entrySet()){
            System.out.println(ten.getKey() + ":" + ten.getValue());
        }


    }
}
