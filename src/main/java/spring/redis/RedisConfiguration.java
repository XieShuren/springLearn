package spring.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfiguration {

	@Bean
	public RedisConnectionFactory redisCF() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		RedisStandaloneConfiguration standaloneConfiguration = jedisConnectionFactory.getStandaloneConfiguration();
		standaloneConfiguration.setHostName("localhost");
		standaloneConfiguration.setPort(6379);
		return jedisConnectionFactory;
	}
	
	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory rcf) {
		RedisTemplate<Long,Student> redisTemplate = new RedisTemplate<Long, Student>();
		redisTemplate.setConnectionFactory(rcf);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Student>(Student.class));
		return redisTemplate;
	}
	
}
