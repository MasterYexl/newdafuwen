package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.model.entity.GameMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameMapRepository extends JpaRepository<GameMap, String> {
}
