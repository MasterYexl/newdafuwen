package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.model.entity.Dice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRepository extends JpaRepository<Dice, String> {
}
