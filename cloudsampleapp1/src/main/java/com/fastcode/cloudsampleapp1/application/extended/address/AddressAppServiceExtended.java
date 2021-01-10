package com.fastcode.cloudsampleapp1.application.extended.address;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.address.AddressAppService;

import com.fastcode.cloudsampleapp1.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.city.ICityRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("addressAppServiceExtended")
public class AddressAppServiceExtended extends AddressAppService implements IAddressAppServiceExtended {

	public AddressAppServiceExtended(IAddressRepositoryExtended addressRepositoryExtended,
				ICityRepositoryExtended cityRepositoryExtended,IAddressMapperExtended mapper,LoggingHelper logHelper) {

		super(addressRepositoryExtended,
		cityRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

