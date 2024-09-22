package spring.mvc.sakila.configure;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SakilaRootConfig {
	@Bean
	public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword(System.getenv("DB_PASSWORD"));
        
        // Connection Pool
        dataSource.setInitialSize(5);
        dataSource.setMaxTotal(10);
        dataSource.setMaxIdle(5);
        
        return dataSource;		
	}
}