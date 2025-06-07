package com.pushwoosh;

import a9.g;
import a9.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import k9.h;

/* loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {

    public static class a implements g {
        private a() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        h.h("BootReceiver", "onReceive");
        if (intent != null) {
            try {
                if (TextUtils.equals("android.intent.action.BOOT_COMPLETED", intent.getAction())) {
                    i.e(new a());
                    return;
                }
            } catch (Exception e5) {
                h.o(e5);
                return;
            }
        }
        h.x("BootReceiver", "Received unexpected action");
    }
}
