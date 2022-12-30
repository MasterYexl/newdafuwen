package com.yxl.newdafuwen.service;

import com.yxl.newdafuwen.constant.PlayerTypeEnum;
import com.yxl.newdafuwen.model.entity.Game;
import com.yxl.newdafuwen.model.entity.Player;
import com.yxl.newdafuwen.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerService {
    private PlayerRepository playerRepository;

    public Player addUser(Player player, Game game) {
        return addUser(player, game, PlayerTypeEnum.PLAYER);
    }

    public Player addUser(Player player, Game game, PlayerTypeEnum playerTypeEnum) {
        player.setId(UUID.randomUUID().toString());
        player.setCreateDate(Instant.now());
        player.setGame(game);
        player.setSeqNumber(playerRepository.findAllByGame(game).size());
        return playerRepository.saveAndFlush(player);
    }

    public Player get(UUID playerId) {
        Optional<Player> playerOptional = playerRepository.findById(playerId.toString());
        return playerOptional.orElse(null);
    }

    public Player createBankUser(Game game) {
        List<Player> bankPlayerList = playerRepository.findAllByTypeAndGame(PlayerTypeEnum.BANK, game);
        if (!bankPlayerList.isEmpty()) {
            log.warn("已经存在一个银行用户");
            return bankPlayerList.get(0);
        }
        Player player = new Player();
        player.setType(PlayerTypeEnum.BANK);
        return player;
    }
}
