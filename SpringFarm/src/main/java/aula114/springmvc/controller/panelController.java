package aula114.springmvc.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import aula114.springmvc.domain.User;
import aula114.springmvc.domain.Creature;
import aula114.springmvc.service.creatureService;
import aula114.springmvc.service.userService;

@Controller
public class panelController{

	@Autowired
	private userService uService;
	
	@Autowired
	private creatureService cService;


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/")
	public String cargarPanel(Model model)
	{
		return "index";
	}

	@RequestMapping("/enviaAlta")
	public String altaNueva(Model model, @RequestParam("user") String name, @RequestParam("mail") String mail)
	{
		try 
		{
			User nuevoUser = uService.altaNueva(name, mail);
			cService.createCreature(name);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			return "index";
		}
	}

	@RequestMapping("/mipanel")
	public String cargarPanel(Model model, @RequestParam("user") String name)
	{
		boolean result = uService.compruebaUser(name);
		if (result)
		{
			User user = uService.getDatos(name);
			model.addAttribute("nameOwner", user);
			try 
			{
				List <Creature> c = cService.viewCreatures(name);
				model.addAttribute("c", c);
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			finally
			{
				return "pantallaPrincipal";
			}
		}
		return "formAlta";
	}
}
