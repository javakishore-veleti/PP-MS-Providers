package jk.pp.ms.providers.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderInfo;
import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "ProviderInfo")
@Table(name = "provider_info")
public class ProviderInfo extends BaseDomainUniqueNameDesc implements IProviderInfo {

	private static final long serialVersionUID = 1L;

}
