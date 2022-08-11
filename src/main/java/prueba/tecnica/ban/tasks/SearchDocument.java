package prueba.tecnica.ban.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import prueba.tecnica.ban.interaction.ScroolPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.tecnica.ban.userinterface.DocumentPage.*;

public class SearchDocument implements Task {


    public static SearchDocument pageDocument() {
          return instrumented(SearchDocument.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(toggleProduct),
                Click.on(pageDeposit),
                Click.on(pageAccount),
                Click.on(titleDocument));
        actor.attemptsTo(ScroolPage.ScrollPage.to(documentPdf),
                Click.on(documentPdf));





    }
}
