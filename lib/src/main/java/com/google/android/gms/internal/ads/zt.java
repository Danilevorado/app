package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zt extends iu {

    /* renamed from: u, reason: collision with root package name */
    private static final int f18753u;

    /* renamed from: v, reason: collision with root package name */
    static final int f18754v;

    /* renamed from: w, reason: collision with root package name */
    static final int f18755w;

    /* renamed from: m, reason: collision with root package name */
    private final String f18756m;

    /* renamed from: n, reason: collision with root package name */
    private final List f18757n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private final List f18758o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final int f18759p;

    /* renamed from: q, reason: collision with root package name */
    private final int f18760q;

    /* renamed from: r, reason: collision with root package name */
    private final int f18761r;

    /* renamed from: s, reason: collision with root package name */
    private final int f18762s;

    /* renamed from: t, reason: collision with root package name */
    private final int f18763t;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f18753u = iRgb;
        f18754v = Color.rgb(204, 204, 204);
        f18755w = iRgb;
    }

    public zt(String str, List list, Integer num, Integer num2, Integer num3, int i10, int i11, boolean z10) {
        this.f18756m = str;
        for (int i12 = 0; i12 < list.size(); i12++) {
            cu cuVar = (cu) list.get(i12);
            this.f18757n.add(cuVar);
            this.f18758o.add(cuVar);
        }
        this.f18759p = num != null ? num.intValue() : f18754v;
        this.f18760q = num2 != null ? num2.intValue() : f18755w;
        this.f18761r = num3 != null ? num3.intValue() : 12;
        this.f18762s = i10;
        this.f18763t = i11;
    }

    public final int M5() {
        return this.f18761r;
    }

    public final List N5() {
        return this.f18757n;
    }

    public final int b() {
        return this.f18762s;
    }

    public final int c() {
        return this.f18760q;
    }

    public final int d() {
        return this.f18763t;
    }

    public final int f() {
        return this.f18759p;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final List g() {
        return this.f18758o;
    }

    @Override // com.google.android.gms.internal.ads.ju
    public final String h() {
        return this.f18756m;
    }
}
