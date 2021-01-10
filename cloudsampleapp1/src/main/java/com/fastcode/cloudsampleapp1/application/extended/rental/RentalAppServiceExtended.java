package com.fastcode.cloudsampleapp1.application.extended.rental;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.rental.RentalAppService;

import com.fastcode.cloudsampleapp1.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("rentalAppServiceExtended")
public class RentalAppServiceExtended extends RentalAppService implements IRentalAppServiceExtended {

	public RentalAppServiceExtended(IRentalRepositoryExtended rentalRepositoryExtended,
				ICustomerRepositoryExtended customerRepositoryExtended,IInventoryRepositoryExtended inventoryRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IRentalMapperExtended mapper,LoggingHelper logHelper) {

		super(rentalRepositoryExtended,
		customerRepositoryExtended,inventoryRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

