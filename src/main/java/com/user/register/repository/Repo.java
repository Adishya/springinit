package com.user.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.register.entity.RegisterEntity;

public interface Repo extends JpaRepository<RegisterEntity, Integer> {

}
