package jk.pp.ms.providers.dao;

import org.springframework.stereotype.Repository;

import jk.pp.engg.foundations.common.dao.core.AppDomainNameDescCrudDAO;
import jk.pp.ms.providers.domain.ProviderInfo;

@Repository
public interface ProviderInfoDAO extends AppDomainNameDescCrudDAO<ProviderInfo> {

}
