package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class wg extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17117a = true;

    wg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    final boolean a() {
        return this.f17117a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z10 = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            return;
        } else {
            z10 = false;
        }
        this.f17117a = z10;
    }
}
