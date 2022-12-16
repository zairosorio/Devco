package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.Models.LoginDataModels;
import starter.navigation.NavigateTo;
import starter.task.LoginTask;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class LoginStepDefinitions {
    private Map<String, String> map;
    private LoginDataModels loginDataModels;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que zair esta en la pagina")
    public void queZairEstaEnLaPagina() {
        theActorCalled("actor").attemptsTo(
                NavigateTo.GoHomePage()
        );
    }

    @When("realizo login")
    public void realizo_login(DataTable dataTable) {
        map = dataTable.asMaps().get(0);
        loginDataModels = new LoginDataModels(map);
        theActorInTheSpotlight().attemptsTo(
                LoginTask.loginTask(loginDataModels)
        );
    }

    @Then("valido que el usuario  ingreso de manera Exitosa")
    public void valido_que_el_usuario_ingreso_de_manera_Exitosa() {

    }


}
