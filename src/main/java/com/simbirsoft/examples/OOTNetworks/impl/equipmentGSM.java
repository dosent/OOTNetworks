package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.*;

public class equipmentGSM extends Equipment {

    private String inventNumber;

    public equipmentGSM(Provider provider, String inventNumber) {
        this.provider = provider;
        this.inventNumber = inventNumber;
    }

    public void applaySetting() {
        provider.getSettingsNetwork();
    }
}
