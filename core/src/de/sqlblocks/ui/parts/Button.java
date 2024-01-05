package de.sqlblocks.ui.parts;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import de.sqlblocks.ui.StaticObjects;

public class Button extends ButtonBase {

    private String text;
    private Color color = Color.WHITE;
    private Color hoverColor = Color.GRAY;
    private Color clickedColor = Color.DARK_GRAY;
    private Color borderColor = Color.BLACK;
    private Color textColor = Color.BLACK;
    private boolean isBorderEnabled = false;
    private boolean isTransparent = false;

    public Button(String text, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.text = text;
    }

    @Override
    public void draw() {
        if(!isTransparent) {
            StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Filled);
            if(isClicked()) StaticObjects.renderer.setColor(clickedColor);
            else if(isHovered()) StaticObjects.renderer.setColor(hoverColor);
            else StaticObjects.renderer.setColor(color);
            StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
            StaticObjects.renderer.end();
        }
        if(isBorderEnabled) {
            StaticObjects.renderer.begin(ShapeRenderer.ShapeType.Line);
            StaticObjects.renderer.setColor(borderColor);
            StaticObjects.renderer.rect(getX(), getY(), getWidth(), getHeight());
            StaticObjects.renderer.end();
        }
        StaticObjects.batch.begin();
        StaticObjects.defaultFont.setColor(textColor);
        StaticObjects.defaultFont.draw(StaticObjects.batch, text, getX(), getY() + getHeight() / 2.0f, getWidth(), 1, true);
        StaticObjects.batch.end();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setHoverColor(Color color) {
        this.hoverColor = color;
    }

    public Color getHoverColor() {
        return this.hoverColor;
    }

    public void setClickedColor(Color color) {
        this.clickedColor = color;
    }

    public Color getClickedColor() {
        return this.clickedColor;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public void setTextColor(Color color) {
        this.textColor = color;
    }

    public Color getTextColor() {
        return this.textColor;
    }

    public void setBorderEnabled(boolean value) {
        this.isBorderEnabled = value;
    }

    public boolean isBorderEnabled() {
        return this.isBorderEnabled;
    }

    public void setTransparent(boolean value) {
        this.isTransparent = value;
    }

    public boolean isTransparent() {
        return this.isTransparent;
    }

}





