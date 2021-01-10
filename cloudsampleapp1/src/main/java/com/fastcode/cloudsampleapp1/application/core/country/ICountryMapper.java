package com.fastcode.cloudsampleapp1.application.core.country;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.country.dto.*;
import com.fastcode.cloudsampleapp1.domain.core.country.CountryEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ICountryMapper {

   CountryEntity createCountryInputToCountryEntity(CreateCountryInput countryDto);
   
   
   CreateCountryOutput countryEntityToCreateCountryOutput(CountryEntity entity);
   
    CountryEntity updateCountryInputToCountryEntity(UpdateCountryInput countryDto);
    
   	UpdateCountryOutput countryEntityToUpdateCountryOutput(CountryEntity entity);

   	FindCountryByIdOutput countryEntityToFindCountryByIdOutput(CountryEntity entity);


}

