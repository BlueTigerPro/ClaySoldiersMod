/* ******************************************************************************************************************
   * Authors:   SanAndreasP
   * Copyright: SanAndreasP
   * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
   *                http://creativecommons.org/licenses/by-nc-sa/4.0/
   *******************************************************************************************************************/
package de.sanandrew.mods.claysoldiers.api.client;

import de.sanandrew.mods.claysoldiers.api.client.soldier.ISoldierRender;
import de.sanandrew.mods.claysoldiers.api.soldier.ISoldier;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public interface ISoldierRenderHook
{
    int getPriority();

    default boolean doHandRendererSetup(ISoldier<?> soldier, EnumHandSide handSide) { return false; };

    //
    default boolean onHandRender(ISoldier<?> soldier, ISoldierRender<?, ?> renderer, EnumHandSide handSide) { return false; }

    default void renderModelPre(ISoldier<?> soldier, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) { }

    default void renderModelPost(ISoldier<?> soldier, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) { }
}
