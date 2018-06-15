import java.util.Scanner;

public class Vietlot {
    public static void main(String[] args) {
        int lottery = 12;
        System.out.println("Nhap so du doan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so du doan thu 1: ");
        int sothu1 = scanner.nextInt();
        if (sothu1==12)
            System.out.println("Ban da trung giai nhat 10.000$");
        else if (sothu1==21 )
            System.out.println("Ban da trung giai 3.000$");
        else if (sothu1==01 )
            System.out.println(" ban da trung giai 1000$");
        else if (sothu1==21 )
            System.out.println("ban da trung giai khong the nhan tiep phan thuong");

    }


}
