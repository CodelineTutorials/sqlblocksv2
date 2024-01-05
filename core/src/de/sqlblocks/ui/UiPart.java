package de.sqlblocks.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import de.sqlblocks.ui.listener.OnClickListener;
import de.sqlblocks.ui.listener.OnHoverListener;

public abstract class UiPart {

    private int x;
    private int y;
    private int width;
    private int height;

    private OnHoverListener onHoverListener = new OnHoverListener() {
        @Override
        public void onHover() {

        }
    };
    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick() {

        }
    };

    public UiPart(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setOnHoverListener(OnHoverListener listener) {
        this.onHoverListener = listener;
    }

    public OnHoverListener getOnHoverListener() {
        return this.onHoverListener;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.onClickListener = listener;
    }

    public OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public abstract void draw();

    public boolean isHovered() {
        if(UiManager.getMousePos().x > x && UiManager.getMousePos().x < x + width) {
            return UiManager.getMousePos().y > y && UiManager.getMousePos().y < y + height;
        }
        return false;
    }

    public boolean isClicked() {
        return Gdx.input.isButtonJustPressed(Input.Buttons.LEFT) && isHovered();
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }


}
