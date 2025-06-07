package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class gq2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f8863a = new HashMap();

    public final fq2 a(wp2 wp2Var, Context context, op2 op2Var, mq2 mq2Var) {
        fq2 fq2Var = (fq2) this.f8863a.get(wp2Var);
        if (fq2Var != null) {
            return fq2Var;
        }
        tp2 tp2Var = new tp2(zp2.f(wp2Var, context));
        fq2 fq2Var2 = new fq2(tp2Var, new pq2(tp2Var, op2Var, mq2Var));
        this.f8863a.put(wp2Var, fq2Var2);
        return fq2Var2;
    }
}
