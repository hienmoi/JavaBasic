package DieuKien;
public class SwitchCase {
    public static void main(String[] args) {
        String browser = " Chrome ";
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Chrome");
                break;//Thoát khỏi vòng switch, ko có break nó sẽ chạy tiếp câu lệnh tiếp theo mà ko cần kiểm tra case cho đến khi gặp break hoặc default
            case "firefox":
                System.out.println("Firefox");
                break;
            case "egde":
                System.out.println("Egde");
                break;
            default:
                System.out.println("Not in Chrome, Firefox or Egde");
                break;//ko nên bỏ break ở default
        }
    }
}
