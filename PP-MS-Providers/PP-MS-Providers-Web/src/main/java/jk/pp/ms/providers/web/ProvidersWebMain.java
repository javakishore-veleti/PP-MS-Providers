package jk.pp.ms.providers.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import jk.pp.ms.commons.configs.MSCommonGlobalConfig;
import jk.pp.ms.commons.configs.MSType;

@SpringBootApplication
@Import(value = { MSCommonGlobalConfig.class, ProvidersConfig.class })
public class ProvidersWebMain {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ProvidersWebMain.class);
		app.setAdditionalProfiles(MSCommonGlobalConfig.buildAMSStartupProfiles(MSType.PROVIDERS));

		app.run(args);
	}

}