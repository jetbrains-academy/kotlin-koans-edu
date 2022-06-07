import org.junit.Test
import org.junit.Assert

class TestExtensionFunctions() {
    @Test(timeout = 1000)
    fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
        Assert.assertEquals("Rational number creation error: ", RationalNumber(10, 1), 10.r())
    }

    @Test(timeout = 1000)
    fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
        Assert.assertEquals("Rational number creation error: ", RationalNumber(7, 9), Pair(7, 9).r())
    }
}