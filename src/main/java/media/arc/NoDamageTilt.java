package media.arc;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoDamageTilt implements ModInitializer {
	public static final String MOD_ID = "nodamagetilt";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Removing Damage Tilt");
	}
}