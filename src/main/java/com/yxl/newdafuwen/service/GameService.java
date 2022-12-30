package com.yxl.newdafuwen.service;

import com.yxl.newdafuwen.constant.GameStatusEnum;
import com.yxl.newdafuwen.constant.PlayerTypeEnum;
import com.yxl.newdafuwen.model.entity.Game;
import com.yxl.newdafuwen.model.entity.GameMap;
import com.yxl.newdafuwen.model.entity.Player;
import com.yxl.newdafuwen.repository.GameMapRepository;
import com.yxl.newdafuwen.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;
    private final GameMapRepository gameMapRepository;
    private final PlayerService playerService;

    public Game createGame(Game game) {
        game.setId(UUID.randomUUID().toString());
        game.setCreateTime(Instant.now());
        game.setStsCd(GameStatusEnum.START);
        Game newGame = gameRepository.saveAndFlush(game);
        Player bankUser = playerService.createBankUser(newGame);
        playerService.addUser(bankUser, newGame, PlayerTypeEnum.BANK);
        return newGame;
    }

    public Game setWinner(UUID gameId, UUID winnerId) {
        Optional<Game> gameOptional = gameRepository.findById(gameId.toString());
        if (!gameOptional.isPresent())
            return null;
        Game game = gameOptional.get();
        Player playerOptional = playerService.get(winnerId);
        game.setWinner(playerOptional);
        return gameRepository.saveAndFlush(game);
    }

    public GameMap createGameMap(GameMap gameMap) {
        gameMap.setId(UUID.randomUUID().toString());
        return gameMapRepository.saveAndFlush(gameMap);
    }

}
