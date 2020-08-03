package com.tyj.caffeine.config;


import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class CaffeineCacheConfig {


    public CacheManager  caffeineCacheManager(){
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        //cacheManager.setCaffeine(Caffeine);
        return  null;
    }

}
