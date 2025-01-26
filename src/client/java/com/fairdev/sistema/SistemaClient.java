package com.fairdev.sistema;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.Screen;

public class SistemaClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		System.out.println("Hello from the client side!");
	}
}