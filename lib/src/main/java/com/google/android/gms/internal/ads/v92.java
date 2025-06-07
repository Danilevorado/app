package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v92 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f16635a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16636b;

    v92(bb3 bb3Var, Context context) {
        this.f16635a = bb3Var;
        this.f16636b = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f16635a.g(new Callable() { // from class: com.google.android.gms.internal.ads.u92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16238a.c();
            }
        });
    }

    final /* synthetic */ w92 c() {
        double d10;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f16636b.registerReceiver(null, intentFilter) : this.f16636b.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            double intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
            double intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
            z = intExtra == 2 || intExtra == 5;
            d10 = intExtra2 / intExtra3;
        } else {
            d10 = -1.0d;
        }
        return new w92(d10, z);
    }
}
