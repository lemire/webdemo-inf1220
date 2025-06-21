package app;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;
import io.javalin.http.Context;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class GuessNumberApp {
    public static void main(String[] args) {
        int port = 7070;
        Javalin app = Javalin.create(config -> {
            config.fileRenderer(new JavalinThymeleaf());
        }).start(port);

        app.get("/", GuessNumberApp::showGame);
        app.post("/guess", GuessNumberApp::handleGuess);
    }

    private static void showGame(Context ctx) {
        if (ctx.sessionAttribute("number") == null) {
            ctx.sessionAttribute("number", new Random().nextInt(100) + 1);
        }
        Map<String, Object> model = new HashMap<>();
        model.put("message", "");
        ctx.render("templates/game.html", model);
    }

    private static void handleGuess(Context ctx) {
        int number = ctx.sessionAttribute("number");
        int guess = Integer.parseInt(ctx.formParam("guess"));
        Map<String, Object> model = new HashMap<>();
        if (guess < number) {
            model.put("message", "Trop petit ! Essayez encore.");
        } else if (guess > number) {
            model.put("message", "Trop grand ! Essayez encore.");
        } else {
            model.put("message", "Bravo ! Vous avez trouvé le nombre. Un nouveau nombre a été choisi.");
            ctx.sessionAttribute("number", new Random().nextInt(100) + 1);
        }
        ctx.render("templates/game.html", model);
    }
}