package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import h3.a;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xx2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17828a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17829b;

    /* renamed from: c, reason: collision with root package name */
    private final dx2 f17830c;

    /* renamed from: d, reason: collision with root package name */
    private final fx2 f17831d;

    /* renamed from: e, reason: collision with root package name */
    private final wx2 f17832e;

    /* renamed from: f, reason: collision with root package name */
    private final wx2 f17833f;

    /* renamed from: g, reason: collision with root package name */
    private b5.i f17834g;

    /* renamed from: h, reason: collision with root package name */
    private b5.i f17835h;

    xx2(Context context, Executor executor, dx2 dx2Var, fx2 fx2Var, ux2 ux2Var, vx2 vx2Var) {
        this.f17828a = context;
        this.f17829b = executor;
        this.f17830c = dx2Var;
        this.f17831d = fx2Var;
        this.f17832e = ux2Var;
        this.f17833f = vx2Var;
    }

    public static xx2 e(Context context, Executor executor, dx2 dx2Var, fx2 fx2Var) {
        final xx2 xx2Var = new xx2(context, executor, dx2Var, fx2Var, new ux2(), new vx2());
        xx2Var.f17834g = xx2Var.f17831d.d() ? xx2Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.qx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14530a.c();
            }
        }) : b5.l.e(xx2Var.f17832e.a());
        xx2Var.f17835h = xx2Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.rx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15003a.d();
            }
        });
        return xx2Var;
    }

    private static vd g(b5.i iVar, vd vdVar) {
        return !iVar.n() ? vdVar : (vd) iVar.j();
    }

    private final b5.i h(Callable callable) {
        return b5.l.c(this.f17829b, callable).d(this.f17829b, new b5.e() { // from class: com.google.android.gms.internal.ads.sx2
            @Override // b5.e
            public final void d(Exception exc) {
                this.f15590a.f(exc);
            }
        });
    }

    public final vd a() {
        return g(this.f17834g, this.f17832e.a());
    }

    public final vd b() {
        return g(this.f17835h, this.f17833f.a());
    }

    final /* synthetic */ vd c() {
        Context context = this.f17828a;
        xc xcVarK0 = vd.k0();
        a.C0142a c0142aA = h3.a.a(context);
        String strA = c0142aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            xcVarK0.u0(strA);
            xcVarK0.t0(c0142aA.b());
            xcVarK0.X(6);
        }
        return (vd) xcVarK0.m();
    }

    final /* synthetic */ vd d() throws PackageManager.NameNotFoundException {
        Context context = this.f17828a;
        return lx2.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f17830c.c(2025, -1L, exc);
    }
}
