package com.fastcode.cloudsampleapp1.application.core.filmactor.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateFilmActorInput {

  	@NotNull(message = "actorId Should not be null")
  	private Integer actorId;
  	
  	@NotNull(message = "filmId Should not be null")
  	private Integer filmId;
  	
  	@NotNull(message = "lastUpdate Should not be null")
  	private LocalDateTime lastUpdate;
  	
  	private Long versiono;
  
}

