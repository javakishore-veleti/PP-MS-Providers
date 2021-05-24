package jk.pp.ms.providers.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.providers.domain.ProviderType;
import jk.pp.ms.providers.domain.ProviderTypeCrudDTO;
import jk.pp.ms.providers.service.ProviderTypeCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/providers/providertype/crud", produces = "application/json")
public class ProviderTyperudController extends AppCrudController<ProviderType, ProviderTypeCrudDTO> {

	@Autowired
	public ProviderTyperudController(ProviderTypeCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<ProviderTypeCrudDTO> populateInitialDataDomais() {

		List<ProviderTypeCrudDTO> initialDataDomains = new ArrayList<ProviderTypeCrudDTO>();

		ProviderTypeCrudDTO crudDTO = null;
		ProviderType asset = null;

		int length = 25;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = null;

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new ProviderTypeCrudDTO();

			asset = new ProviderType();

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

			asset.setName(generatedString);
			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}
}
