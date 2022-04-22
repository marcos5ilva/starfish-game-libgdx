package com.starfishcollector.game;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class WhirlPool extends BaseActor {

    public WhirlPool(float x, float y, Stage stage) {
        super(x, y, stage);
        String filename = "assets/whirlpool.png";
        loadAnimationFromSheet(filename, 2, 5, 0.1f, false);
    }

    public void act(float dt) {
        super.act(dt);
        if (isAnimationFinished())
            remove();
    }
}
