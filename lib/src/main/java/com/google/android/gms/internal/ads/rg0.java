package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes.dex */
public abstract class rg0 extends TextureView implements ph0 {

    /* renamed from: m, reason: collision with root package name */
    protected final fh0 f14778m;

    /* renamed from: n, reason: collision with root package name */
    protected final qh0 f14779n;

    public rg0(Context context) {
        super(context);
        this.f14778m = new fh0();
        this.f14779n = new qh0(context, this);
    }

    public Integer A() {
        return null;
    }

    public void B(int i10) {
    }

    public void C(int i10) {
    }

    public void D(int i10) {
    }

    public void b(int i10) {
    }

    public void c(int i10) {
    }

    public void h(String str, String[] strArr, Integer num) {
        x(str);
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract void m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long q();

    public abstract String r();

    public abstract void s();

    public abstract void t();

    public abstract void u(int i10);

    public abstract void w(qg0 qg0Var);

    public abstract void x(String str);

    public abstract void y();

    public abstract void z(float f5, float f10);
}
