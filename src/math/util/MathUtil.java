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
    // muốn kết luận hàm mình ổn hàm mình ngon ta phải nhìn bằng mắt kết quả chạy của hàm
    // và so sánh  với kì vọng
    // làm từng trường hợp chạy hàm ~ test case
    // cách này ổn nhưng mất sức
    
    // NÂNG CAO: DÙNG MÀU SẮC, XANH-ĐỎ KẾT LUẬN
    // TA THẤY XANH, HÀM Ý MỌI CASE MỌI TÌNH HUỐNG ỔN
    // TA THẤY ĐỎ, CHỈ 1 THẰNG ĐỎ COI NHƯ TOANG
    // TA XÀI THÊM 1 FRAMEWORK, UNIT TEST NÓI CHUNG
    // JUNIT, TESTING, NUNIT.... LÀ NHỮNG FRAMEWORK CỤ THỂ ĐỂ GIÚP TEST CÁC HÀM
    // MỘT CÁCH HIỆU QUẢ
    // DÙNG NÓ TA TÍCH HỢP VÀO 1 QUY TRÌNH LÀM PHẦN MỀM LỚN HƠN -CI/CT/CD/DEVOPS
}
