package com.zee.zee5app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.repository.SubscriptionRepository;
import com.zee.zee5app.service.SubscriptionService2;

public class SubscriptionServiceImpl implements SubscriptionService2 {

	@Autowired
	private SubscriptionRepository subscriptionRepo;
	
	@Override
	public String addSubscribtion(Subscription subscription) {
		// TODO Auto-generated method stub
		return this.subscriptionRepo.addSubscribtion(subscription);
	}

	@Override
	public List<Subscription> getAllSubscribtion() {
		// TODO Auto-generated method stub
		return subscriptionRepo.getAllSubscribtion();
	}

	@Override
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return subscriptionRepo.getSubscriptionById(id);
	}

	@Override
	public String deleteSubscription(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return subscriptionRepo.deleteSubscription(id);
	}

	@Override
	public String modifySubscription(String id, Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}

}
