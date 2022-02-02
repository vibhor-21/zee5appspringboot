package com.zee.zee5app.repository;

import org.springframework.stereotype.Repository;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.ROLE;


@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

}