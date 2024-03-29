package net.ycrns.gg.shadowaddon.Handler;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.ycrns.gg.shadowaddon.Shadowaddon;
import net.ycrns.gg.shadowaddon.additions.armor.EnhancedShadowSteelArmor;



@Mod.EventBusSubscriber(modid = Shadowaddon.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerHandler {

    @SubscribeEvent
    public static void playerTickUpdate(LivingEquipmentChangeEvent event) {
        if (event.getEntity() instanceof Player player) {
            Abilities cap = player.getAbilities();
            if (!player.level.isClientSide) {
                if (!cap.mayfly && EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player)) {
                    cap.mayfly = true;
                    player.onUpdateAbilities();
                }

                if (!EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player) && cap.mayfly && !player.isSpectator() && !player.isCreative()) {
                    cap.mayfly = false;
                    cap.flying = false;
                    player.onUpdateAbilities();
                }
            }
        }
    }

    @SubscribeEvent
    public static void playerLogIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof Player player) {
            Abilities cap = player.getAbilities();
            if (!player.level.isClientSide) {
                if (!cap.mayfly && EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player)) {
                    cap.mayfly = true;
                    player.onUpdateAbilities();
                }

                if (!EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player) && cap.mayfly && !player.isSpectator() && !player.isCreative()) {
                    cap.mayfly = false;
                    cap.flying = false;
                    player.onUpdateAbilities();
                }
            }
        }
    }

    @SubscribeEvent
    public static void playerChangeGamemode(PlayerEvent.PlayerChangeGameModeEvent event) {
        if (event.getEntity() instanceof Player player) {
            Abilities cap = player.getAbilities();
            if (!player.level.isClientSide) {
                if (!cap.mayfly && EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player)) {
                    cap.mayfly = true;
                    player.onUpdateAbilities();
                }

                if (!EnhancedShadowSteelArmor.isArmorEquipped((ServerPlayer) player) && cap.mayfly && !player.isSpectator() && !player.isCreative()) {
                    cap.mayfly = false;
                    cap.flying = false;
                    player.onUpdateAbilities();
                }
            }
        }
    }
}
