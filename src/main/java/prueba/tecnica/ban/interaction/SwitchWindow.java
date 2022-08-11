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

        StringBuilder url = new StringBuilder();
        String tag = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String parentPage : handles) {
            if (!parentPage.equalsIgnoreCase(tag)) {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(parentPage);
                url.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl());

            }
        }
        actor.remember("PDF", url.append(BrowseTheWeb.as(actor).getDriver().getCurrentUrl()));
    }
}
