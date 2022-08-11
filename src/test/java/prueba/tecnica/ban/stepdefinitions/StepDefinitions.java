package prueba.tecnica.ban.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import prueba.tecnica.ban.questions.ReviewPagePDF;
import prueba.tecnica.ban.tasks.OpenUp;
import prueba.tecnica.ban.tasks.SearchDocument;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the kevin wants to document pdf$")
    public void the_kevin_wants_to_document_pdf() {
        OnStage.theActorCalled("Kevin").wasAbleTo(OpenUp.thepage());


    }


    @When("^he search document in the page de banistmo$")
    public void he_search_document_in_the_page_de_banistmo() {
        theActorInTheSpotlight().attemptsTo(SearchDocument.pageDocument());

    }

    @Then("^he check the document (.*)")
    public void he_check_the_document_Contrato_Único_de_Productos_y_Servicios_Bancarios_pdf(String doc){
        theActorInTheSpotlight().should(seeThat(ReviewPagePDF.document(doc)));



    }

}
