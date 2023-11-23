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

import app.vercel.nexus.beans.Especialista;
import app.vercel.nexus.bo.EspecialistaBO;

@Path("/especialista")
public class EspecialistaResource {
			
		private EspecialistaBO especialistaBO = new EspecialistaBO();	
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Especialista> buscar() throws SQLException, ClassNotFoundException {
			return (ArrayList<Especialista>) especialistaBO.secionarBo();
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cadastroRs (Especialista especialista, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
			especialistaBO.inserirBo(especialista);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(especialista.getIdEspecialista()));
			return Response.created(builder.build()).build();		
		}
		
		@PUT
		@Path("/{idEspecialista}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response atualizaRs (Especialista especialista, @PathParam("idEspecialista") int idEspecialista) throws SQLException, ClassNotFoundException {
			especialistaBO.atualizarBo(especialista);
			return Response.ok().build();
		}
		
		@DELETE
		@Path("/{idEspecialista}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response deleteRs (@PathParam("idEspecialista") int idEspecialista) throws ClassNotFoundException, SQLException {
			especialistaBO.deletarBo(idEspecialista);
			return Response.ok().build();
		}
}
