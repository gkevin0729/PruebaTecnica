package prueba.tecnica.ban.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import prueba.tecnica.ban.interaction.SwitchWindow;

public class ReviewPagePDF implements Question<Boolean> {
    private String doc;

    public ReviewPagePDF(String document) {
        this.doc= document;
    }

    public static ReviewPagePDF document(String doc) {
        return new ReviewPagePDF(doc);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String link;
        boolean resp;

        actor.attemptsTo(SwitchWindow.to());
        link = actor.recall("urlPDF").toString().replaceAll("\\+", " ");

        System.out.println(link);
        System.out.println(link);

        return link.contains(doc);
    }
}
