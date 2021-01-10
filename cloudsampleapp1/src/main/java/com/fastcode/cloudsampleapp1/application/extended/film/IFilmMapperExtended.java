package com.fastcode.cloudsampleapp1.application.extended.film;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.film.IFilmMapper;

@Mapper(componentModel = "spring")
public interface IFilmMapperExtended extends IFilmMapper {

}

