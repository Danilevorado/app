package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mk3 {

    /* renamed from: b, reason: collision with root package name */
    private static final mk3 f12187b = new mk3();

    /* renamed from: c, reason: collision with root package name */
    private static final lk3 f12188c = new lk3(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f12189a = new AtomicReference();

    public static mk3 a() {
        return f12187b;
    }

    public final zn3 b() {
        zn3 zn3Var = (zn3) this.f12189a.get();
        return zn3Var == null ? f12188c : zn3Var;
    }
}
