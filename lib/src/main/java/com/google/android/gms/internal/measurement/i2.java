package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class i2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Long f18997q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f18998r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f18999s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Bundle f19000t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ boolean f19001u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ boolean f19002v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ u2 f19003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i2(u2 u2Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(u2Var, true);
        this.f19003w = u2Var;
        this.f18997q = l10;
        this.f18998r = str;
        this.f18999s = str2;
        this.f19000t = bundle;
        this.f19001u = z10;
        this.f19002v = z11;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        Long l10 = this.f18997q;
        ((f1) e4.p.l(this.f19003w.f19340i)).logEvent(this.f18998r, this.f18999s, this.f19000t, this.f19001u, this.f19002v, l10 == null ? this.f19043m : l10.longValue());
    }
}
