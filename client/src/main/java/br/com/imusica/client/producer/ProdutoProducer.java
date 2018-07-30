package br.com.imusica.client.producer;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.imusica.client.modelo.Produto;

public class ProdutoProducer 
{
	private Client client;
	private String endpoint = "http://localhost:8080/rest/cadastro";
	
	public ProdutoProducer() 
	{
		this.client = ClientBuilder.newClient();
	}
	
	public void salva( Produto produto ) 
	{
		Response response = this.client.target( endpoint )
				                       .path( "/salvar" )
				                       .request( MediaType.APPLICATION_JSON )
				                       .post( Entity.entity( produto, MediaType.APPLICATION_JSON ) ); 

		try 
		{	
			if( response.getStatus() != 201 ) 
			{
			   throw new RuntimeException( "Failed : HTTP error code : " + response.getStatus() );
			}	
		} 
		catch( Exception e ) 
		{
			e.printStackTrace();
		}
	}
	
	public void remove( Long id ) 
	{
		Response response = this.client.target( endpoint )
                .path( "/remover/".concat( id.toString() ) )
                .request()
                .delete();
	}
	
	public void altera( Produto produto ) 
	{
		Response response = this.client.target( endpoint )
                .path( "/alterar" )
                .request( MediaType.APPLICATION_JSON )
                .put( Entity.entity( produto, MediaType.APPLICATION_JSON ) ); 

		try 
		{	
			if( response.getStatus() != 200 ) 
			{
				throw new RuntimeException( "Failed : HTTP error code : " + response.getStatus() );
			}	
		} 
		catch( Exception e ) 
		{
			e.printStackTrace();
		}
	}
	
	public Produto buscaPorId( Long id ) 
	{
		Produto produto = this.client.target( endpoint )
                .path( "/buscar/".concat( id.toString() ) )
                .request( MediaType.APPLICATION_JSON )
                .get( Produto.class );
                 
		return produto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listar() 
	{
		List<Produto> produtos = this.client.target( endpoint )
                							.path( "/listar" )
                							.request( MediaType.APPLICATION_JSON )
                							.get( List.class );
                 
		return produtos;
	}
}