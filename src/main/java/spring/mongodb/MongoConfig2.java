package spring.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfig2 extends AbstractMongoConfiguration{

	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient("localhost", 27017);
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "test";
	}

}
