package nao.cycledev.springmongodb.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
@EnableMongoAuditing
public class MongoDBConfig extends AbstractMongoConfiguration {

    @Value("mongo.host")
    private String host;

    @Value("mongo.port")
    private int port;

    @Value("mongo.dbname")
    private String dbName;

    @Value("package.base")
    private String basePackage;

    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(host, port);
    }

    @Override
    protected String getMappingBasePackage() {
        return basePackage;
    }

}
