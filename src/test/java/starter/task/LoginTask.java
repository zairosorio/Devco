package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.ClearBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.Models.LoginDataModels;
import starter.search.LoginUi;

import java.security.SecureRandom;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    private SecureRandom random = new SecureRandom();

    private LoginDataModels loginDataModels;

    public LoginTask(LoginDataModels loginDataModels){
        this.loginDataModels = loginDataModels;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginUi.INPUT_USER,isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(LoginUi.INPUT_USER)
        );
        actor.attemptsTo(
                Enter.theValue(loginDataModels.getUser().trim()).into(LoginUi.INPUT_USER),
                Enter.keyValues(loginDataModels.getPass().trim()).into(LoginUi.INPUT_PASS),
                JavaScriptClick.on(LoginUi.BUTTON_LOGIN)
        );
    }

    public static LoginTask loginTask(LoginDataModels loginDataModels){
        return instrumented(LoginTask.class,loginDataModels);
    }


}
