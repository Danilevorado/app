package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes.dex */
public final class ty2 {

    /* renamed from: a, reason: collision with root package name */
    private final File f16096a;

    /* renamed from: b, reason: collision with root package name */
    final File f16097b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f16098c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16099d;

    public ty2(Context context, int i10) {
        this.f16098c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        vy2.a(dir, false);
        this.f16096a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        vy2.a(dir2, true);
        this.f16097b = dir2;
        this.f16099d = i10;
    }

    private final File d() {
        File file = new File(this.f16096a, Integer.toString(this.f16099d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        return "FBAMTD" + (this.f16099d - 1);
    }

    private final String f() {
        return "LATMTD" + (this.f16099d - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.zi r8, com.google.android.gms.internal.ads.az2 r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ty2.a(com.google.android.gms.internal.ads.zi, com.google.android.gms.internal.ads.az2):boolean");
    }

    final cj b(int i10) {
        SharedPreferences sharedPreferences;
        String strE;
        if (i10 == 1) {
            sharedPreferences = this.f16098c;
            strE = f();
        } else {
            sharedPreferences = this.f16098c;
            strE = e();
        }
        String string = sharedPreferences.getString(strE, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = i4.j.c(string);
            ww3 ww3Var = ww3.f17284n;
            cj cjVarQ = cj.Q(ww3.I(bArrC, 0, bArrC.length));
            String strT = cjVarQ.T();
            File fileB = vy2.b(strT, "pcam.jar", d());
            if (!fileB.exists()) {
                fileB = vy2.b(strT, "pcam", d());
            }
            File fileB2 = vy2.b(strT, "pcbc", d());
            if (fileB.exists()) {
                if (fileB2.exists()) {
                    return cjVarQ;
                }
            }
        } catch (ny3 unused) {
        }
        return null;
    }

    public final sy2 c(int i10) {
        cj cjVarB = b(1);
        if (cjVarB == null) {
            return null;
        }
        String strT = cjVarB.T();
        File fileB = vy2.b(strT, "pcam.jar", d());
        if (!fileB.exists()) {
            fileB = vy2.b(strT, "pcam", d());
        }
        return new sy2(cjVarB, fileB, vy2.b(strT, "pcbc", d()), vy2.b(strT, "pcopt", d()));
    }
}
