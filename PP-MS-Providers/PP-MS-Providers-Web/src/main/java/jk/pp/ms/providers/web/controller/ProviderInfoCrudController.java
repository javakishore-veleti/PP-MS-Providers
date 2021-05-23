package jk.pp.ms.providers.web.controller;

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
}
