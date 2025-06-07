package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class e94 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f94 f7692a;

    /* synthetic */ e94(f94 f94Var, d94 d94Var) {
        this.f7692a = f94Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final f94 f94Var = this.f7692a;
        f94Var.f8192b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.c94
            @Override // java.lang.Runnable
            public final void run() {
                f94Var.h();
            }
        });
    }
}
