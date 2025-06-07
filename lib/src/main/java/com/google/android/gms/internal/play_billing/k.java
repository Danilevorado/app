package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19558a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19559b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19560c;

    k(Object obj, Object obj2, Object obj3) {
        this.f19558a = obj;
        this.f19559b = obj2;
        this.f19560c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f19560c;
        Object obj2 = this.f19559b;
        Object obj3 = this.f19558a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
