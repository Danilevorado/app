package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class yi0 implements c4.d {

    /* renamed from: m, reason: collision with root package name */
    protected final Context f18052m;

    /* renamed from: n, reason: collision with root package name */
    protected final String f18053n;

    /* renamed from: o, reason: collision with root package name */
    protected final WeakReference f18054o;

    public yi0(lh0 lh0Var) {
        Context context = lh0Var.getContext();
        this.f18052m = context;
        this.f18053n = j3.t.r().z(context, lh0Var.m().f8252m);
        this.f18054o = new WeakReference(lh0Var);
    }

    static /* bridge */ /* synthetic */ void h(yi0 yi0Var, String str, Map map) {
        lh0 lh0Var = (lh0) yi0Var.f18054o.get();
        if (lh0Var != null) {
            lh0Var.c("onPrecacheEvent", map);
        }
    }

    @Override // c4.d
    public void b() {
    }

    public abstract void j();

    public final void l(String str, String str2, String str3, String str4) {
        se0.f15201b.post(new xi0(this, str, str2, str3, str4));
    }

    protected final void n(String str, String str2, int i10) {
        se0.f15201b.post(new vi0(this, str, str2, i10));
    }

    public final void o(String str, String str2, long j10) {
        se0.f15201b.post(new wi0(this, str, str2, j10));
    }

    public final void p(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        se0.f15201b.post(new ui0(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void q(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        se0.f15201b.post(new ti0(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    protected void r(int i10) {
    }

    protected void s(int i10) {
    }

    protected void t(int i10) {
    }

    protected void u(int i10) {
    }

    public abstract boolean w(String str);

    public boolean x(String str, String[] strArr) {
        return w(str);
    }

    public boolean y(String str, String[] strArr, qi0 qi0Var) {
        return w(str);
    }
}
