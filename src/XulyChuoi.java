public class XulyChuoi {
    public static void main(String[] args) {
        String s1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String s2 = "Contrary to popular belief, Lorem Ipsum is not simply random text";
        String s3 = "Tôi là Hiền";
        String s4 = "Tôi là Hiền";
        //Chuỗi bắt đâu từ 0
        //Khoảng trắng cũng tính là 1 ký tự
        //Cắt chuỗi
        System.out.println(s1.substring(11));
        System.out.println(s1.substring(10,20));

        //Ghép chuỗi
        System.out.println(s1+ "," + s2);
        System.out.println(s3.concat(s4).concat("hehe"));

        //chuyển in hoa - thường
        System.out.println(s2.toLowerCase());//chữ thường
        System.out.println(s2.toUpperCase());//in hoa
        //Caắt khoảng trắng 2 đầu
        System.out.println(s3.trim());
        //Độ dài chuỗi
        System.out.println(s2.length());

        //Tìm kiếm ký tự
        System.out.println(s1.charAt(6));
        //So sánh chuỗi
        //So sánh bằng

        System.out.println(s3.equals(s4));
        //So sánh chứa
        System.out.println(s4.contains("Hiền"));


    }
}
