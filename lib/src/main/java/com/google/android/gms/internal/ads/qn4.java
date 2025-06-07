package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qn4 {

    /* renamed from: a, reason: collision with root package name */
    public final List f14422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14424c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14425d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14426e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14427f;

    private qn4(List list, int i10, int i11, int i12, float f5, String str) {
        this.f14422a = list;
        this.f14423b = i10;
        this.f14424c = i11;
        this.f14425d = i12;
        this.f14426e = f5;
        this.f14427f = str;
    }

    public static qn4 a(jm2 jm2Var) throws oh0 {
        int i10;
        int i11;
        String strA;
        float f5;
        try {
            jm2Var.g(4);
            int iS = (jm2Var.s() & 3) + 1;
            if (iS == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iS2 = jm2Var.s() & 31;
            for (int i12 = 0; i12 < iS2; i12++) {
                arrayList.add(b(jm2Var));
            }
            int iS3 = jm2Var.s();
            for (int i13 = 0; i13 < iS3; i13++) {
                arrayList.add(b(jm2Var));
            }
            if (iS2 > 0) {
                h0 h0VarD = i0.d((byte[]) arrayList.get(0), iS + 1, ((byte[]) arrayList.get(0)).length);
                int i14 = h0VarD.f8924e;
                int i15 = h0VarD.f8925f;
                float f10 = h0VarD.f8926g;
                strA = iv1.a(h0VarD.f8920a, h0VarD.f8921b, h0VarD.f8922c);
                i10 = i14;
                i11 = i15;
                f5 = f10;
            } else {
                i10 = -1;
                i11 = -1;
                strA = null;
                f5 = 1.0f;
            }
            return new qn4(arrayList, iS, i10, i11, f5, strA);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw oh0.a("Error parsing AVC config", e5);
        }
    }

    private static byte[] b(jm2 jm2Var) {
        int iW = jm2Var.w();
        int iK = jm2Var.k();
        jm2Var.g(iW);
        return iv1.c(jm2Var.h(), iK, iW);
    }
}
