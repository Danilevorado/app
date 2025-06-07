package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import x4.j;
import x4.k;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends l0.a implements j {

    /* renamed from: o, reason: collision with root package name */
    private k f19729o;

    @Override // x4.j
    public void a(Context context, Intent intent) {
        l0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f19729o == null) {
            this.f19729o = new k(this);
        }
        this.f19729o.a(context, intent);
    }
}
