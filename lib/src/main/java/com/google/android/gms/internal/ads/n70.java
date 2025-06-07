package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n70 {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f12447a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f12448b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f12449c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f12450d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f12451e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f12452f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f12453g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f12454h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f12455i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f12456j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f12457k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f12458l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f12459m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f12460n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f12461o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f12462p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f12463q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f12464r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f12465s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f12466t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f12467u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f12468v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f12469w;

    public n70() {
    }

    /* synthetic */ n70(i90 i90Var, s60 s60Var) {
        this.f12447a = i90Var.f9628a;
        this.f12448b = i90Var.f9629b;
        this.f12449c = i90Var.f9630c;
        this.f12450d = i90Var.f9631d;
        this.f12451e = i90Var.f9632e;
        this.f12452f = i90Var.f9633f;
        this.f12453g = i90Var.f9634g;
        this.f12454h = i90Var.f9635h;
        this.f12455i = i90Var.f9636i;
        this.f12456j = i90Var.f9637j;
        this.f12457k = i90Var.f9638k;
        this.f12458l = i90Var.f9640m;
        this.f12459m = i90Var.f9641n;
        this.f12460n = i90Var.f9642o;
        this.f12461o = i90Var.f9643p;
        this.f12462p = i90Var.f9644q;
        this.f12463q = i90Var.f9645r;
        this.f12464r = i90Var.f9646s;
        this.f12465s = i90Var.f9647t;
        this.f12466t = i90Var.f9648u;
        this.f12467u = i90Var.f9649v;
        this.f12468v = i90Var.f9650w;
        this.f12469w = i90Var.f9651x;
    }

    public final n70 A(CharSequence charSequence) {
        this.f12467u = charSequence;
        return this;
    }

    public final n70 B(Integer num) {
        this.f12460n = num;
        return this;
    }

    public final n70 C(Integer num) {
        this.f12459m = num;
        return this;
    }

    public final n70 D(Integer num) {
        this.f12458l = num;
        return this;
    }

    public final n70 E(Integer num) {
        this.f12463q = num;
        return this;
    }

    public final n70 F(Integer num) {
        this.f12462p = num;
        return this;
    }

    public final n70 G(Integer num) {
        this.f12461o = num;
        return this;
    }

    public final n70 H(CharSequence charSequence) {
        this.f12468v = charSequence;
        return this;
    }

    public final n70 I(CharSequence charSequence) {
        this.f12447a = charSequence;
        return this;
    }

    public final n70 J(Integer num) {
        this.f12455i = num;
        return this;
    }

    public final n70 K(Integer num) {
        this.f12454h = num;
        return this;
    }

    public final n70 L(CharSequence charSequence) {
        this.f12464r = charSequence;
        return this;
    }

    public final i90 M() {
        return new i90(this);
    }

    public final n70 s(byte[] bArr, int i10) {
        if (this.f12452f == null || sv2.b(Integer.valueOf(i10), 3) || !sv2.b(this.f12453g, 3)) {
            this.f12452f = (byte[]) bArr.clone();
            this.f12453g = Integer.valueOf(i10);
        }
        return this;
    }

    public final n70 t(i90 i90Var) {
        if (i90Var == null) {
            return this;
        }
        CharSequence charSequence = i90Var.f9628a;
        if (charSequence != null) {
            this.f12447a = charSequence;
        }
        CharSequence charSequence2 = i90Var.f9629b;
        if (charSequence2 != null) {
            this.f12448b = charSequence2;
        }
        CharSequence charSequence3 = i90Var.f9630c;
        if (charSequence3 != null) {
            this.f12449c = charSequence3;
        }
        CharSequence charSequence4 = i90Var.f9631d;
        if (charSequence4 != null) {
            this.f12450d = charSequence4;
        }
        CharSequence charSequence5 = i90Var.f9632e;
        if (charSequence5 != null) {
            this.f12451e = charSequence5;
        }
        byte[] bArr = i90Var.f9633f;
        if (bArr != null) {
            Integer num = i90Var.f9634g;
            this.f12452f = (byte[]) bArr.clone();
            this.f12453g = num;
        }
        Integer num2 = i90Var.f9635h;
        if (num2 != null) {
            this.f12454h = num2;
        }
        Integer num3 = i90Var.f9636i;
        if (num3 != null) {
            this.f12455i = num3;
        }
        Integer num4 = i90Var.f9637j;
        if (num4 != null) {
            this.f12456j = num4;
        }
        Boolean bool = i90Var.f9638k;
        if (bool != null) {
            this.f12457k = bool;
        }
        Integer num5 = i90Var.f9639l;
        if (num5 != null) {
            this.f12458l = num5;
        }
        Integer num6 = i90Var.f9640m;
        if (num6 != null) {
            this.f12458l = num6;
        }
        Integer num7 = i90Var.f9641n;
        if (num7 != null) {
            this.f12459m = num7;
        }
        Integer num8 = i90Var.f9642o;
        if (num8 != null) {
            this.f12460n = num8;
        }
        Integer num9 = i90Var.f9643p;
        if (num9 != null) {
            this.f12461o = num9;
        }
        Integer num10 = i90Var.f9644q;
        if (num10 != null) {
            this.f12462p = num10;
        }
        Integer num11 = i90Var.f9645r;
        if (num11 != null) {
            this.f12463q = num11;
        }
        CharSequence charSequence6 = i90Var.f9646s;
        if (charSequence6 != null) {
            this.f12464r = charSequence6;
        }
        CharSequence charSequence7 = i90Var.f9647t;
        if (charSequence7 != null) {
            this.f12465s = charSequence7;
        }
        CharSequence charSequence8 = i90Var.f9648u;
        if (charSequence8 != null) {
            this.f12466t = charSequence8;
        }
        CharSequence charSequence9 = i90Var.f9649v;
        if (charSequence9 != null) {
            this.f12467u = charSequence9;
        }
        CharSequence charSequence10 = i90Var.f9650w;
        if (charSequence10 != null) {
            this.f12468v = charSequence10;
        }
        Integer num12 = i90Var.f9651x;
        if (num12 != null) {
            this.f12469w = num12;
        }
        return this;
    }

    public final n70 u(CharSequence charSequence) {
        this.f12450d = charSequence;
        return this;
    }

    public final n70 v(CharSequence charSequence) {
        this.f12449c = charSequence;
        return this;
    }

    public final n70 w(CharSequence charSequence) {
        this.f12448b = charSequence;
        return this;
    }

    public final n70 x(CharSequence charSequence) {
        this.f12465s = charSequence;
        return this;
    }

    public final n70 y(CharSequence charSequence) {
        this.f12466t = charSequence;
        return this;
    }

    public final n70 z(CharSequence charSequence) {
        this.f12451e = charSequence;
        return this;
    }
}
