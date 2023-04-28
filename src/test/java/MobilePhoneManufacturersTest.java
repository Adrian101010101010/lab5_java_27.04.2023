import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MobilePhoneManufacturersTest {
    MobilePhoneManufacturers mobilePhoneManufacturers = new MobilePhoneManufacturers();
    @Test
    public void testReplaceManufacturerNames() {

        String initialText1 = "I have an Apple iPhone and an Apple Watch";
        String expectedText1 = null;
        mobilePhoneManufacturers.initialText = initialText1;
        mobilePhoneManufacturers.replaceManufacturerNames();
        assertEquals(expectedText1, mobilePhoneManufacturers.result);

        MobilePhoneManufacturers.main(null);
    }
    @Test
    public  void testReplaceManufacturerNames1() {

        String initialText2 = "I have a Samsung Galaxy and a Samsung Smart TV";
        String expectedText2 = null;
        mobilePhoneManufacturers.initialText = initialText2;
        mobilePhoneManufacturers.manufacturerName = "Samsung";
        mobilePhoneManufacturers.replacementText = "Nokia";
        mobilePhoneManufacturers.replaceManufacturerNames();
        assertEquals(expectedText2, mobilePhoneManufacturers.result);
    }

}
