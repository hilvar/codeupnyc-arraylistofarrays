package arrayofblocks;

import net.canarymod.api.world.blocks.BlockType;

import java.util.ArrayList;

/**
 * Created by andyroo on 4/29/17.
 */
public class Wall {

    private ArrayList<BlockType[]> materials = new ArrayList<BlockType[]>();

    public Wall() {
        this.makeWall();
    }

    public ArrayList<BlockType[]> getWallData() {
        return materials;
    }

    private void makeWall() {
        BlockType[] rowOne = { BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock };
        BlockType[] rowTwo = { BlockType.BrickBlock, BlockType.Air, BlockType.Air, BlockType.Air, BlockType.BrickBlock };
        BlockType[] rowThree = { BlockType.BrickBlock, BlockType.Air, BlockType.Air, BlockType.Air, BlockType.BrickBlock };
        BlockType[] rowFour = { BlockType.BrickBlock, BlockType.Air, BlockType.Air, BlockType.Air, BlockType.BrickBlock };
        BlockType[] rowFive = { BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock, BlockType.BrickBlock };
        materials.add(rowOne);
        materials.add(rowTwo);
        materials.add(rowThree);
        materials.add(rowFour);
        materials.add(rowFive);
    }
}
