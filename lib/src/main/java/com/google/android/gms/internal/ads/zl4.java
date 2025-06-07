package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zl4 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f18628g = new Comparator() { // from class: com.google.android.gms.internal.ads.vl4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((yl4) obj).f18097a - ((yl4) obj2).f18097a;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f18629h = new Comparator() { // from class: com.google.android.gms.internal.ads.wl4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((yl4) obj).f18099c, ((yl4) obj2).f18099c);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f18633d;

    /* renamed from: e, reason: collision with root package name */
    private int f18634e;

    /* renamed from: f, reason: collision with root package name */
    private int f18635f;

    /* renamed from: b, reason: collision with root package name */
    private final yl4[] f18631b = new yl4[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f18630a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f18632c = -1;

    public zl4(int i10) {
    }

    public final float a(float f5) {
        if (this.f18632c != 0) {
            Collections.sort(this.f18630a, f18629h);
            this.f18632c = 0;
        }
        float f10 = this.f18634e;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18630a.size(); i11++) {
            float f11 = 0.5f * f10;
            yl4 yl4Var = (yl4) this.f18630a.get(i11);
            i10 += yl4Var.f18098b;
            if (i10 >= f11) {
                return yl4Var.f18099c;
            }
        }
        if (this.f18630a.isEmpty()) {
            return Float.NaN;
        }
        return ((yl4) this.f18630a.get(r6.size() - 1)).f18099c;
    }

    public final void b(int i10, float f5) {
        yl4 yl4Var;
        int i11;
        yl4 yl4Var2;
        int i12;
        if (this.f18632c != 1) {
            Collections.sort(this.f18630a, f18628g);
            this.f18632c = 1;
        }
        int i13 = this.f18635f;
        if (i13 > 0) {
            yl4[] yl4VarArr = this.f18631b;
            int i14 = i13 - 1;
            this.f18635f = i14;
            yl4Var = yl4VarArr[i14];
        } else {
            yl4Var = new yl4(null);
        }
        int i15 = this.f18633d;
        this.f18633d = i15 + 1;
        yl4Var.f18097a = i15;
        yl4Var.f18098b = i10;
        yl4Var.f18099c = f5;
        this.f18630a.add(yl4Var);
        int i16 = this.f18634e + i10;
        while (true) {
            this.f18634e = i16;
            while (true) {
                int i17 = this.f18634e;
                if (i17 <= 2000) {
                    return;
                }
                i11 = i17 - 2000;
                yl4Var2 = (yl4) this.f18630a.get(0);
                i12 = yl4Var2.f18098b;
                if (i12 <= i11) {
                    this.f18634e -= i12;
                    this.f18630a.remove(0);
                    int i18 = this.f18635f;
                    if (i18 < 5) {
                        yl4[] yl4VarArr2 = this.f18631b;
                        this.f18635f = i18 + 1;
                        yl4VarArr2[i18] = yl4Var2;
                    }
                }
            }
            yl4Var2.f18098b = i12 - i11;
            i16 = this.f18634e - i11;
        }
    }

    public final void c() {
        this.f18630a.clear();
        this.f18632c = -1;
        this.f18633d = 0;
        this.f18634e = 0;
    }
}
