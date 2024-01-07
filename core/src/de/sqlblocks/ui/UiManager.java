package de.sqlblocks.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class UiManager {

    private static Vector2 mousePos = new Vector2(0, 0);
    private static Texture backgroundTexture = null;

    public static void refresh(ExtendViewport viewport) {
        mousePos = viewport.unproject(new Vector2(Gdx.input.getX(), Gdx.input.getY()));
    }

    public static void draw(float viewpointWidth, float viewpointHeight, UiPart... parts) {

        if(backgroundTexture != null) {
            StaticObjects.batch.begin();
            StaticObjects.batch.draw(backgroundTexture, 0, 0, viewpointWidth, viewpointHeight);
            StaticObjects.batch.end();
        }

        for(UiPart part: parts) {
            if(part.isClicked()) part.getOnClickListener().onClick();
            else if(part.isHovered()) part.getOnHoverListener().onHover();
            part.draw();
        }

    }

    public static Vector2 getMousePos() {
        return mousePos;
    }

    public static void setBackground(Texture texture) {
        backgroundTexture = texture;
    }

    public static Texture getBackground() {
        return backgroundTexture;
    }

}
