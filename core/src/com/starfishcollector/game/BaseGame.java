package com.starfishcollector.game;

import com.badlogic.gdx.Game;

public abstract class BaseGame extends Game {

    private static BaseGame game;

    public BaseGame(){
        game = this;
    }

    public static void setActiveScreen(BaseScreen screen){
        game.setScreen(screen);
    }
}
