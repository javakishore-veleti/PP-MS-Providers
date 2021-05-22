package jk.pp.ms.providers.dao;

import org.springframework.stereotype.Repository;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderType;
import jk.pp.engg.foundations.common.dao.core.AppDomainNameDescCrudDAO;

@Repository
public interface ProviderTypeDAO extends AppDomainNameDescCrudDAO<IProviderType> {

}
