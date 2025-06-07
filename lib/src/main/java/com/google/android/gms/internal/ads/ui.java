package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class ui implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f16341a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final dh f16342b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f16343c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f16344d;

    /* renamed from: e, reason: collision with root package name */
    protected final xc f16345e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f16346f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f16347g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f16348h;

    public ui(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        this.f16342b = dhVar;
        this.f16343c = str;
        this.f16344d = str2;
        this.f16345e = xcVar;
        this.f16347g = i10;
        this.f16348h = i11;
    }

    protected abstract void a();

    public Void b() {
        long jNanoTime;
        Method methodJ;
        int i10;
        try {
            jNanoTime = System.nanoTime();
            methodJ = this.f16342b.j(this.f16343c, this.f16344d);
            this.f16346f = methodJ;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodJ == null) {
            return null;
        }
        a();
        wf wfVarD = this.f16342b.d();
        if (wfVarD != null && (i10 = this.f16347g) != Integer.MIN_VALUE) {
            wfVarD.c(this.f16348h, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
