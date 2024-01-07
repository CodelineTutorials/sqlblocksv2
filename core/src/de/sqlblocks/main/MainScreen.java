package de.sqlblocks.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import de.sqlblocks.ui.StaticObjects;
import de.sqlblocks.ui.UiManager;
import de.sqlblocks.ui.parts.Button;
import org.graalvm.compiler.lir.stackslotalloc.StackInterval;

public class MainScreen implements Screen {

    private OrthographicCamera camera;
    private ExtendViewport viewport;
    private Texture test = new Texture("badlogic.jpg");
    Button button;

    public MainScreen() {
        camera = new OrthographicCamera(Gdx.graphics.getWidth() / 2.0f, Gdx.graphics.getHeight() / 2.0f);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        viewport = new ExtendViewport(camera.viewportWidth, camera.viewportHeight, camera);

        button = new Button("HAllo Welt", 100, 100, 100, 100);
        button.setColor(Color.RED);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(100, 100, 100, 1);
        StaticObjects.batch.setProjectionMatrix(camera.combined);
        StaticObjects.renderer.setProjectionMatrix(camera.combined);
        UiManager.refresh(viewport);

        StaticObjects.batch.begin();
        StaticObjects.batch.draw(test, 30, 30, 50, 50);
        StaticObjects.defaultFont.draw(StaticObjects.batch, UiManager.getMousePos().toString(), 100, 100);
        StaticObjects.batch.end();


        UiManager.draw(camera.viewportWidth, camera.viewportHeight, button);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}
