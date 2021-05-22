package jk.pp.ms.providers.dao;

import org.springframework.stereotype.Repository;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderInfo;
import jk.pp.engg.foundations.common.dao.core.AppDomainNameDescCrudDAO;

@Repository
public interface ProviderInfoDAO extends AppDomainNameDescCrudDAO<IProviderInfo> {

}
