package com.fastcode.cloudsampleapp1.application.extended.category;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.category.CategoryAppService;

import com.fastcode.cloudsampleapp1.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("categoryAppServiceExtended")
public class CategoryAppServiceExtended extends CategoryAppService implements ICategoryAppServiceExtended {

	public CategoryAppServiceExtended(ICategoryRepositoryExtended categoryRepositoryExtended,
				ICategoryMapperExtended mapper,LoggingHelper logHelper) {

		super(categoryRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

