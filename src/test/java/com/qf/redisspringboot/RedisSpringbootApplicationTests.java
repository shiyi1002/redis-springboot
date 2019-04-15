package com.qf.redisspringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisSpringbootApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.opsForValue().set("age",28);
		redisTemplate.opsForValue().set("money",456.66);
		double money= (double) redisTemplate.opsForValue().get("money");
		System.out.println(money);
	}




}
