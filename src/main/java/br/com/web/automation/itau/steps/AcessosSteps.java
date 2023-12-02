package br.com.web.automation.itau.steps;

import br.com.web.automation.itau.driver.Driver;
import br.com.web.automation.itau.enums.Browser;
import br.com.web.automation.itau.pages.AcessosPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AcessosSteps {
    AcessosPage acessosPage;

    @Before
    public void iniciaNavegador() {
        new Driver(Browser.CHROME);
    }

    @After
    public void fechaNavegador() {
        Driver.getDriver().quit();
    }

    @Dado("que esteja na pagina inicial")
    public void queEstejaNaPaginaInicial() {
        Driver.getDriver().get("https://www.itau.com.br/");
        acessosPage = new AcessosPage();
        acessosPage.visibilityOfBtnAcessos();
    }

    @Quando("for realizado um clique no icone +acessos")
    public void forRealizadoUmCliqueNoIconeAcessos() {
        acessosPage.clickBtnAcessos();
        acessosPage.visibilityOfTituloModal();
    }
    @Entao("a janela modal deve ser exibida")
    public void aJanelaModalDeveSerExibida() {
        Assert.assertEquals("acesse sua conta", acessosPage.getTituloModalAcessos());
    }
}
