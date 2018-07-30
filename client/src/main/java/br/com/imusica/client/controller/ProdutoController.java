package br.com.imusica.client.controller;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.imusica.client.modelo.Produto;
import br.com.imusica.client.producer.ProdutoProducer;

@Controller
public class ProdutoController 
{
	
	@RequestMapping( value = "buscarProdutoPorId", method = { RequestMethod.GET, RequestMethod.POST } )
	public String consultar( @RequestParam String id, Model model ) 
	{
		ProdutoProducer producer = new ProdutoProducer();
		Produto produto = producer.buscaPorId( converteNumero( id ).longValue() );
		model.addAttribute( "produtoAlterar", produto );
		return "produto/alterar";
	}
	
	@RequestMapping( value = "salvarProduto", method = RequestMethod.POST )
	public String salvar( @RequestParam String nome,
			              @RequestParam String preco,
			              @RequestParam String quantidade )
	{
		Produto produto = new Produto();
		produto.setNome( nome );
		produto.setPreco( converteNumero( preco ).longValue() );
		produto.setQuantidade( converteNumero( quantidade ).intValue() );
		ProdutoProducer producer = new ProdutoProducer();
		producer.salva( produto );
		return "produto/adicionado";
	}
	
	@RequestMapping( value = "alterarProduto", method = RequestMethod.POST )
	public String alterar( @RequestParam String id,
						   @RequestParam String nome,
            			   @RequestParam String preco,
            			   @RequestParam String quantidade ) 
	{
		Produto produto = new Produto();
		produto.setId( converteNumero( id ).longValue() );
		produto.setNome( nome );
		produto.setPreco( converteNumero( preco ).longValue() );
		produto.setQuantidade( converteNumero( quantidade ).intValue() );
		ProdutoProducer producer = new ProdutoProducer();
		producer.altera( produto );
		return "index";
	}
	
	@PostMapping( "listar" )
	public String listar( Model model ) 
	{
		ProdutoProducer producer = new ProdutoProducer();
		List<Produto> listaDeProdutos = producer.listar();
		model.addAttribute( "produtos", listaDeProdutos );
		return "produto/listar";
	}
	
	@RequestMapping( "remover" )
	public String remover( @RequestParam String id ) 
	{
		ProdutoProducer producer = new ProdutoProducer();
		producer.remove( converteNumero( id ).longValue() );
		return "index";
	}
	
	public Number converteNumero( String numero ) 
	{
		Number num = null;
		try 
		{
			num = NumberFormat.getInstance( new Locale ( "pt", "BR" ) ).parse( numero );
		} 
		catch( ParseException e ) 
		{
			e.printStackTrace();
		}
		return num;
	}
}