package com.fastcode.cloudsampleapp1.application.core.language;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.language.dto.*;
import com.fastcode.cloudsampleapp1.domain.core.language.LanguageEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ILanguageMapper {

   LanguageEntity createLanguageInputToLanguageEntity(CreateLanguageInput languageDto);
   
   
   CreateLanguageOutput languageEntityToCreateLanguageOutput(LanguageEntity entity);
   
    LanguageEntity updateLanguageInputToLanguageEntity(UpdateLanguageInput languageDto);
    
   	UpdateLanguageOutput languageEntityToUpdateLanguageOutput(LanguageEntity entity);

   	FindLanguageByIdOutput languageEntityToFindLanguageByIdOutput(LanguageEntity entity);


}

