package aula114.springmvc.service;

import java.util.*;
import aula114.springmvc.domain.Creature;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;
import java.sql.SQLException;

@Service
public class creatureServiceImpl implements creatureService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List <Creature> viewCreatures (String name) throws SQLException
	{
		List <Creature> critters = new ArrayList();
		
		String sql = "select * from creatures where nameOwner = ?";
			//critters = 	jdbcTemplate.queryForObject(sql, new Object[] {name}, Creature);
		List <Map <String, Object>> map = 	jdbcTemplate.queryForList(sql, new Object[] {name}, new BeanPropertyRowMapper<Object>());
		return critters;
	}

	@Override
	public int createCreature (String name) throws SQLException
	{
		int result = 0;
		
		String sql = "insert into creatures set name='Desconocido', hungry=0, cleany=100, alive=1, nameOwner = ?";


		result = jdbcTemplate.queryForObject(sql, new Object[] {name}, Integer.class);
		System.out.println("Criaturas creadas "+result);
		return result;
	}
}
