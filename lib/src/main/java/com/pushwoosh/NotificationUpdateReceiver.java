package com.pushwoosh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g8.c;

/* loaded from: classes.dex */
public class NotificationUpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.d(context, intent);
    }
}
