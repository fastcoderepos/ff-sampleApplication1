package com.fastcode.cloudsampleapp1.application.extended.country;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.country.ICountryMapper;

@Mapper(componentModel = "spring")
public interface ICountryMapperExtended extends ICountryMapper {

}

