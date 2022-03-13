package co.com.ias.training.ServicioMantenimiento.infrastructure.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    //Se crea una dependencia con la anotación Bean
    @Bean
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/training");
        config.setUsername("mysql_user");
        config.setPassword("mysql_password");

        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }
}
