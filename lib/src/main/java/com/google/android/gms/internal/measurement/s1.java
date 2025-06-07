package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
final class s1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Activity f19270q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f19271r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f19272s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ u2 f19273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s1(u2 u2Var, Activity activity, String str, String str2) {
        super(u2Var, true);
        this.f19273t = u2Var;
        this.f19270q = activity;
        this.f19271r = str;
        this.f19272s = str2;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        ((f1) e4.p.l(this.f19273t.f19340i)).setCurrentScreen(l4.b.p1(this.f19270q), this.f19271r, this.f19272s, this.f19043m);
    }
}
