package com.fastcode.cloudsampleapp1.application.extended.inventory;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.inventory.InventoryAppService;

import com.fastcode.cloudsampleapp1.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("inventoryAppServiceExtended")
public class InventoryAppServiceExtended extends InventoryAppService implements IInventoryAppServiceExtended {

	public InventoryAppServiceExtended(IInventoryRepositoryExtended inventoryRepositoryExtended,
				IFilmRepositoryExtended filmRepositoryExtended,IInventoryMapperExtended mapper,LoggingHelper logHelper) {

		super(inventoryRepositoryExtended,
		filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

