package aula114.springmvc.service;

import aula114.springmvc.domain.User;

import java.util.*;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import aula114.springmvc.service.creatureService;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private creatureService cService;

	public User altaNueva(String n, String e)
	{
		User usuarioNuevo = new User ();
		usuarioNuevo.setName(n);
		usuarioNuevo.setEmail(e);
		String sql = "insert into User set name='"+n+"', email='"+e+"'";
		usuarioNuevo.setId(jdbcTemplate.queryForObject("select id from user where email = ?", new Object[]{e}, String.class));

		//quizá no es lo más recomendable realizarlo desde este service, controller tampoco podría tener ese peso, para eliminar lo máximo posible que el peso recaiga en un controlador de vistas. Posible solución: Emplear un tercer service??
		try{
			cService.createCreature(n);
		}
		catch(SQLException a)
		{
			System.out.println("Excepción E: "+a);
		}
		finally{}

		return usuarioNuevo;
	}
	
	@Override
	public boolean compruebaUser (String name)
	{
		int contacto = 0;
		String sql = "select count(id) from user where name = ?";
		contacto = 	jdbcTemplate.queryForObject(sql, new Object[] {name}, Integer.class);
		
		
		System.out.println(contacto);
		if (contacto == 0)
		{
			return false;
		}
		return true;
	}

	@Override
	public User getDatos (String name)
	{
		String sql = "select * from user where name = ?";
		String n = name;

		User contacto = jdbcTemplate.queryForObject(sql, new Object[] {n}, new BeanPropertyRowMapper<User>(User.class));
		System.out.println("Resultado de contacto en SQL: "+contacto);
		
		if (!contacto.getId().equals("0"))
		{
			return contacto;
		}
		return new User();
	}


}