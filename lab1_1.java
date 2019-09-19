import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String str =  scanner.nextLine();
        System.out.println("输入字符串为" + str);

        System.out.println("请输入一个整数");
        int number = scanner.nextInt();
        System.out.println("输入整数为" + number);
    }
}
