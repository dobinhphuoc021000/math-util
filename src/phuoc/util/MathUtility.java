/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuoc.util;

/**
 *
 * @author SE140331
 */
public class MathUtility {

    // clasa này fake class Math truyền thống của JDK
    // Math của JDK có .abs() .sqrt() .sin() .PI
    // chúng toàn là static, vì là thư viện dùng chung
    public static final double PI = 3.1415;

    // hàm tính giai thừa n! = 1.2.3.4..n
    // 0! = 1! = 1
//    public static long getFactorial(int n){
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("N must be between 0...20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    // minh họa khái niệm Refactoring - tối ưu, chỉnh sửa lại code cho tốt hơn
    // và minh họa cho khái niệm Regression Test, test hồi quy, test lại những gì
    // đà từng test XANH, để check xem code còn XANH như ngày xưa không
    // sau khi đã sửa code
    // viết đệ quy cho hoành tráng
    // gọi lại chính mình với 1 quy mô khác
    // 5! = 5.4!, bắt tính 5!, khoan, đi tính 4! rồi tính tiếp
    // 4! =4.3! .....
    // đệ quy phải có điểm dừng, không đi miết qà
    // rất dễ bị lặp vô tận nếu không có dừng
    // 1!= 1, quy ước rồi, dừng, hồi ngược lại lên trên ra 5!
    // result: n! = n * (n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; // điều kiện dừng, lùi n mãi cũng phải đến lúc d
        }
        return n * getFactorial(n - 1);
    }
}
