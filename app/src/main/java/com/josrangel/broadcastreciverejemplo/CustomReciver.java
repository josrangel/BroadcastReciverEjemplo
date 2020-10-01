package com.josrangel.broadcastreciverejemplo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        if(intentAction != null){
            String toastMesage = "desconocido";
            if (Intent.ACTION_POWER_CONNECTED.equals(intentAction)){
                toastMesage = "Se conecto el dispositivo a la fuente de poder";
            }
            if (Intent.ACTION_POWER_DISCONNECTED.equals(intentAction)){
                toastMesage = "Se desconecto el dispositivo a la fuente de poder";
            }
            if (Intent.ACTION_USER_BACKGROUND.equals(intentAction)){
                toastMesage = "Se conecto el dispositivo a la fuente de poder";
            }

            Toast.makeText(context,toastMesage,Toast.LENGTH_SHORT).show();
        }
    }
}
