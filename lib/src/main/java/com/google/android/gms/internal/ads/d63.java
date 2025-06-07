package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class d63 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7207a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7208b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7209c;

    d63(Object obj, Object obj2, Object obj3) {
        this.f7207a = obj;
        this.f7208b = obj2;
        this.f7209c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f7207a) + "=" + String.valueOf(this.f7208b) + " and " + String.valueOf(this.f7207a) + "=" + String.valueOf(this.f7209c));
    }
}
