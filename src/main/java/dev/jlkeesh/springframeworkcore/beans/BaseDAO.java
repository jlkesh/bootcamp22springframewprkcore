package dev.jlkeesh.springframeworkcore.beans;


import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ToString
@NoArgsConstructor
public class BaseDAO {
    @Value("${spring.datasource.url}")
    private  String url;
    @Value("${spring.datasource.user}")
    private  String user;
    @Value("${spring.datasource.password}")
    private  String password;
    @Value("${spring.datasource.database}")
    private  String database;
    @Value("${spring.datasource.schema}")
    private  String schema;
    @Value("${spring.datasource.driver}")
    private  String driver;

    public BaseDAO(String url, String user, String password, String database, String schema, String driver) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.database = database;
        this.schema = schema;
        this.driver = driver;
    }

}
