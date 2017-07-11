package com.simbirsoft.examples.OOTNetworks;

import com.simbirsoft.examples.OOTNetworks.api.Equipment;
import com.simbirsoft.examples.OOTNetworks.api.Provider;
import com.simbirsoft.examples.OOTNetworks.impl.equipmentGSM;
import com.simbirsoft.examples.OOTNetworks.impl.equipmentIP;
import com.simbirsoft.examples.OOTNetworks.impl.providerIP;
import com.simbirsoft.examples.OOTNetworks.impl.providerMobile;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Equipment> listEquipment = new ArrayList<Equipment>();
        Provider Beeline = new providerMobile("Билайн");
        Provider Megafon = new providerMobile("Мегафон");
        Provider Rostelecom = new providerIP("Ростелеком");
        Provider Mtt = new providerIP("МТТ");

        for (int i=0; i <= 20; i++) {
            Equipment item;
            if (i%2==0) item = new equipmentGSM(Beeline,String.valueOf(i));
                else item = new equipmentIP(Rostelecom, "192.168.0."+String.valueOf(i));
            if (i%4==0) item = new equipmentGSM(Megafon,String.valueOf(i));
            if (i%6==0) item = new equipmentIP(Mtt, "192.168.24."+String.valueOf(i));
            listEquipment.add(item);
        }
        for (Equipment item: listEquipment){
            item.call();
        }
    }
}
