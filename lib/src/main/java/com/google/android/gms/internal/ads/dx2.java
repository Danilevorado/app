package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dx2 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f7537e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7538f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7539a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7540b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.i f7541c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7542d;

    dx2(Context context, Executor executor, b5.i iVar, boolean z10) {
        this.f7539a = context;
        this.f7540b = executor;
        this.f7541c = iVar;
        this.f7542d = z10;
    }

    public static dx2 a(final Context context, Executor executor, boolean z10) {
        final b5.j jVar = new b5.j();
        executor.execute(z10 ? new Runnable() { // from class: com.google.android.gms.internal.ads.zw2
            @Override // java.lang.Runnable
            public final void run() {
                jVar.c(hz2.b(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.google.android.gms.internal.ads.ax2
            @Override // java.lang.Runnable
            public final void run() {
                jVar.c(hz2.c());
            }
        });
        return new dx2(context, executor, jVar.a(), z10);
    }

    static void g(int i10) {
        f7537e = i10;
    }

    private final b5.i h(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.f7542d) {
            return this.f7541c.f(this.f7540b, new b5.a() { // from class: com.google.android.gms.internal.ads.bx2
                @Override // b5.a
                public final Object a(b5.i iVar) {
                    return Boolean.valueOf(iVar.n());
                }
            });
        }
        final ic icVarK = mc.K();
        icVarK.u(this.f7539a.getPackageName());
        icVarK.z(j10);
        icVarK.B(f7537e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            icVarK.A(stringWriter.toString());
            icVarK.y(exc.getClass().getName());
        }
        if (str2 != null) {
            icVarK.v(str2);
        }
        if (str != null) {
            icVarK.w(str);
        }
        return this.f7541c.f(this.f7540b, new b5.a() { // from class: com.google.android.gms.internal.ads.cx2
            @Override // b5.a
            public final Object a(b5.i iVar) {
                ic icVar = icVarK;
                int i11 = i10;
                int i12 = dx2.f7538f;
                if (!iVar.n()) {
                    return Boolean.FALSE;
                }
                gz2 gz2VarA = ((hz2) iVar.j()).a(((mc) icVar.m()).x());
                gz2VarA.a(i11);
                gz2VarA.c();
                return Boolean.TRUE;
            }
        });
    }

    public final b5.i b(int i10, String str) {
        return h(i10, 0L, null, null, null, str);
    }

    public final b5.i c(int i10, long j10, Exception exc) {
        return h(i10, j10, exc, null, null, null);
    }

    public final b5.i d(int i10, long j10) {
        return h(i10, j10, null, null, null, null);
    }

    public final b5.i e(int i10, long j10, String str) {
        return h(i10, j10, null, null, null, str);
    }

    public final b5.i f(int i10, long j10, String str, Map map) {
        return h(i10, j10, null, str, null, null);
    }
}
