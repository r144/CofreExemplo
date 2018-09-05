package cofre;

import cucumber.api.java.en.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author CINTIA
 */
public class DestravadoSteps extends CofrePMTest {

    @Given("^que o cofre esta destravado$")
    public void que_o_cofre_esta_destravado() throws Exception {
        when(sensorMock.travada()).thenReturn(Boolean.FALSE);
    }

    @Then("^deve retornar \"([^\"]*)\"$")
    public void deve_retornar(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

    @Given("^pressionei Limpar$")
    public void pressionei_Limpar() throws Exception {
        cofrePM.clear();
    }

    @Then("^retorna \"([^\"]*)\"$")
    public void retorna(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

    @Given("^que pressionei (\\d+)$")
    public void que_pressionei(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }

    @Given("^a porta esta fecha$")
    public void a_porta_esta_fecha() throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.FALSE);
    }

    @Then("^retorna a \"([^\"]*)\"$")
    public void retorna_a(String arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

    @Given("^a porta continua fechada$")
    public void a_porta_continua_fechada() throws Exception {
        when(sensorMock.fechada()).thenReturn(Boolean.TRUE);
    }
    
    @Given("^que apertei (\\d+)$")
    public void que_apertei(int arg1) throws Exception {
        cofrePM.pressButton(arg1);
    }


    @Then("^retorna a (\\d+)$")
    public void retorna_a(int arg1) throws Exception {
        assertEquals(arg1, cofrePM.getDisplay());
    }

}
