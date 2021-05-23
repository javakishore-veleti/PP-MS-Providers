package jk.pp.ms.providers.web.controller;

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
}
