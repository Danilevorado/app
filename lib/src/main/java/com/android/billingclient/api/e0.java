package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5199a;

    /* renamed from: b, reason: collision with root package name */
    private final k1.g f5200b;

    /* renamed from: c, reason: collision with root package name */
    private final k1.p f5201c;

    /* renamed from: d, reason: collision with root package name */
    private final k1.i f5202d;

    /* renamed from: e, reason: collision with root package name */
    private final u f5203e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f5204f = new d0(this, true);

    /* renamed from: g, reason: collision with root package name */
    private final d0 f5205g = new d0(this, false);

    /* renamed from: h, reason: collision with root package name */
    private boolean f5206h;

    e0(Context context, k1.g gVar, k1.v vVar, k1.p pVar, k1.i iVar, u uVar) {
        this.f5199a = context;
        this.f5200b = gVar;
        this.f5201c = pVar;
        this.f5202d = iVar;
        this.f5203e = uVar;
    }

    final k1.g d() {
        return this.f5200b;
    }

    final void f(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f5206h = z10;
        this.f5205g.a(this.f5199a, intentFilter2);
        if (this.f5206h) {
            this.f5204f.b(this.f5199a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f5204f.a(this.f5199a, intentFilter);
        }
    }
}
