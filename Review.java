import java.util.Scanner;

public class Review {
    public static void InReview() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n : ");
        int n = sc.nextInt();
        int sum1 = 0;
        float sum = 0;
        double sum2 = 0;

        //Tính tổng theo công thức S(n) = 1 +1/2 +1/3 +...+ 1/n
        if (n <= 0) {
            System.out.println("Bạn cần nhập số nguyên dương");
        } else {

            for (int i = 1; i <= n; i++) {
                sum = sum + (float) (1.0 / i);
            }
            System.out.println("Tổng S(n)2 = " + sum);
        }

        //Tính tổng theo công thứ S(n) = 1^2 + 2^2 + ...+ n^2
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum1 = sum1 + i * i;
            }
            System.out.println("Tổng S(n)1 = " + sum1);
        }

        //Tính tổng theo công thức S(n) = (2n+1)/(2n+2)
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum2 = sum2 + (2 * i + 1.0) / (2 * i + 2.0);
            }
            System.out.println("Tổng S(n)3 = " + sum2);
        }

        //In hình tam giác
        System.out.println("Nhập chiều cao của tam giác");
        int h;
        do {
            h = sc.nextInt();
        } while (h <= 0);

        for (int i = 1; i <= h; i++) {
            for (int z = 1; z <= h-i; z++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //In hình chữ nhật
        System.out.println("Nhập chiều dài của hình chữ nhật ");
        int high;
        int widgh;
        do {
            high = sc.nextInt();
        } while (h <= 0);
        System.out.println("Nhập chiều rộng của hình chữ nhật ");
        do {
            widgh = sc.nextInt();
        } while (h <= 0);
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= widgh; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }


    }
}
