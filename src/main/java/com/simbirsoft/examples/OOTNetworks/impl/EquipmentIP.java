package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquipmentIP extends Equipment {

    private String ipAdr;

    public EquipmentIP(Provider provider, String ipAdr) {
        this.provider = provider;
        this.ipAdr = ipAdr;
    }

    public void applaySetting() {
        Logger logger = LoggerFactory.getLogger(EquipmentIP.class);
        logger.info("Run method applaySetting() {}");
        provider.getSettingsNetwork();
    }
}