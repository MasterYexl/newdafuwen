package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.model.entity.EstateManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstateManagementRepository extends JpaRepository<EstateManagement, String> {
}
