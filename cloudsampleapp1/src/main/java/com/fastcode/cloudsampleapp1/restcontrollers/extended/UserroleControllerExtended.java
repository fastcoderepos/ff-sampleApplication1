package com.fastcode.cloudsampleapp1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.cloudsampleapp1.restcontrollers.core.UserroleController;
import com.fastcode.cloudsampleapp1.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import com.fastcode.cloudsampleapp1.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.cloudsampleapp1.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.cloudsampleapp1.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userrole/extended")
public class UserroleControllerExtended extends UserroleController {

		public UserroleControllerExtended(IUserroleAppServiceExtended userroleAppServiceExtended, IRoleAppServiceExtended roleAppServiceExtended, IUserAppServiceExtended userAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userroleAppServiceExtended,
    	roleAppServiceExtended,
    	userAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

