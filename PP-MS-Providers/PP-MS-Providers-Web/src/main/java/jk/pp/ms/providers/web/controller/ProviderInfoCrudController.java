package jk.pp.ms.providers.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.pp.engg.foundations.common.controller.core.AppCrudController;
import jk.pp.engg.foundations.common.core.domain.provider.IProviderInfo;
import jk.pp.engg.foundations.common.core.dto.provider.ProviderInfoCrudDTO;

@RestController
@RequestMapping(path = "/api/services/ms/providers/provider-info/crud", produces = "application/json")
public class ProviderInfoCrudController extends AppCrudController<IProviderInfo, ProviderInfoCrudDTO> {

}
