/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuoc.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static phuoc.util.MathUtility.*;

/**
 *
 * @author SE140331
 */
public class MathUtilityTest {

    @Test // @Test biến hàm này thành public static void main()
    // cách đặt tên hàm sẽ nói lên mục tiêu test hàm, có nhiều quy tắc đặt tên hàm test
    public void getFactorial_Runswell_IfValidArgument() {
        assertEquals(120, getFactorial(5)); // xanh vì 
    }

    // ta cần test xem có ném về ngoại lệ hay không???
    // nếu đúng là ném về ngoại lệ IllegalArgumentException trong
    // tình huống giai thừa -5 thì tao có màu xanh
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfValidArgument() {
        getFactorial(-5);
    }
    // ngoại lệ không phải là 1 value để đem ra so sánh chỉ có thể kiểm tra
    // coi nó có xuất hiện hay không??
}
