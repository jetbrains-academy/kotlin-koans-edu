import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage

class TestFold {
    @Test(timeout = 1000)
    fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(lucas, Canberra,
                        order(idea),
                        order(webStorm)
                ),
                customer(reka, Budapest,
                        order(idea),
                        order(youTrack)
                )
        )
        Assert.assertTrue(errorMessage("getProductsOrderedByAll") +
                "The product (products) ordered by all customers should be added to the set",
                setOf(idea) == testShop.getProductsOrderedByAll())
    }
}
