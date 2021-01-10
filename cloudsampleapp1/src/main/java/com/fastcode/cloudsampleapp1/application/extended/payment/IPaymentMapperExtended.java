package com.fastcode.cloudsampleapp1.application.extended.payment;

import org.mapstruct.Mapper;
import com.fastcode.cloudsampleapp1.application.core.payment.IPaymentMapper;

@Mapper(componentModel = "spring")
public interface IPaymentMapperExtended extends IPaymentMapper {

}

