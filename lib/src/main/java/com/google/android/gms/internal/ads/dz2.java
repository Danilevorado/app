package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class dz2 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap f7560g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f7561a;

    /* renamed from: b, reason: collision with root package name */
    private final ez2 f7562b;

    /* renamed from: c, reason: collision with root package name */
    private final dx2 f7563c;

    /* renamed from: d, reason: collision with root package name */
    private final yw2 f7564d;

    /* renamed from: e, reason: collision with root package name */
    private ry2 f7565e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f7566f = new Object();

    public dz2(Context context, ez2 ez2Var, dx2 dx2Var, yw2 yw2Var) {
        this.f7561a = context;
        this.f7562b = ez2Var;
        this.f7563c = dx2Var;
        this.f7564d = yw2Var;
    }

    private final synchronized Class d(sy2 sy2Var) {
        String strT = sy2Var.a().T();
        HashMap map = f7560g;
        Class cls = (Class) map.get(strT);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f7564d.a(sy2Var.c())) {
                throw new cz2(2026, "VM did not pass signature verification");
            }
            try {
                File fileB = sy2Var.b();
                if (!fileB.exists()) {
                    fileB.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(sy2Var.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.f7561a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strT, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e5) {
                throw new cz2(AdError.REMOTE_ADS_SERVICE_ERROR, e5);
            }
        } catch (GeneralSecurityException e10) {
            throw new cz2(2026, e10);
        }
    }

    public final gx2 a() {
        ry2 ry2Var;
        synchronized (this.f7566f) {
            ry2Var = this.f7565e;
        }
        return ry2Var;
    }

    public final sy2 b() {
        synchronized (this.f7566f) {
            ry2 ry2Var = this.f7565e;
            if (ry2Var == null) {
                return null;
            }
            return ry2Var.f();
        }
    }

    public final boolean c(sy2 sy2Var) throws cz2 {
        int iA;
        Exception exc;
        dx2 dx2Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ry2 ry2Var = new ry2(d(sy2Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f7561a, "msa-r", sy2Var.e(), null, new Bundle(), 2), sy2Var, this.f7562b, this.f7563c);
                if (!ry2Var.h()) {
                    throw new cz2(4000, "init failed");
                }
                int iE = ry2Var.e();
                if (iE != 0) {
                    throw new cz2(4001, "ci: " + iE);
                }
                synchronized (this.f7566f) {
                    ry2 ry2Var2 = this.f7565e;
                    if (ry2Var2 != null) {
                        try {
                            ry2Var2.g();
                        } catch (cz2 e5) {
                            this.f7563c.c(e5.a(), -1L, e5);
                        }
                        this.f7565e = ry2Var;
                    } else {
                        this.f7565e = ry2Var;
                    }
                }
                this.f7563c.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new cz2(AdError.INTERNAL_ERROR_2004, e10);
            }
        } catch (cz2 e11) {
            dx2 dx2Var2 = this.f7563c;
            iA = e11.a();
            dx2Var = dx2Var2;
            exc = e11;
            dx2Var.c(iA, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        } catch (Exception e12) {
            iA = 4010;
            dx2Var = this.f7563c;
            exc = e12;
            dx2Var.c(iA, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        }
    }
}
