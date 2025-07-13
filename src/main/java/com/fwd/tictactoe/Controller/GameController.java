package com.fwd.tictactoe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.fwd.tictactoe.Model.Board;
import com.fwd.tictactoe.Service.GameService;

@Controller
public class GameController {

    private GameService gameService = new GameService(); // ideally pakai @Service + @Autowired

    @GetMapping("/")
    public String showHome(@RequestParam(defaultValue = "3") int size, Model model) {
        gameService.initGame(size);
        model.addAttribute("board", gameService.getBoard());
        model.addAttribute("player", gameService.getCurrentPlayer());
        model.addAttribute("gameOver", false);
        return "index";
    }

    @PostMapping("/move")
    public String makeMove(@RequestParam int row,
                           @RequestParam int col,
                           Model model) {

        gameService.makeMove(row, col);

        Board board = gameService.getBoard();
        model.addAttribute("board", board);
        model.addAttribute("player", gameService.getCurrentPlayer());
        model.addAttribute("gameOver", gameService.isGameOver());
        model.addAttribute("message", gameService.getResultMessage());

        return "index";
    }
}