package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v30 {

    /* renamed from: i, reason: collision with root package name */
    public static final v30 f16545i = new rg().c();

    /* renamed from: j, reason: collision with root package name */
    private static final String f16546j = Integer.toString(0, 36);

    /* renamed from: k, reason: collision with root package name */
    private static final String f16547k = Integer.toString(1, 36);

    /* renamed from: l, reason: collision with root package name */
    private static final String f16548l = Integer.toString(2, 36);

    /* renamed from: m, reason: collision with root package name */
    private static final String f16549m = Integer.toString(3, 36);

    /* renamed from: n, reason: collision with root package name */
    private static final String f16550n = Integer.toString(4, 36);

    /* renamed from: o, reason: collision with root package name */
    public static final xa4 f16551o = new xa4() { // from class: com.google.android.gms.internal.ads.pe
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f16552a;

    /* renamed from: b, reason: collision with root package name */
    public final ew f16553b;

    /* renamed from: c, reason: collision with root package name */
    public final cy f16554c;

    /* renamed from: d, reason: collision with root package name */
    public final fu f16555d;

    /* renamed from: e, reason: collision with root package name */
    public final i90 f16556e;

    /* renamed from: f, reason: collision with root package name */
    public final vk f16557f;

    /* renamed from: g, reason: collision with root package name */
    public final xm f16558g;

    /* renamed from: h, reason: collision with root package name */
    public final t00 f16559h;

    /* synthetic */ v30(String str, xm xmVar, cy cyVar, fu fuVar, i90 i90Var, t00 t00Var, u20 u20Var) {
        this.f16552a = str;
        this.f16553b = cyVar;
        this.f16554c = cyVar;
        this.f16555d = fuVar;
        this.f16556e = i90Var;
        this.f16557f = xmVar;
        this.f16558g = xmVar;
        this.f16559h = t00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v30)) {
            return false;
        }
        v30 v30Var = (v30) obj;
        return sv2.b(this.f16552a, v30Var.f16552a) && this.f16557f.equals(v30Var.f16557f) && sv2.b(this.f16553b, v30Var.f16553b) && sv2.b(this.f16555d, v30Var.f16555d) && sv2.b(this.f16556e, v30Var.f16556e) && sv2.b(this.f16559h, v30Var.f16559h);
    }

    public final int hashCode() {
        int iHashCode = this.f16552a.hashCode() * 31;
        ew ewVar = this.f16553b;
        return (((((((iHashCode + (ewVar != null ? ewVar.hashCode() : 0)) * 31) + this.f16555d.hashCode()) * 31) + this.f16557f.hashCode()) * 31) + this.f16556e.hashCode()) * 31;
    }
}
