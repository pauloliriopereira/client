package br.com.imusica.client.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto 
{
	private Long id;
	private String nome;
	private Long preco;
	private Integer quantidade;
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId( Long id ) 
	{
		this.id = id;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome( String nome ) 
	{
		this.nome = nome;
	}
	
	public Long getPreco() 
	{
		return preco;
	}
	
	public void setPreco( Long preco ) 
	{
		this.preco = preco;
	}
	
	public Integer getQuantidade() 
	{
		return quantidade;
	}
	
	public void setQuantidade( Integer quantidade ) 
	{
		this.quantidade = quantidade;
	}	
}