package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class pi1 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f13897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13898b;

    /* renamed from: c, reason: collision with root package name */
    private final gy f13899c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ qi1 f13900d;

    /* synthetic */ pi1(qi1 qi1Var, WeakReference weakReference, String str, gy gyVar, oi1 oi1Var) {
        this.f13900d = qi1Var;
        this.f13897a = weakReference;
        this.f13898b = str;
        this.f13899c = gyVar;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        Object obj2 = this.f13897a.get();
        if (obj2 == null) {
            this.f13900d.k(this.f13898b, this);
        } else {
            this.f13899c.a(obj2, map);
        }
    }
}
