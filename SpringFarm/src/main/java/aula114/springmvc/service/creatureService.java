package aula114.springmvc.service;

import java.util.*;
import java.sql.SQLException;
import aula114.springmvc.domain.Creature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface creatureService {

	public List <Creature> viewCreatures (String nameOwner) throws SQLException;
	public int createCreature (String nameOwner) throws SQLException;

}
