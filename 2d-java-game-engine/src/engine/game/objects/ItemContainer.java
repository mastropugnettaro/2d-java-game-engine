/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine.game.objects;

import java.awt.*;
import engine.game.*;

/**
 *
 * @author Philipp
 */
public class ItemContainer {

    //boolean for state of container:
    boolean opened = false;
    boolean opening = false;

    int startx;
    int starty;

    //spritesheet Image for sprite creation:
    Image boxSpriteSheet = gameMain.boxSpriteSheet;

    //spritesheet
    public Sprite sprite = new Sprite(boxSpriteSheet, new Dimension(16,16));

    //Animations
    public Animation empty = new Animation(sprite, 1, 0, 0, true);
    public Animation full = new Animation(sprite, 0, 3, 80, true);

    //standard Animations (this should be copy-paste for each Object:
    public Animation none = new Animation(sprite, 0, 0, 0, true);

    public ItemContainer(Point position){
        startx = sprite.posx = position.x;
        starty = sprite.posy = position.y;
        gameMain.numberOfBoxes++;

        //set the sprite up for drawing:
        gameMain.sprite[gameMain.numberOfSprites] = sprite;
        gameMain.numberOfSprites++;

        //set the animation and play it;
        sprite.animation = full;
        sprite.animation.play();
    }

    public void open(){
        //no need to check for Mario Collision:
        opening();
        if(sprite.bottomCollision(gameMain.sprite[Mario.mariosprite])){
            opening = true;
            if (opened == false){
                gameMain.pCoin.set(sprite.posx, sprite.posy-16);
                sprite.animation = empty;
                opened = true;
            }
        }
    }

    // opening "animation"
    public void opening(){
        if ((opening == false)&&(starty>sprite.posy)){
            sprite.posy ++;
        }
        else{
            if (opening == true){
                sprite.posy --;
                if ((starty-sprite.posy)==8){
                    opening = false;
                }
            }
        }
    }

}
