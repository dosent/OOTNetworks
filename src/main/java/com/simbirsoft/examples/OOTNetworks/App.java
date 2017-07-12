package com.simbirsoft.examples.OOTNetworks;

import com.simbirsoft.examples.OOTNetworks.api.*;
import com.simbirsoft.examples.OOTNetworks.impl.*;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Equipment> listEquipment = new ArrayList<Equipment>();
        Provider Beeline = new ProviderMobile("Билайн");
        Provider Megafon = new ProviderMobile("Мегафон");
        Provider Rostelecom = new ProviderIP("Ростелеком");
        Provider Mtt = new ProviderIP("МТТ");

        for (int i=0; i <= 20; i++) {
            Equipment item;
            if (i%2==0) item = new EquipmentGSM(Beeline,String.valueOf(i));
                else item = new EquipmentIP(Rostelecom, "192.168.0."+String.valueOf(i));
            if (i%4==0) item = new EquipmentGSM(Megafon,String.valueOf(i));
            if (i%6==0) item = new EquipmentIP(Mtt, "192.168.24."+String.valueOf(i));
            listEquipment.add(item);
        }
        for (Equipment item: listEquipment){
            item.call();
        }
    }
}
