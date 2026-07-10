package utils;
import io.qameta.allure.Attachment;


/**
 * Class Name : AllureAttachments
 * Description : Utility class to attach artifacts to Allure report
 *
 * @author Ashish Kumar
 */

public class AllureAttachments {

    @Attachment(value = "{name}", type = "image/png")
    public static byte[] attachScreenshot(String name) {
        return Screenshots.captureScreenshotAsBytes();
    }
}
