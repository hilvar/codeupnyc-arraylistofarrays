/***
 * Excerpted from "Learn to Program with Minecraft Plugins, CanaryMod Edition",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine2 for more book information.
***/
package arrayofblocks;

import net.canarymod.commandsys.*;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.blocks.BlockType;
import com.pragprog.ahmine.ez.EZPlugin;

public class ArrayOfBlocks extends EZPlugin {

  public void buildTower(Player me) {
    Location loc = me.getLocation();
    loc.setX(loc.getX() + 3); // Not right on top of player
    
    Wall wall = new Wall();
    
    for (BlockType[] tower : wall.getWallData()) {
      for (BlockType block : tower) {
        setBlockAt(loc, block);
        loc.setX(loc.getX() + 1); // go up one each time
      }
      loc.setX(loc.getX() - tower.length);
      loc.setZ(loc.getZ() + 1);
    }    
  }
  
  @Command(aliases = { "arrayofblocks" },
            description = "Create an array of blocks",
            permissions = { "" },
            toolTip = "/arrayofblocks")
  public void arrayofblocksCommand(MessageReceiver caller, String[] args) {
    if (caller instanceof Player) { 
      Player me = (Player)caller;
      me.chat(me.getCardinalDirection().name());
      buildTower(me);
    }
  }
}
