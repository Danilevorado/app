package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z54 {

    /* renamed from: a, reason: collision with root package name */
    final Context f18416a;

    /* renamed from: b, reason: collision with root package name */
    hu1 f18417b;

    /* renamed from: c, reason: collision with root package name */
    z33 f18418c;

    /* renamed from: d, reason: collision with root package name */
    z33 f18419d;

    /* renamed from: e, reason: collision with root package name */
    z33 f18420e;

    /* renamed from: f, reason: collision with root package name */
    z33 f18421f;

    /* renamed from: g, reason: collision with root package name */
    z33 f18422g;

    /* renamed from: h, reason: collision with root package name */
    w23 f18423h;

    /* renamed from: i, reason: collision with root package name */
    Looper f18424i;

    /* renamed from: j, reason: collision with root package name */
    u74 f18425j;

    /* renamed from: k, reason: collision with root package name */
    int f18426k;

    /* renamed from: l, reason: collision with root package name */
    boolean f18427l;

    /* renamed from: m, reason: collision with root package name */
    x84 f18428m;

    /* renamed from: n, reason: collision with root package name */
    long f18429n;

    /* renamed from: o, reason: collision with root package name */
    long f18430o;

    /* renamed from: p, reason: collision with root package name */
    boolean f18431p;

    /* renamed from: q, reason: collision with root package name */
    boolean f18432q;

    /* renamed from: r, reason: collision with root package name */
    j54 f18433r;

    public z54(final Context context, wj0 wj0Var) {
        s54 s54Var = new s54(wj0Var);
        t54 t54Var = new t54(context);
        z33 z33Var = new z33() { // from class: com.google.android.gms.internal.ads.v54
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return new pk4(context);
            }
        };
        w54 w54Var = new z33() { // from class: com.google.android.gms.internal.ads.w54
            @Override // com.google.android.gms.internal.ads.z33
            public final Object a() {
                return new k54();
            }
        };
        x54 x54Var = new x54(context);
        y54 y54Var = new w23() { // from class: com.google.android.gms.internal.ads.y54
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return new ob4((hu1) obj);
            }
        };
        Objects.requireNonNull(context);
        this.f18416a = context;
        this.f18418c = s54Var;
        this.f18419d = t54Var;
        this.f18420e = z33Var;
        this.f18421f = w54Var;
        this.f18422g = x54Var;
        this.f18423h = y54Var;
        this.f18424i = sv2.B();
        this.f18425j = u74.f16215c;
        this.f18426k = 1;
        this.f18427l = true;
        this.f18428m = x84.f17478g;
        this.f18433r = new j54(0.97f, 1.03f, 1000L, 1.0E-7f, sv2.w(20L), sv2.w(500L), 0.999f, null);
        this.f18417b = hu1.f9421a;
        this.f18429n = 500L;
        this.f18430o = 2000L;
        this.f18431p = true;
    }

    static /* synthetic */ gh4 a(Context context) {
        return new tg4(context, new f());
    }
}
