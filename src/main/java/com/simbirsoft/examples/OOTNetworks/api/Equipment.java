package com.simbirsoft.examples.OOTNetworks.api;

import com.simbirsoft.examples.OOTNetworks.impl.logCall;

public abstract class Equipment {
    protected Provider provider;

    private com.simbirsoft.examples.OOTNetworks.impl.logCall logCall;

    public com.simbirsoft.examples.OOTNetworks.impl.logCall call() {
        applaySetting();
        System.out.println("Провайдер: " + provider.getNameProvider() + " Совершаю вызов");
        this.logCall = new logCall();
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
