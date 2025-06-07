package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class sh2 implements c44 {
    public static ne2 a(Context context, xd0 xd0Var, yd0 yd0Var, Object obj, gf2 gf2Var, xg2 xg2Var, w34 w34Var, w34 w34Var2, w34 w34Var3, w34 w34Var4, w34 w34Var5, w34 w34Var6, w34 w34Var7, w34 w34Var8, w34 w34Var9, Executor executor, au2 au2Var, xm1 xm1Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((qg2) obj);
        hashSet.add(gf2Var);
        hashSet.add(xg2Var);
        if (((Boolean) k3.w.c().b(ir.f10071r5)).booleanValue()) {
            hashSet.add((ke2) w34Var.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10082s5)).booleanValue()) {
            hashSet.add((ke2) w34Var2.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10093t5)).booleanValue()) {
            hashSet.add((ke2) w34Var3.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10104u5)).booleanValue()) {
            hashSet.add((ke2) w34Var4.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10148y5)).booleanValue()) {
            hashSet.add((ke2) w34Var6.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10159z5)).booleanValue()) {
            hashSet.add((ke2) w34Var7.b());
        }
        if (((Boolean) k3.w.c().b(ir.f10156z2)).booleanValue()) {
            hashSet.add((ke2) w34Var9.b());
        }
        return new ne2(context, executor, hashSet, au2Var, xm1Var);
    }
}
