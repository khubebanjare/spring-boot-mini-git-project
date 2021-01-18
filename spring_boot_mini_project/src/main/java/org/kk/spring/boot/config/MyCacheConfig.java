package org.kk.spring.boot.config;

import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionConfig;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizePolicy;

@Configuration
public class MyCacheConfig {

	public Config myConfig() {
		return new Config().setInstanceName("hazelCast-instance")
				.addMapConfig(
						//add per module one MapConfig
							new MapConfig()
								.setName("student-cache")
								.setTimeToLiveSeconds(2000)
								.setMaxIdleSeconds(200)
								.setEvictionConfig(new EvictionConfig().setEvictionPolicy(EvictionPolicy.LRU).setMaxSizePolicy(MaxSizePolicy.FREE_HEAP_SIZE))
						);
	}
}
