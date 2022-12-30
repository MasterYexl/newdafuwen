package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.model.entity.Estate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateRepository extends JpaRepository<Estate, String> {
}
