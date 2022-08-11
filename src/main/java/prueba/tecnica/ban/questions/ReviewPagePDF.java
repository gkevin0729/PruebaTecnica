package prueba.tecnica.ban.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import prueba.tecnica.ban.interaction.SwitchWindow;

public class ReviewPagePDF implements Question<Boolean> {
    private String doc;

    public ReviewPagePDF(String documented) {
        this.doc = documented;
    }

    public static ReviewPagePDF document(String doc) {
        return new ReviewPagePDF(doc);
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        String link;
        actor.attemptsTo(SwitchWindow.to());
        link = actor.recall("urlPDF").toString().replaceFirst("-"," ").replaceFirst("\\+","-")
                .replace("%","/")
                .replace("233.","233/")
                .replaceAll("\\+"," ");


        System.out.println(link);
        System.out.println(doc);

        return link.contains(doc);
    }
}
