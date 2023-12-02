package br.com.web.automation.itau.pages;

import br.com.web.automation.itau.driver.Driver;
import br.com.web.automation.itau.maps.AcessosMap;
import org.openqa.selenium.support.PageFactory;

public class AcessosPage {
    public AcessosMap acessosMap;

    public AcessosPage(){
        acessosMap = new AcessosMap();
        PageFactory.initElements(Driver.getDriver(), acessosMap);
    }

    public void clickBtnAcessos(){
        Driver.visibilityOf(acessosMap.btnAcessos);
        acessosMap.btnAcessos.click();
    }

    public String getTituloModalAcessos(){
        return acessosMap.tituloModal.getText();
    }

    public void visibilityOfBtnAcessos(){
        Driver.visibilityOf(acessosMap.btnAcessos);
    }

    public void visibilityOfTituloModal(){
        Driver.visibilityOf(acessosMap.tituloModal);
    }
}
