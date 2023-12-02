package br.com.web.automation.itau.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcessosMap {
    @FindBy(id = "open_modal")
    public WebElement btnAcessos;
    @FindBy(id = "close_modal")
    public WebElement btnFechar;
    @FindBy(id = "title_modal")
    public WebElement tituloModal;
}
