package jk.pp.ms.providers.dao;

import org.springframework.stereotype.Repository;

import jk.pp.engg.foundations.common.dao.core.AppDomainNameDescCrudDAO;
import jk.pp.ms.providers.domain.ProviderType;

@Repository
public interface ProviderTypeDAO extends AppDomainNameDescCrudDAO<ProviderType> {

}
