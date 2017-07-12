package com.simbirsoft.examples.OOTNetworks.impl;

import com.simbirsoft.examples.OOTNetworks.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquipmentGSM extends Equipment {

    private String inventNumber;

    public EquipmentGSM(Provider provider, String inventNumber) {
        this.provider = provider;
        this.inventNumber = inventNumber;
    }

    public void applaySetting() {
        Logger logger = LoggerFactory.getLogger(EquipmentGSM.class);
        logger.info("Run method applaySetting() {}");
        provider.getSettingsNetwork();
    }
}
