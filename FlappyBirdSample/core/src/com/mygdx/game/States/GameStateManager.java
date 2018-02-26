package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Basit on 2/26/2018.
 * renders and update states using stack data structure
 */

public class GameStateManager {
    private Stack<State> states;// a stack of all the states


    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    public void set(State state){
        states.pop();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);

    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}


