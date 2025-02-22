package dk.sdu.mmmi.cbse.common.data;

public class GameData {

    // Changes the window-size
    // Changing the size impacts the player to freeze
    // Find solution later
    private int displayWidth  = 800 ;
    private int displayHeight = 800;
    private final GameKeys keys = new GameKeys();


    public GameKeys getKeys() {
        return keys;
    }

    public void setDisplayWidth(int width) {
        this.displayWidth = width;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayHeight(int height) {
        this.displayHeight = height;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }


}
