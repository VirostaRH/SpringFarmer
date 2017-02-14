package aula114.springmvc.service;

import java.util.*;
import java.sql.SQLException;
import org.springframework.stereotype.Service;
import aula114.springmvc.domain.User;

@Service
public interface userService {

	public User altaNueva(String n, String e) throws SQLException;
	public boolean compruebaUser (String name);
	public User getDatos (String name);
}
