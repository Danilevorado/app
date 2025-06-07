package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class e20 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7607a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f7608b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private n20 f7609c;

    /* renamed from: d, reason: collision with root package name */
    private n20 f7610d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final n20 a(Context context, ff0 ff0Var, cu2 cu2Var) {
        n20 n20Var;
        synchronized (this.f7607a) {
            if (this.f7609c == null) {
                this.f7609c = new n20(c(context), ff0Var, (String) k3.w.c().b(ir.f9881a), cu2Var);
            }
            n20Var = this.f7609c;
        }
        return n20Var;
    }

    public final n20 b(Context context, ff0 ff0Var, cu2 cu2Var) {
        n20 n20Var;
        synchronized (this.f7608b) {
            if (this.f7610d == null) {
                this.f7610d = new n20(c(context), ff0Var, (String) nt.f12846b.e(), cu2Var);
            }
            n20Var = this.f7610d;
        }
        return n20Var;
    }
}
