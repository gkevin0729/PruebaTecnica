package prueba.tecnica.ban.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import prueba.tecnica.ban.userinterface.DocumentPage;

public class SearchDocument implements Task {


    public static SearchDocument pageDocument() {
          return Tasks.instrumented(SearchDocument.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DocumentPage.toggleProduct),
                Click.on(DocumentPage.pageDeposit),
                Click.on(DocumentPage.pageAccount),
                Click.on(DocumentPage.titleDocument),
                Click.on(DocumentPage.documentPdf));



    }
}
