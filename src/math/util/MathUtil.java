/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import java.util.Scanner;
import static phuoc.util.MathUtility.*;
// câu lệnh từ JDK 8 (5), khai báo sẵn hàm static
// ở dưới gọi hàm static ko cần chấm, y chang C, chỉ áp dụng cho static

/**
 *
 * @author SE140331
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long expected = 120; // mong nhận về 120 nếu gọi hàm 5!
        long actual = getFactorial(5);
        System.out.println("5!: Expected: " + expected + "; Actual: " + actual);

        System.out.println("6!: " + getFactorial(6));
        System.out.println("0!: " + getFactorial(0));

        // expected: IllegalArgurmentException if -5!
        System.out.println("-5!: " + getFactorial(-5));
        System.out.println("Pi: " + PI);
    }

}
