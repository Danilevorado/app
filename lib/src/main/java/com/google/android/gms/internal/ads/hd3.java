package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hd3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9110a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9111b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9112c;

    /* renamed from: d, reason: collision with root package name */
    private final ut3 f9113d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9114e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9115f;

    /* renamed from: g, reason: collision with root package name */
    private final gc3 f9116g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9117h;

    hd3(Object obj, Object obj2, byte[] bArr, int i10, ut3 ut3Var, int i11, String str, gc3 gc3Var) {
        this.f9110a = obj;
        this.f9111b = obj2;
        this.f9112c = Arrays.copyOf(bArr, bArr.length);
        this.f9117h = i10;
        this.f9113d = ut3Var;
        this.f9114e = i11;
        this.f9115f = str;
        this.f9116g = gc3Var;
    }

    public final int a() {
        return this.f9114e;
    }

    public final gc3 b() {
        return this.f9116g;
    }

    public final ut3 c() {
        return this.f9113d;
    }

    public final Object d() {
        return this.f9110a;
    }

    public final Object e() {
        return this.f9111b;
    }

    public final String f() {
        return this.f9115f;
    }

    public final byte[] g() {
        byte[] bArr = this.f9112c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int h() {
        return this.f9117h;
    }
}
