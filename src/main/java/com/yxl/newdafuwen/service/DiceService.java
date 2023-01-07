package com.yxl.newdafuwen.service;

import com.yxl.newdafuwen.model.entity.Dice;
import com.yxl.newdafuwen.model.entity.Game;
import com.yxl.newdafuwen.model.entity.Player;
import com.yxl.newdafuwen.repository.DiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class DiceService {
    private final DiceRepository diceRepository;
    private final PlayerService playerService;

    public Dice saveDice(Dice dice) {
        dice.setId(UUID.randomUUID().toString());
        dice.setCreateDate(Instant.now());
        return diceRepository.saveAndFlush(dice);
    }

    public Dice rollDice(UUID playerId) {
        Dice dice = new Dice();
        Player player = playerService.get(playerId);
        if (player == null) {
            log.warn("PLayer not found");
            return dice;
        }
        dice.setPlayer(player);
        Game game = player.getGame();
        if (!Objects.equals(player.getGameOrder(), game.getCurrentOrder())) {
            return dice;
        }
        dice.setDiceNumber(randomNumber());
        dice.setLocation(player.getLocation()+dice.getDiceNumber());
        return saveDice(dice);
    }

    private int randomNumber() {
        return 0;
    }


}
