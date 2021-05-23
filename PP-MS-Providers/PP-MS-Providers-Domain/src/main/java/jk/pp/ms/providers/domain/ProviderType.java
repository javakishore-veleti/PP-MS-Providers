package jk.pp.ms.providers.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import jk.pp.engg.foundations.common.core.domain.provider.IProviderType;
import jk.pp.engg.foundations.common.domain.core.BaseDomainUniqueNameDesc;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity(name = "ProviderType")
@Table(name = "provider_type")
public class ProviderType extends BaseDomainUniqueNameDesc implements IProviderType {

	private static final long serialVersionUID = 1L;
}
