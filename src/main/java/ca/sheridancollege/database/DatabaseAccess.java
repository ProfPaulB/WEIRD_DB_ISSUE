package ca.sheridancollege.database;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;
	
	public void insertStudent() {
		
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		String query = "INSERT INTO student(name) VALUES ('Bugs Bunny')";
		
		int rowsAffected = jdbc.update(query, new HashMap());
		
		if (rowsAffected > 0) System.out.println("student inserted");
//		
//		List<Student> students = jdbc.query("select * from student", namedParameters);
	}
}
