package jk.pp.ms.providers.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@ComponentScan(basePackages = { "jk.pp.ms.providers.domain", "jk.pp.ms.providers.dao", "jk.pp.ms.providers.service",
		"jk.pp.ms.providers.web" })
@EntityScan(basePackages = { "jk.pp.ms.providers.domain" })
@EnableJpaRepositories(basePackages = { "jk.pp.ms.providers.dao" })
@Import(value = { MSCommonGlobalConfig.class })
public class ProvidersWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ProvidersWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.PROVIDERS));

		app.run(args);
	}

}