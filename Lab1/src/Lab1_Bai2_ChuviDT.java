import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai cạnh của hình chữ nhật
        System.out.print("Nhập cạnh thứ nhất: ");
        double canh1 = scanner.nextDouble();
        
        System.out.print("Nhập cạnh thứ hai: ");
        double canh2 = scanner.nextDouble();
        
        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = 2 * (canh1 + canh2);
        double dienTich = canh1 * canh2;
        double canhNho = Math.min(canh1, canh2);
        
        // Xuất kết quả
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNho);
        
        // Đóng Scanner
        scanner.close();
    }
}
