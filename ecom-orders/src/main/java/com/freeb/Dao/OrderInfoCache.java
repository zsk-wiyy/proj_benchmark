package com.freeb.Dao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class OrderInfoCache {

    private static final Logger logger = LoggerFactory.getLogger(OrderInfoCache.class);

    static String ORDER_CACHE_IP;
    static Integer ORDER_CACHE_PORT;
    static String ORDER_USER;
    static String ORDER_PSW;

    private static JedisPool pool=null;

    private static JedisPool getPool(){
        // todo concurrency
        if(pool==null){
            JedisPoolConfig config = new JedisPoolConfig();

            config.setMaxTotal(500);
            config.setMaxIdle(5);
            config.setMaxWaitMillis(1000*10);

            config.setTestOnBorrow(true);

            pool = new JedisPool(config,ORDER_CACHE_IP,ORDER_CACHE_PORT,10000,ORDER_PSW);
        }
        return pool;
    }


//    static Jedis jedis;

    OrderInfoCache(String ip, Integer port, String psw){
        ORDER_CACHE_IP =ip;
        ORDER_CACHE_PORT =port;
        ORDER_PSW=psw;
//
//        jedis = new Jedis(ORDER_CACHE_IP, ORDER_CACHE_PORT);
//        jedis.auth(ORDER_PSW);
//
//
//
//        try(Connection conn = DriverManager.getConnection(ORDER_CACHE_IP,ORDER_USER,ORDER_PSW)){
//            logger.info("redis connected!");
//        }catch (SQLException e){
//            logger.error(String.format("redis connect failure %s",e.toString()));
//            // Notice here
//            e.printStackTrace();
//        }
        pool = getPool();
    }

    public static String getOrderListString(String key){
        String value=null;

        try{
            value = getPool().getResource().get(key);
        }catch (Exception e){
            logger.error(String.format("jedis error:{%s} trace:{%s}",e.toString(), Arrays.toString(e.getStackTrace())));
        }
        return value;
    }

    public static Boolean setexOrderListString(String key,String value,Integer seconds){

        try{
            getPool().getResource().setex(key,seconds,value);
        }catch (Exception e){
            logger.error(String.format("jedis error:{%s} trace:{%s}",e.toString(), Arrays.toString(e.getStackTrace())));
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        logger.debug("123 debug");
        logger.info("123 info");logger.error("123 error");
    }

}

