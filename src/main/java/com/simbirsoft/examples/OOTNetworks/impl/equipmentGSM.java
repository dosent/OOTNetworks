package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.*;

public class equipmentGSM extends equipment {

    private String inventNumber;

    public equipmentGSM(Provider provider, String inventNumber) {
        this.provider = provider;
        this.inventNumber = inventNumber;
    }

    public void applaySetting() {
        provider.getSettingsNetwork();
    }
}
