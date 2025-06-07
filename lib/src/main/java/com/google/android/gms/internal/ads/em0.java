package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class em0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7901c;

    private em0(int i10, int i11, int i12) {
        this.f7899a = i10;
        this.f7901c = i11;
        this.f7900b = i12;
    }

    public static em0 a() {
        return new em0(0, 0, 0);
    }

    public static em0 b(int i10, int i11) {
        return new em0(1, i10, i11);
    }

    public static em0 c(k3.h4 h4Var) {
        return h4Var.f24654p ? new em0(3, 0, 0) : h4Var.f24659u ? new em0(2, 0, 0) : h4Var.f24658t ? a() : b(h4Var.f24656r, h4Var.f24653o);
    }

    public static em0 d() {
        return new em0(5, 0, 0);
    }

    public static em0 e() {
        return new em0(4, 0, 0);
    }

    public final boolean f() {
        return this.f7899a == 0;
    }

    public final boolean g() {
        return this.f7899a == 2;
    }

    public final boolean h() {
        return this.f7899a == 5;
    }

    public final boolean i() {
        return this.f7899a == 3;
    }

    public final boolean j() {
        return this.f7899a == 4;
    }
}
