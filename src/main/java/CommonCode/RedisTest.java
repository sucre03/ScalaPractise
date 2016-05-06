package CommonCode;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * Created by sucre on 16/4/28.
 */
public class RedisTest {
    private static void RedisString(Jedis rd){
        System.out.println(rd.ping());
        //add
        rd.set("book","scala");
        System.out.println(rd.get("book"));
    }
    private static void RedisList(Jedis rd){
        rd.lpush("book-list","scala");
        rd.lpush("book-list","java");
        rd.lpush("book-list","python");
        List<String> list = rd.lrange("book-list",0,rd.llen("book-list"));
        for(String s:list){
            System.out.println(s);
        }
    }
    private static void RedisKeys(Jedis rd){
        Set<String> set = rd.keys("*");
        for (String s:set){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Jedis rd = new Jedis("localhost",6379);
        RedisString(rd);
        RedisList(rd);
        RedisKeys(rd);
    }
}
