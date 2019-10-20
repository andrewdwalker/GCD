import org.junit.Assert
import org.junit.Test
//import org.junit.jupiter.api.Assertions.*

internal class MyMathTest {

    @Test
    fun GCD() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 3, a.GCD(9,3))
    }

    @Test
    fun GCDTwoNegatives() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 8, a.GCD(-48,8))
    }

    @Test
    fun GCDOneNegatives() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 8, a.GCD(-8,72))
    }

    @Test
    fun GCDOneAndSomeNumberTest1() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 1, a.GCD(1,3))
    }
    @Test
    fun GCDOneAndSomeNumberTest2() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 1, a.GCD(1,720000))
    }

    @Test
    fun GCDTwoAndSomeNumberTest2() {
        var a = MyMath()

        Assert.assertEquals("Wrong result for GCD", 2, a.GCD(2,720000))
    }
}