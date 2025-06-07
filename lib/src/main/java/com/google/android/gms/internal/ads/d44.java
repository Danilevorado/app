package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d44 implements c44, w34 {

    /* renamed from: b, reason: collision with root package name */
    private static final d44 f7182b = new d44(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f7183a;

    private d44(Object obj) {
        this.f7183a = obj;
    }

    public static c44 a(Object obj) {
        k44.a(obj, "instance cannot be null");
        return new d44(obj);
    }

    public static c44 c(Object obj) {
        return obj == null ? f7182b : new d44(obj);
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final Object b() {
        return this.f7183a;
    }
}
