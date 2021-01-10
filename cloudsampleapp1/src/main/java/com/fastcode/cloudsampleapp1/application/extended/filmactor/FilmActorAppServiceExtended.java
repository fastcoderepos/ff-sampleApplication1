package com.fastcode.cloudsampleapp1.application.extended.filmactor;

import org.springframework.stereotype.Service;
import com.fastcode.cloudsampleapp1.application.core.filmactor.FilmActorAppService;

import com.fastcode.cloudsampleapp1.domain.extended.filmactor.IFilmActorRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.cloudsampleapp1.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.cloudsampleapp1.commons.logging.LoggingHelper;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

	public FilmActorAppServiceExtended(IFilmActorRepositoryExtended filmActorRepositoryExtended,
				IActorRepositoryExtended actorRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmActorMapperExtended mapper,LoggingHelper logHelper) {

		super(filmActorRepositoryExtended,
		actorRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

