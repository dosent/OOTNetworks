package com.simbirsoft.examples.OOTNetworks.api;

import com.simbirsoft.examples.OOTNetworks.impl.LogCall;

public abstract class Equipment {
    protected Provider provider;

    private LogCall logCall;

    public LogCall call() {
        applaySetting();
        System.out.println("Провайдер: " + provider.getNameProvider() + " Совершаю вызов");
        this.logCall = new LogCall();
        return logCall;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public abstract void applaySetting();
}
