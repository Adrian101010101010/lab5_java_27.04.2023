import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilePhoneManufacturers {
    public Object result;
    String initialText = "I have iPhone";
    String manufacturerName = "Apple";
    String replacementText = "Samsung";

    public static void main(String[] args) {
        MobilePhoneManufacturers mobilePhoneManufacturers = new MobilePhoneManufacturers();
        mobilePhoneManufacturers.replaceManufacturerNames();

    }

    public void replaceManufacturerNames() {
        Pattern pattern = Pattern.compile(manufacturerName, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(initialText);
        String result = matcher.replaceAll(replacementText);
        System.out.println(result);
    }


}

