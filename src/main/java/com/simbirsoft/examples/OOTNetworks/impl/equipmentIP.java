package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.*;

public class equipmentIP extends equipment {

    private String ipAdr;

    public equipmentIP(Provider provider, String ipAdr) {
        this.provider = provider;
        this.ipAdr = ipAdr;
    }

    public void applaySetting() {
        provider.getSettingsNetwork();
    }
}