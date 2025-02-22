package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
public class PlayerPlugin implements IGamePluginService {

    private Entity player;

    public PlayerPlugin() {
    }

    @Override
    public void start(GameData gameData, World world) {

        // Add entities to the world
        player = createPlayerShip(gameData);
        world.addEntity(player);
    }

    private Entity createPlayerShip(GameData gameData) {

        Entity playerShip = new Player();
        //Original values -5,-5,10,0,-5,5
        //Change the size of the ship by changing these values
        //The numbers represents the coordinates, where dots are being drawn.
        //All the dots are connected to represent the player ship.
        //Removing values from the original coordinates result in non-rendered ship.
        //By adding values, one can redraw the ship in different context
        playerShip.setPolygonCoordinates(-5,-5,10,0,-5,5);

        playerShip.setX(gameData.getDisplayHeight()/2);
        playerShip.setY(gameData.getDisplayWidth()/2);
        playerShip.setRadius(8);
        return playerShip;
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        world.removeEntity(player);
    }

}
