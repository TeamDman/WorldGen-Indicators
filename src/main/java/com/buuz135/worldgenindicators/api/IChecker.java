/*
 * This file is part of Worldgen Indicators.
 *
 * Copyright 2018, Buuz135
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.buuz135.worldgenindicators.api;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.block.IBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.Random;

@ZenRegister
public interface IChecker {

    double getWorkingChance();

    boolean isValid(World world, BlockPos pos);

    boolean isPlacementValid(World world, BlockPos pos);

    @ZenMethod
    IChecker addValid(IBlock valid);

    @ZenMethod
    IChecker addIndicator(IIndicator indicator);

    @ZenMethod
    IChecker addWhitelistEntry(IBlock block);

    @ZenMethod
    IChecker addBlacklistEntry(IBlock block);

    IIndicator getRandomIndicator(Random random);

}
