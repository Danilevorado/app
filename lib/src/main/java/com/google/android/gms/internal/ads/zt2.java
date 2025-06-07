package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class zt2 {
    public static void a(ab3 ab3Var, au2 au2Var, ot2 ot2Var) {
        g(ab3Var, au2Var, ot2Var, false);
    }

    public static void b(ab3 ab3Var, au2 au2Var, ot2 ot2Var) {
        g(ab3Var, au2Var, ot2Var, true);
    }

    public static void c(ab3 ab3Var, au2 au2Var, ot2 ot2Var) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            qa3.q(ga3.D(ab3Var), new yt2(au2Var, ot2Var), of0.f13191f);
        }
    }

    public static void d(ab3 ab3Var, ot2 ot2Var) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            qa3.q(ga3.D(ab3Var), new wt2(ot2Var), of0.f13191f);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) k3.w.c().b(ir.f9954g8), str);
    }

    public static int f(do2 do2Var) {
        int iE = s3.y.e(do2Var) - 1;
        return (iE == 0 || iE == 1) ? 7 : 23;
    }

    private static void g(ab3 ab3Var, au2 au2Var, ot2 ot2Var, boolean z10) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            qa3.q(ga3.D(ab3Var), new xt2(au2Var, ot2Var, z10), of0.f13191f);
        }
    }
}
