package jk.pp.ms.providers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderInfo;
import jk.pp.engg.foundations.common.core.dto.provider.ProviderInfoCrudDTO;
import jk.pp.engg.foundations.common.service.core.AppCrudServiceImpl;
import jk.pp.ms.providers.dao.ProviderInfoDAO;

@Service
public class ProvideInfoServiceImpl extends AppCrudServiceImpl<IProviderInfo, ProviderInfoCrudDTO>
		implements ProviderInfoService {

	public static final String BEAN_ID = ProvideInfoServiceImpl.class.getSimpleName();

	@Autowired
	public ProvideInfoServiceImpl(ProviderInfoDAO crudDAO) {
		super.setCrudServiceImplRefId(BEAN_ID);
		super.setCrudDAO(crudDAO);
	}
}
