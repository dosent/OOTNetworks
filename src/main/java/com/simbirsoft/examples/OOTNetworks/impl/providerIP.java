package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.Provider;

public class providerIP implements Provider {

    private SettingsNetwork settingsNetwork;
    private String nameProvider;

    static final String typeProvider = "IP type";

    public providerIP(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public String getTypeProvider() {
        return typeProvider;
    }
}
