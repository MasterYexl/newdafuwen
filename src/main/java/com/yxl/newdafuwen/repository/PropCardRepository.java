package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.model.entity.PropCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropCardRepository extends JpaRepository<PropCard, String> {
}
