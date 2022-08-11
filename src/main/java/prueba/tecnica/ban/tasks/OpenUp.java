package prueba.tecnica.ban.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import prueba.tecnica.ban.userinterface.BanistmoPage;

public class OpenUp implements Task {
    private prueba.tecnica.ban.userinterface.BanistmoPage BanistmoPage;


    public static Performable thepage() {
        return Tasks.instrumented(OpenUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(BanistmoPage));

    }
}
