package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class k84 implements b84 {

    /* renamed from: a, reason: collision with root package name */
    public final ch4 f10868a;

    /* renamed from: d, reason: collision with root package name */
    public int f10871d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10872e;

    /* renamed from: c, reason: collision with root package name */
    public final List f10870c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f10869b = new Object();

    public k84(jh4 jh4Var, boolean z10) {
        this.f10868a = new ch4(jh4Var, z10);
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final h11 a() {
        return this.f10868a.F();
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final Object b() {
        return this.f10869b;
    }

    public final void c(int i10) {
        this.f10871d = i10;
        this.f10872e = false;
        this.f10870c.clear();
    }
}
