package com.simbirsoft.examples.OOTNetworks.api;

import com.simbirsoft.examples.OOTNetworks.impl.settingsNetwork;

/**
 * Created by neshi on 11.07.2017.
 */
public interface Provider {

    String getNameProvider();
    String getTypeProvider();
    settingsNetwork getSettingsNetwork();
}
