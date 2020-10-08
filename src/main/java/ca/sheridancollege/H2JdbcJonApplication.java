package ca.sheridancollege;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class H2JdbcJonApplication {

	public static void main(String[] args) throws SQLException {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(H2JdbcJonApplication.class, args);
		
		DataSource ds = (DataSource) ctx.getBean("dataSource");
		
		System.out.println(ds.getConnection().getCatalog());
		
	}

}
