package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class k14 {

    /* renamed from: a, reason: collision with root package name */
    private int f10776a;

    public final void a(int i10) {
        this.f10776a |= Integer.MIN_VALUE;
    }

    public void b() {
        this.f10776a = 0;
    }

    public final void c(int i10) {
        this.f10776a = i10;
    }

    protected final boolean d(int i10) {
        return (this.f10776a & i10) == i10;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}
