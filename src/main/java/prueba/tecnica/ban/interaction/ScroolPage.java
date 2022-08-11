package prueba.tecnica.ban.interaction;

import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScroolPage {

    public static class ScrollPage {
        public static ScrollToTarget to(String cssOrXpathForElement) {
            return instrumented(ScrollToTarget.class, Target.the(cssOrXpathForElement).locatedBy(cssOrXpathForElement));
        }
        public static ScrollToTarget to(Target target) {
            return new ScrollToTarget(target);
        }

    }

}
