package com.fastcode.cloudsampleapp1.application.extended.inventory;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.inventory.IInventoryMapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {

}

