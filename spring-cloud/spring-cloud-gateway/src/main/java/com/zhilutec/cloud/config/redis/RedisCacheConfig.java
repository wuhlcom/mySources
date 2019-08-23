package com.zhilutec.cloud.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 用JdkSerializationRedisSerializer序列化的话，被序列化的对象必须实现Serializable接口
 * <p>
 * 如果需要保存对象为json的话推荐使用JacksonJsonRedisSerializer，它不仅可以将对象序列化，
 * 还可以将对象转换为json字符串并保存到redis中，但需要和jackson配合一起使用。
 * 用JacksonJsonRedisSerializer序列化的话，被序列化的对象不用实现Serializable接口。
 */
@Configuration
@EnableCaching
public class RedisCacheConfig extends CachingConfigurerSupport {
    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.database}")
    private Integer database;

    @Value("${spring.redis.jedis.pool.max-active}")
    private Integer maxActive;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private Integer maxWait;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private Integer maxIdle;

    @Value("${spring.redis.jedis.pool.min-idle}")
    private Integer minIdle;

    @Value("${spring.redis.timeout}")
    private Integer tiemout;

    // @Autowired
    // private RedisConnectionFactory redisConnectionFactory;

    // @Bean
    // public JedisPoolConfig jedisPoolConfig() {
    //     JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    //     jedisPoolConfig.setMaxTotal(maxActive);
    //     jedisPoolConfig.setMaxIdle(maxIdle);
    //     jedisPoolConfig.setMinIdle(minIdle);
    //     return jedisPoolConfig;
    // }


    //spring 1.5
    // @Bean
    // public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig poolConfig) {
    //     JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(poolConfig);
    //     jedisConnectionFactory.setHostName(host);
    //     jedisConnectionFactory.setPort(port);
    //     jedisConnectionFactory.setPassword(password);
    //     jedisConnectionFactory.setDatabase(database);
    //     jedisConnectionFactory.setTimeout(tiemout);
    //     jedisConnectionFactory.setUsePool(true);
    //     jedisConnectionFactory.setPoolConfig(poolConfig);
    //     return jedisConnectionFactory;
    // }


    // spring 2.0
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        RedisPassword redisPassword = RedisPassword.of(password);
        config.setDatabase(database);
        config.setHostName(host);
        config.setPassword(redisPassword);
        config.setPort(port);
        return new JedisConnectionFactory(config);
    }


    /**
     * 字符串类数据，使用此类来处理
     */
    @Bean
    StringRedisTemplate stringRedisTemplate(RedisConnectionFactory connectionFactory) {
        return new StringRedisTemplate(connectionFactory);
    }

    /**
     * 读取非序列化类时会出现
     * redisTemplate 序列化使用的jdkSerializeable, 存储二进制字节码, 所以自定义序列化类
     *
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<?, ?> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);


        //开启事务支持
        redisTemplate.setEnableTransactionSupport(true);

        // 设置key的序列化规则
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());

        // 设置自定义value的序列化规则
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new StringRedisSerializer());
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    /**
     * 实例化 HashOperations 对象,可以使用 Hash 类型操作
     */
    @Bean
    public HashOperations<?, ?, ?> hashOperations(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForHash();
    }

    /**
     * 实例化 ValueOperations 对象,可以使用 String 操作
     */
    @Bean
    public ValueOperations<?, ?> valueOperations(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForValue();
    }

    /**
     * 实例化 ListOperations 对象,可以使用 List 操作
     *
     * @return
     */
    @Bean
    public ListOperations<?, ?> listOperations(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForList();
    }

    /**
     * 实例化 ListOperations 对象,可以使用 List 操作
     *
     * @return
     */
    @Bean
    public ListOperations<?, ?> listStr(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForList();
    }


    /**
     * 实例化 SetOperations 对象,可以使用 Set 操作
     */
    @Bean
    public SetOperations<?, ?> setOperations(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForSet();
    }

    /**
     * 实例化 ZSetOperations 对象,可以使用 ZSet 操作
     */
    @Bean
    public ZSetOperations<?, ?> zSetOperations(RedisTemplate<?, ?> redisTemplate) {
        return redisTemplate.opsForZSet();
    }

}