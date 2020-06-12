package report.main.Trash;

import org.bukkit.Chunk;
import org.bukkit.Material;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class ChunkFinder {
    public static int[] getMaterialAmount(final Chunk chunk) {
        final int[] amount = new int[Material.values().length];
        final int minX = chunk.getX() << 4;
        final int minZ = chunk.getZ() << 4;
        final int maxX = minX | 15;
        final int maxY = chunk.getWorld().getMaxHeight();
        final int maxZ = minZ | 15;

        for (int x = minX; x <= maxX; ++x) {
            for (int y = 0; y <= maxY; ++y) {
                for (int z = minZ; z <= maxZ; ++z) {
                    ++amount[chunk.getBlock(x, y, z).getType().ordinal()];
                }
            }
        }
        return amount;
    }
    //lol

}
