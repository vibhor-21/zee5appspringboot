package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.IdNotFoundException;
@Service
public interface SubscriptionService2 {

	public String addSubscribtion(Subscription subscription);
	
	public List<Subscription> getAllSubscribtion();
	
	public Optional<Subscription> getSubscriptionById(String id) throws IdNotFoundException;
	
	public String deleteSubscription(String id) throws IdNotFoundException;
	
	public String modifySubscription(String id, Subscription subscription);
}
