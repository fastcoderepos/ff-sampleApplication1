package com.fastcode.cloudsampleapp1.domain.extended.payment;

import org.springframework.stereotype.Repository;
import com.fastcode.cloudsampleapp1.domain.core.payment.IPaymentRepository;
@Repository("paymentRepositoryExtended")
public interface IPaymentRepositoryExtended extends IPaymentRepository {

	//Add your custom code here
}

