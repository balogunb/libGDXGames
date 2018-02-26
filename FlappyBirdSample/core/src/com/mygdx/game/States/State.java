package com.mygdx.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Basit on 2/26/2018.
 */

public abstract class State {
    protected OrthographicCamera cam;// locates a position in the game world
    protected Vector3 mouse; // pointer with an xyz coordinate system
    protected GameStateManager gsm;// manages the state to put states on top of state eg pause


    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstract void handleInput(); // deals with user input
    public abstract void update(float dt); // takes in delta time - difference between on frame rendered and the next frame rendered
    public abstract void render(SpriteBatch sb); //sprite batch is a container for everything we need to render

}
