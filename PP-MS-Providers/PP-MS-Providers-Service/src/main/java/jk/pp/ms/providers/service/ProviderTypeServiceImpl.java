package jk.pp.ms.providers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderType;
import jk.pp.engg.foundations.common.core.dto.provider.ProviderTypeCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.providers.dao.ProviderTypeDAO;

@Service
public class ProviderTypeServiceImpl extends AppCrudServiceImpl<IProviderType, ProviderTypeCrudDTO>
		implements ProviderTypeService {

	public static final String BEAN_ID = ProviderTypeServiceImpl.class.getSimpleName();

	@Autowired
	public ProviderTypeServiceImpl(ProviderTypeDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
