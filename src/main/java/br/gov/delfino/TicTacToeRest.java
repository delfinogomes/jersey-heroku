package br.gov.delfino;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ticTacToe")
public class TicTacToeRest {

	@GET
	@Path("/registrarJogador/{nomeJogador}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarJogador(@PathParam("nomeJogador") String nomeJogador) {
		RegistrarJogadorResponse resp = new RegistrarJogadorResponse();
		resp.setNomeJogador(nomeJogador);
		resp.setStatusRegistro(true);
		return Response.ok(resp).build();
	}
	
	@GET
	@Path("/sairDoJogo/{nomeJogador}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sairDoJogo(@PathParam("nomeJogador") String nomeJogador) {
		return Response.ok().build();
	}
	
}
