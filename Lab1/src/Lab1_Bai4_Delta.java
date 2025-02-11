import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số a, b, c của phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Xuất kết quả
        System.out.println("\nGiá trị delta: " + delta);
        if (delta >= 0) {
            System.out.println("Căn delta: " + Math.sqrt(delta));
        } else {
            System.out.println("Delta âm, không thể tính căn delta.");
        }
        
        // Đóng Scanner
        scanner.close();
    }
}

