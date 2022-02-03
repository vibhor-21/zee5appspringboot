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
		return null;
	}

	@Override
	public List<Subscription> getAllSubscribtion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSubscription(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modifySubscription(String id, Subscription subscription) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
