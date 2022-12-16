package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {
    public static Target INPUT_USER = Target.the("")
            .locatedBy("//input[@data-test='username']");
    public static Target INPUT_PASS = Target.the("")
            .locatedBy("//input[@placeholder=\"Password\"]");
    public static Target BUTTON_LOGIN = Target.the("")
            .locatedBy("//input[@data-test=\"login-button\"]");
    public static Target USER_AMOUNT = Target.the("")
            .locatedBy("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/text()[3]");
    public static Target SELECT_OPTION = Target.the("")
            .locatedBy("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/text()");
    public static Target PASS = Target.the("")
            .locatedBy("//div[@class=\"login_password\"]/text()");


}
