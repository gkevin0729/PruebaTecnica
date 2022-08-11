package prueba.tecnica.ban.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class SwitchWindow implements Interaction {
    public static SwitchWindow to() {
        return new SwitchWindow();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        StringBuilder parentUrl = new StringBuilder();
        String page2 = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String page1 : handles) {
            if (!page1.equalsIgnoreCase(page2)) {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(page1);
                parentUrl.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl());

            }
        }
        actor.remember("urlPDF", parentUrl.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl()));
    }
}
