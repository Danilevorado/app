package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f8516a;

    private g(int i10, int i11, String str) {
        this.f8516a = str;
    }

    public static g a(jm2 jm2Var) {
        String str;
        jm2Var.g(2);
        int iS = jm2Var.s();
        int i10 = iS >> 1;
        int i11 = iS & 1;
        int iS2 = jm2Var.s() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i12 = iS2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(i12 >= 10 ? "." : ".0");
        sb2.append(i12);
        return new g(i10, i12, sb2.toString());
    }
}
