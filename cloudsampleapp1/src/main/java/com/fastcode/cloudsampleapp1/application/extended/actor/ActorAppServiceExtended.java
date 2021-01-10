package com.fastcode.cloudsampleapp1.application.extended.actor;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.actor.ActorAppService;

import com.fastcode.cloudsampleapp1.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("actorAppServiceExtended")
public class ActorAppServiceExtended extends ActorAppService implements IActorAppServiceExtended {

	public ActorAppServiceExtended(IActorRepositoryExtended actorRepositoryExtended,
				IActorMapperExtended mapper,LoggingHelper logHelper) {

		super(actorRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

