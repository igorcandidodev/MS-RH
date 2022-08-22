package com.refal.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refal.hrpayroll.FeignClients.WorkerFeignClient;
import com.refal.hrpayroll.entities.Payment;
import com.refal.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, Integer days) {
		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
