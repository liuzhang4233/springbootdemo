package com.wxdemo.utils;

import org.junit.Test;
import redis.clients.jedis.*;

import java.util.*;

public class RedisUtils {

    private Jedis jedis;//非切片客户端
    private JedisPool pool;//非切片连接池
    private ShardedJedisPool shardedJedisPool;//切片连接池  主要用于分布式，用于做主备
    private ShardedJedis shardedJedis;//切片客户端

    public static void main(String[] args) {
//        KeyOperate();
    }

    @Test
    public void test1() {
//        RedisUtils redis = new RedisUtils();
//        redis.show();
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(5);
//        set2.add(6);
//        set2.add(3);
//        set2.add(4);
//
//        Set<Integer> result = new HashSet<>();
//        Set<Integer> result1 = new HashSet<>();
//        result.addAll(set1);
//        result.addAll(set2);
//        System.out.println("并集:"+result);
//        result1.addAll(set1);
//        result1.retainAll(set2);
//        System.out.println("交集:"+result1);
//        result.removeAll(result1);
//        System.out.println("差集:"+result);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(12);
        list.add(10);
        list.add(6);
        list.add(9);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(200);
        set.add(22);
        set.add(210);
        set.add(16);
        set.add(19);
        System.out.println(set);
        list.removeAll(list);
        list.addAll(set);
        Collections.sort(list);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("3", "b");
        map.put("5", "c");
        map.put("8", "d");
        map.put("3", "e");
        map.put("2", "f");
        map.put("9", "g");
        map.put("11", "h");
        System.out.println(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }

    public RedisUtils() {
        initialPoll();
        initialSharededPoll();
        shardedJedis = shardedJedisPool.getResource();
        jedis = pool.getResource();
    }

    /**
     * 初始化非切片池
     */
    public void initialPoll() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setTestOnBorrow(false);
        config.setMaxIdle(5);
        config.setMaxWaitMillis(2000);
        config.setMaxTotal(20);

        pool = new JedisPool(config, "127.0.0.1", 6379);
    }

    /**
     * 初始化切片池
     */
    public void initialSharededPoll() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setTestOnBorrow(false);
        config.setMaxIdle(5);
        config.setMaxWaitMillis(2000);
        config.setMaxTotal(20);

        //slace 链接
        List<JedisShardInfo> shards = new ArrayList<>();
        shards.add(new JedisShardInfo("127.0.0.1", 6379, "master"));

        //构造池
        shardedJedisPool = new ShardedJedisPool(config, shards);
    }

    public void show() {
        KeyOperate();
        StringOperate();
        ListOperate();
        SetOperate();
        SortedSetOperate();
        HashOperate();
    }

    private void KeyOperate() {
        System.out.println("---key---");
//        String a = jedis.set("1","123");
//        System.out.println(a);
//        String s = jedis.get("1");
//        System.out.println(s);
////        System.out.println(jedis.del("1"));
////        String s1 = jedis.get("1");
////        System.out.println(s1);
//        Boolean flag = jedis.exists("1");
//        jedis.expire("1",1);
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        jedis.persist("1");
//        System.out.println(flag);
//        System.out.println(jedis.ttl("1"));
//        System.out.println(jedis.get("1"));
//        System.out.println(jedis.type("1"));
        System.out.println(jedis.get("1"));
    }

    private void StringOperate() {
        System.out.println(jedis.flushDB());
        ;
        System.out.println(jedis.set("1", "100"));
        System.out.println(jedis.get("1"));
//        System.out.println(jedis.del("2"));
        System.out.println(jedis.append("1", "222"));
        System.out.println(jedis.get("1"));
        System.out.println(jedis.mset("2", "200", "3", "300"));
        System.out.println(jedis.mget("1", "2"));
//        System.out.println(jedis.del(new String[]{"1","2"}));
//        System.out.println(jedis.get("1"));
//        System.out.println(jedis.get("2"));
//        System.out.println(jedis.get("3"));
        System.out.println(shardedJedis.setnx("4", "400"));
        System.out.println(shardedJedis.get("4"));
        System.out.println(shardedJedis.getSet("4", "123456789"));
        System.out.println(shardedJedis.get("4"));
        System.out.println(shardedJedis.getrange("4", 0, 2));
    }

    private void ListOperate() {

        jedis.flushAll();
//        shardedJedis.lpush("1","1");
//        shardedJedis.lpush("1","11");
//        shardedJedis.lpush("2","2");
//        shardedJedis.lpush("3","3");
//        shardedJedis.lpush("4","4");
//        shardedJedis.lpush("5","5");
//        shardedJedis.lpush("6","6");
////        shardedJedis.set("1","1");
////        shardedJedis.set("1","11");
//
//        List<String> lrange = shardedJedis.lrange("1", 0, -1);
//        System.out.println(lrange);
//        System.out.println(shardedJedis.llen("1"));

        jedis.lpush("1", "103");
        jedis.lpush("1", "101");
        jedis.lpush("1", "105");
        jedis.lpush("1", "109");
        jedis.lpush("1", "111");

        System.out.println(jedis.lrange("1", 0, -1));
        System.out.println(jedis.lrem("1", 1, "vector"));
        System.out.println(jedis.lrange("1", 0, -1));
//        System.out.println(jedis.lpop("1"));
//        System.out.println(jedis.lpop("1"));
        System.out.println(jedis.lrange("1", 0, -1));
//        System.out.println(jedis.set("1","111"));
//        System.out.println(jedis.get("1"));
//        System.out.println(jedis.lset("1",0,"111"));
//        System.out.println(jedis.lrange("1",0,-1));

        SortingParams sort = new SortingParams();
        sort.alpha();
        sort.limit(0, jedis.lrange("1", 0, -1).size());
        System.out.println(jedis.lrange("1", 1, -1));
        System.out.println(jedis.sort("1", sort));
        System.out.println(jedis.lindex("1", 3));//不会受到sort的影响
    }

    private void SetOperate() {
        jedis.flushDB();
        jedis.sadd("1", "107");
        jedis.sadd("1", "101");
        jedis.sadd("1", "102");
        jedis.sadd("1", "103");
//        System.out.println(jedis.smembers("1"));
//        jedis.srem("1","102");
        jedis.sadd("1", "101");
        System.out.println(jedis.smembers("1"));
        System.out.println(jedis.sismember("1", "107"));


        jedis.sadd("2", "104");
        jedis.sadd("2", "101");
        jedis.sadd("2", "105");
        System.out.println(jedis.smembers("1"));
        System.out.println(jedis.smembers("2"));
        System.out.println("差集:" + jedis.sdiff("1", "2"));
        System.out.println("交集:" + jedis.sinter("1", "2"));
        System.out.println("并集:" + jedis.sunion("1", "2"));
    }

    private void SortedSetOperate() {

    }

    private void HashOperate() {

    }
}
