package jk.pp.ms.providers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.providers.dao.ProviderInfoDAO;
import jk.pp.ms.providers.domain.ProviderInfo;
import jk.pp.ms.providers.domain.ProviderInfoCrudDTO;

@Service
public class ProvideInfoCrudServiceImpl extends AppCrudServiceImpl<ProviderInfo, ProviderInfoCrudDTO>
		implements ProviderInfoCrudService {

	public static final String BEAN_ID = ProvideInfoCrudServiceImpl.class.getSimpleName();

	@Autowired
	public ProvideInfoCrudServiceImpl(ProviderInfoDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
