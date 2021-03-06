package net.mcreator.yourmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.yourmod.YourmodModElements;

@YourmodModElements.ModElement.Tag
public class JetpackItemInHandTickProcedure extends YourmodModElements.ModElement {
	public JetpackItemInHandTickProcedure(YourmodModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JetpackItemInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 2, (int) 5, (false), (false)));
	}
}
