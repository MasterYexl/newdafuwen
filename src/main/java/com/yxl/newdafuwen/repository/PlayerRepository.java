package com.yxl.newdafuwen.repository;

import com.yxl.newdafuwen.constant.PlayerTypeEnum;
import com.yxl.newdafuwen.model.entity.Game;
import com.yxl.newdafuwen.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    List<Player> findAllByTypeAndGame(PlayerTypeEnum type, Game game);
    List<Player> findAllByGame(Game game);
}
