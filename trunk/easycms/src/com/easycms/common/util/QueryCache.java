package com.easycms.common.util;

import java.util.HashMap;
import java.util.Map;

import javax.cache.Cache;
import javax.cache.CacheException;
import javax.cache.CacheFactory;
import javax.cache.CacheManager;
import javax.cache.CacheStatistics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.appengine.api.memcache.MemcacheService;

public class QueryCache {
	private static final Logger log = LoggerFactory.getLogger("QueryCache");

	private static QueryCache instance;

	private Cache cache;

	/*
	 * GCacheFactory.EXPIRATION_DELTA：在相对于值的放置时间的给定时间量（以整数秒数表示）后使值过期
	 * GCacheFactory.EXPIRATION_DELTA_MILLIS：在相对于值的放置时间的给定时间量（以整数毫秒数表示）后使值过期
	 * GCacheFactory.EXPIRATION：使值在给定日期和时间（以 java.util.Date 表示）后过期
	 * MemcacheService
	 * .SetPolicy.SET_ALWAYS：如果不存在具有该键的值则添加值，如果存在具有该键的值则替换现有值；此为默认
	 * MemcacheService
	 * .SetPolicy.ADD_ONLY_IF_NOT_PRESENT：如果不存在具有该键的值则添加值，如果存在该键则不执行任何操作
	 * MemcacheService
	 * .SetPolicy.REPLACE_ONLY_IF_PRESENT：如果不存在具有该键的值则不执行任何操作，如果存在具有该键的值则替换现有值
	 */
	private QueryCache() {

		try {
			CacheFactory cacheFactory = CacheManager.getInstance()
					.getCacheFactory();
			Map props = new HashMap();
			props.put(MemcacheService.SetPolicy.SET_ALWAYS, true);
			cache = cacheFactory.createCache(props);
			 CacheStatistics stats = cache.getCacheStatistics();
		} catch (CacheException e) {
			log.error("", "Error in creating the cache");

		}

	}

	public static synchronized QueryCache getInstance() {

		if (instance == null) {

			instance = new QueryCache();

		}

		return instance;

	}

	public static synchronized Cache getInstanceCache() {

		if (instance == null) {

			instance = new QueryCache();

		}

		return instance.cache;

	}

	public void putInCache(String address, String student) {

		cache.put(address, student);

	}

	public void put(String address, Object object) {

		cache.put(address, object);

	}

	public <T> T get(String key) {

		T o = (T) cache.get(key);
		return o;

	}

	public String findInCache(String address) {

		if (cache.containsKey(address)) {

			return (String) cache.get(address);

		} else {

			return null;

		}

	}
}
