package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class li0 implements gy {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11610a;

    private static int b(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                k3.t.b();
                i10 = se0.z(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                ze0.g("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (m3.n1.m()) {
            m3.n1.k("Parse pixels for " + str + ", got string " + str2 + ", int " + i10 + ".");
        }
        return i10;
    }

    private static void c(zg0 zg0Var, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zg0Var.d(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                ze0.g(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zg0Var.b(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zg0Var.I(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zg0Var.J(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zg0Var.l(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:176|(1:(10:179|186|(6:188|(0)|208|196|197|(2:205|206)(2:201|(2:203|204)(1:227)))(3:191|(1:193)|194)|195|208|196|197|(1:199)|205|206)(1:180))(3:181|(1:183)|184)|185|186|(0)(0)|195|208|196|197|(0)|205|206) */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0435  */
    @Override // com.google.android.gms.internal.ads.gy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r22, java.util.Map r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li0.a(java.lang.Object, java.util.Map):void");
    }
}
