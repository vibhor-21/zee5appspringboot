package com.zee.zee5app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.zee5app.dto.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

}
