package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.Provider;

public class providerMobile implements Provider {

    public SettingsNetwork getSettingsNetwork() {
        return settingsNetwork;
    }

    private SettingsNetwork settingsNetwork;
    private String nameProvider;
    static final String typeProvider = "Mobile type";

    public providerMobile(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public String getTypeProvider() {
        return typeProvider;
    }
}
