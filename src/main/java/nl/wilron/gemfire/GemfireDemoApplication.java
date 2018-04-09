package nl.wilron.gemfire;

import nl.wilron.gemfire.domain.Counter;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
@ClientCacheApplication(name = "GemfireDemoApplication", logLevel = "error")
@EnableEntityDefinedRegions(basePackageClasses = Counter.class,
		clientRegionShortcut = ClientRegionShortcut.LOCAL)
@EnableGemfireRepositories
public class GemfireDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GemfireDemoApplication.class, args);
	}
}
