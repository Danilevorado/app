package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class wf {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f17108c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile hz2 f17109d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f17110e = null;

    /* renamed from: a, reason: collision with root package name */
    private final dh f17111a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f17112b;

    public wf(dh dhVar) {
        this.f17111a = dhVar;
        dhVar.k().execute(new vf(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (f17110e == null) {
            synchronized (wf.class) {
                if (f17110e == null) {
                    f17110e = new Random();
                }
            }
        }
        return f17110e;
    }

    public final void c(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f17108c.block();
            if (!this.f17112b.booleanValue() || f17109d == null) {
                return;
            }
            ic icVarK = mc.K();
            icVarK.u(this.f17111a.f7297a.getPackageName());
            icVarK.z(j10);
            if (str != null) {
                icVarK.v(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                icVarK.A(stringWriter.toString());
                icVarK.y(exc.getClass().getName());
            }
            gz2 gz2VarA = f17109d.a(((mc) icVarK.m()).x());
            gz2VarA.a(i10);
            if (i11 != -1) {
                gz2VarA.b(i11);
            }
            gz2VarA.c();
        } catch (Exception unused) {
        }
    }
}
