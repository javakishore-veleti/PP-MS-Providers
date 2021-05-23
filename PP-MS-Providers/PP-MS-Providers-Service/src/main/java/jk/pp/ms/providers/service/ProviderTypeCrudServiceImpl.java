package jk.pp.ms.providers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.providers.dao.ProviderTypeDAO;
import jk.pp.ms.providers.domain.ProviderType;
import jk.pp.ms.providers.domain.ProviderTypeCrudDTO;

@Service
public class ProviderTypeCrudServiceImpl extends AppCrudServiceImpl<ProviderType, ProviderTypeCrudDTO>
		implements ProviderTypeCrudService {

	public static final String BEAN_ID = ProviderTypeCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ProviderTypeCrudServiceImpl(ProviderTypeDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}

}
