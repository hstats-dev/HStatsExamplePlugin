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
        new HStats("c16419ab-f954-4961-b679-63fceceb11e8", "1.0.0");
    }

    @Override
    protected void shutdown() {
        super.shutdown();
    }
}
