package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class k82 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final ke2 f10864a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f10865b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10866c;

    /* renamed from: d, reason: collision with root package name */
    private final je0 f10867d;

    public k82(da2 da2Var, do2 do2Var, Context context, je0 je0Var) {
        this.f10864a = da2Var;
        this.f10865b = do2Var;
        this.f10866c = context;
        this.f10867d = je0Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.l(this.f10864a.b(), new w23() { // from class: com.google.android.gms.internal.ads.j82
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f10373a.c((pe2) obj);
            }
        }, of0.f13191f);
    }

    final /* synthetic */ l82 c(pe2 pe2Var) {
        String str;
        boolean z10;
        String strN;
        float f5;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        k3.h4 h4Var = this.f10865b.f7446e;
        k3.h4[] h4VarArr = h4Var.f24657s;
        if (h4VarArr != null) {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (k3.h4 h4Var2 : h4VarArr) {
                boolean z13 = h4Var2.f24659u;
                if (!z13 && !z11) {
                    str = h4Var2.f24651m;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = h4Var.f24651m;
            z10 = h4Var.f24659u;
        }
        Resources resources = this.f10866c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strN = null;
            f5 = 0.0f;
            i10 = 0;
            i11 = 0;
        } else {
            float f10 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            strN = this.f10867d.h().n();
            i11 = i13;
            f5 = f10;
        }
        StringBuilder sb2 = new StringBuilder();
        k3.h4[] h4VarArr2 = h4Var.f24657s;
        if (h4VarArr2 != null) {
            boolean z14 = false;
            for (k3.h4 h4Var3 : h4VarArr2) {
                if (h4Var3.f24659u) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = h4Var3.f24655q;
                    if (i14 == -1) {
                        i14 = f5 != 0.0f ? (int) (h4Var3.f24656r / f5) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = h4Var3.f24652n;
                    if (i15 == -2) {
                        i15 = f5 != 0.0f ? (int) (h4Var3.f24653o / f5) : -2;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new l82(h4Var, str, z10, sb2.toString(), f5, i11, i10, strN, this.f10865b.f7457p);
    }
}
