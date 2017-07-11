package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.Provider;

public class providerMobile implements Provider {


    public com.simbirsoft.examples.OOTNetworks.impl.settingsNetwork getSettingsNetwork() {
        return settingsNetwork;
    }

    private com.simbirsoft.examples.OOTNetworks.impl.settingsNetwork settingsNetwork;
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
