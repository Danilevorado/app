package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class q1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f19202q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f19203r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Bundle f19204s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ u2 f19205t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q1(u2 u2Var, String str, String str2, Bundle bundle) {
        super(u2Var, true);
        this.f19205t = u2Var;
        this.f19202q = str;
        this.f19203r = str2;
        this.f19204s = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19205t.f19340i)).clearConditionalUserProperty(this.f19202q, this.f19203r, this.f19204s);
    }
}
