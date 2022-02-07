package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.SubscriptionRepository;
import com.zee.zee5app.service.SubscriptionService2;
@Service
public class SubscriptionServiceImpl implements SubscriptionService2 {

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@Override
	public String addSubscribtion(Subscription subscription) {
		// TODO Auto-generated method stub
		Subscription subscription2 = subscriptionRepository.save(subscription);
		if(subscription2!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public Optional<List<Subscription>> getAllSubscribtion() {
		// TODO Auto-generated method stub
		return Optional.ofNullable(subscriptionRepository.findAll());
	}

	@Override
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return subscriptionRepository.findById(id);
	}

	@Override
	public String deleteSubscription(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Optional<Subscription> optional = this.getSubscriptionById(id);
		if(optional.isEmpty()) {
			return "record not found";
		}
		else
			return "success";
	}

	@Override
	public String modifySubscription(String id, Subscription subscription) {
		// TODO Auto-generated method stub
		if(this.subscriptionRepository.existsById(id)==false)
			return "fail";
		return (this.subscriptionRepository.save(subscription)!=null)?"success":"fail";
	}
	
	

}
