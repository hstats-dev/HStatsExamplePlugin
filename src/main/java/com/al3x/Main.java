package com.al3x;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class Main extends JavaPlugin {

    public Main(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        new HStats("c34a2b1a-afe8-4d4c-8e1e-7a62e82e5cb6", "1.0.0");
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }
}
