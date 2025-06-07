package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes.dex */
final class o20 implements xf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t10 f12957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f12958b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ tf0 f12959c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ r20 f12960d;

    o20(r20 r20Var, t10 t10Var, Object obj, tf0 tf0Var) {
        this.f12960d = r20Var;
        this.f12957a = t10Var;
        this.f12958b = obj;
        this.f12959c = tf0Var;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        r20.d(this.f12960d, this.f12957a, (a20) obj, this.f12958b, this.f12959c);
    }
}
