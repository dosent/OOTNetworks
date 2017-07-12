package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.Provider;

public class ProviderIP implements Provider {

    private SettingsNetwork settingsNetwork;
    private String nameProvider;

    static final String typeProvider = "IP type";

    public ProviderIP(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public String getTypeProvider() {
        return typeProvider;
    }

    public SettingsNetwork getSettingsNetwork() {
        return null;
    }
}
