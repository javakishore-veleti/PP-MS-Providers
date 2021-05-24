package jk.pp.ms.providers.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.ms.providers.domain.ProviderInfo;
import jk.pp.ms.providers.domain.ProviderInfoCrudDTO;
import jk.pp.ms.providers.service.ProviderInfoCrudService;

@RestController
@RequestMapping(path = "/api/services/ms/providers/providerinfo/crud", produces = "application/json")
public class ProviderInfoCrudController extends AppCrudController<ProviderInfo, ProviderInfoCrudDTO> {

	@Autowired
	public ProviderInfoCrudController(ProviderInfoCrudService service) {
		super.setCrudService(service);
	}

	@Override
	public List<ProviderInfoCrudDTO> populateInitialDataDomais() {

		List<ProviderInfoCrudDTO> initialDataDomains = new ArrayList<ProviderInfoCrudDTO>();

		ProviderInfoCrudDTO crudDTO = null;
		ProviderInfo asset = null;

		int length = 25;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = null;

		for (int ctr = 1; ctr <= 10; ++ctr) {
			crudDTO = new ProviderInfoCrudDTO();

			asset = new ProviderInfo();

			generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

			asset.setName(generatedString);
			crudDTO.setDomain(asset);

			initialDataDomains.add(crudDTO);
		}

		return initialDataDomains;
	}
}
