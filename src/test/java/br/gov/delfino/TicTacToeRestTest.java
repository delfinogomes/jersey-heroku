package br.gov.delfino;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class TicTacToeRestTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(TicTacToeRest.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final RegistrarJogadorResponse responseMsg = target().path("ticTacToe/registrarJogador/Eu").request().get(RegistrarJogadorResponse.class);

        assertTrue(responseMsg.isStatusRegistro());
    }
}
