package prueba.tecnica.ban.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DocumentPage extends PageObject {
    public static final Target toggleProduct= Target.the("deploy toggle")
                    .located(By.xpath("//a[@class='dropdown-toggle']"));
    public static final Target pageDeposit= Target.the("access the Deposit page")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/empresas/productos-y-servicios/depositos/']"));
    public static final Target pageAccount= Target.the("access the savings account")
            .located(By.xpath("(//a[@title='Cuenta de Ahorro Comercial'])[1]"));

    public static final Target titleDocument= Target.the("select option document")
            .located(By.xpath("//a[@href='#tab5']"));

    public static final Target documentPdf= Target.the("click document")
            .located(By.xpath("(//img[@src='/wps/wcm/connect/www.banistmo.com11237/b5812573-aa98-42f4-8ee1-f2a4bd15e467/pdf-icon.png?MOD=AJPERES&CACHEID=ROOTWORKSPACE.Z18_7O9GHBG0O0M4A0Q3JGMS8408B6-b5812573-aa98-42f4-8ee1-f2a4bd15e467-m1cIl8g'])[4]"));






}
