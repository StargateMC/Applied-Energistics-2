/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 AlgorithmX2
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package appeng.api.implementations.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import appeng.api.implementations.TransitionResult;
import appeng.api.util.WorldCoord;

/**
 * Implemented on a {@link Item}
 */
public interface ISpatialStorageCell {

    /**
     * @param is spatial storage cell
     *
     * @return true if this item is a spatial storage cell
     */
    boolean isSpatialStorage(ItemStack is);

    /**
     * @param is spatial storage cell
     *
     * @return the maximum size of the spatial storage cell along any given axis
     */
    int getMaxStoredDim(ItemStack is);

    /**
     * get the currently stored Dimension id.
     *
     * @param is spatial storage cell
     *
     * @return dimension id or -1
     */
    DimensionType getStoredDimension(ItemStack is);

    /**
     * Perform a spatial swap with the contents of the cell, and the world.
     *
     * @param is       spatial storage cell
     * @param w        world of spatial
     * @param min      min coord
     * @param max      max coord
     * @param playerId owner of current grid or -1
     *
     * @return result of transition
     */
    TransitionResult doSpatialTransition(ItemStack is, World w, WorldCoord min, WorldCoord max, int playerId);
}