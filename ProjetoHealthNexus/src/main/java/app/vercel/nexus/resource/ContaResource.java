package app.vercel.nexus.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import app.vercel.nexus.beans.Conta;
import app.vercel.nexus.bo.ContaBO;



@Path("/conta")
public class ContaResource {
			
		private ContaBO contaBO = new ContaBO();	
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Conta> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Conta>) contaBO.secionarBo();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cadastroRs (Conta conta, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			contaBO.inserirBo(conta);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(conta.getIdConta()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{idConta}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response atualizaRs (Conta conta, @PathParam("idConta") int idConta) throws SQLException, ClassNotFoundException {
			contaBO.atualizarBo(conta);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{idConta}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deleteRs (@PathParam("idConta") int idConta) throws ClassNotFoundException, SQLException {
			contaBO.deletarBo(idConta);
			return Response.ok().build();
		}

}