package spring.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfig {

	@Bean
	public MongoClientFactoryBean  mongo() {
		MongoClientFactoryBean mongoClientFactoryBean = new MongoClientFactoryBean();
		mongoClientFactoryBean.setHost("localhost");
		mongoClientFactoryBean.setPort(27017);
		return mongoClientFactoryBean;
	}
	
	@Bean
	public MongoOperations mongoTemplate(MongoClient mongo) {
		return new MongoTemplate(mongo, "test");
	}
}
