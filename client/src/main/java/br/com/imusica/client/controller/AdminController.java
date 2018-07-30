package br.com.imusica.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController 
{	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/buscar")
	public String buscar()
	{
		return "produto/buscar";
	}
}