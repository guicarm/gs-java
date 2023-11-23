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

import app.vercel.nexus.beans.Email;
import app.vercel.nexus.bo.EmailBO;

@Path("/email")
public class EmailResource {
			
		private EmailBO emailBO = new EmailBO();	
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Email> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Email>) emailBO.secionarBo();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cadastroRs (Email email, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			emailBO.inserirBo(email);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(email.getIdEmail()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{idEmail}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response atualizaRs (Email email, @PathParam("idEmail") int idEmail) throws SQLException, ClassNotFoundException {
			emailBO.atualizarBo(email);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{idEmail}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deleteRs (@PathParam("idEmail") int idEmail) throws ClassNotFoundException, SQLException {
			emailBO.deletarBo(idEmail);
			return Response.ok().build();
		}

}
