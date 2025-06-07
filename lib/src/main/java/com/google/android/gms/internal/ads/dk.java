package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    private final int f7345a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7346b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7347c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7348d;

    /* renamed from: e, reason: collision with root package name */
    private final sk f7349e;

    /* renamed from: f, reason: collision with root package name */
    private final bl f7350f;

    /* renamed from: n, reason: collision with root package name */
    private int f7358n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f7351g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f7352h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f7353i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f7354j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f7355k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f7356l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f7357m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f7359o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f7360p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f7361q = "";

    public dk(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f7345a = i10;
        this.f7346b = i11;
        this.f7347c = i12;
        this.f7348d = z10;
        this.f7349e = new sk(i13);
        this.f7350f = new bl(i14, i15, i16);
    }

    private final void p(String str, boolean z10, float f5, float f10, float f11, float f12) {
        if (str != null) {
            if (str.length() < this.f7347c) {
                return;
            }
            synchronized (this.f7351g) {
                this.f7352h.add(str);
                this.f7355k += str.length();
                if (z10) {
                    this.f7353i.add(str);
                    this.f7354j.add(new ok(f5, f10, f11, f12, this.f7353i.size() - 1));
                }
            }
        }
    }

    private static final String q(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    final int a(int i10, int i11) {
        return this.f7348d ? this.f7346b : (i10 * this.f7345a) + (i11 * this.f7346b);
    }

    public final int b() {
        return this.f7358n;
    }

    final int c() {
        return this.f7355k;
    }

    public final String d() {
        return this.f7359o;
    }

    public final String e() {
        return this.f7360p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((dk) obj).f7359o;
        return str != null && str.equals(this.f7359o);
    }

    public final String f() {
        return this.f7361q;
    }

    public final void g() {
        synchronized (this.f7351g) {
            this.f7357m--;
        }
    }

    public final void h() {
        synchronized (this.f7351g) {
            this.f7357m++;
        }
    }

    public final int hashCode() {
        return this.f7359o.hashCode();
    }

    public final void i() {
        synchronized (this.f7351g) {
            this.f7358n -= 100;
        }
    }

    public final void j(int i10) {
        this.f7356l = i10;
    }

    public final void k(String str, boolean z10, float f5, float f10, float f11, float f12) {
        p(str, z10, f5, f10, f11, f12);
    }

    public final void l(String str, boolean z10, float f5, float f10, float f11, float f12) {
        p(str, z10, f5, f10, f11, f12);
        synchronized (this.f7351g) {
            if (this.f7357m < 0) {
                ze0.b("ActivityContent: negative number of WebViews.");
            }
            m();
        }
    }

    public final void m() {
        synchronized (this.f7351g) {
            int iA = a(this.f7355k, this.f7356l);
            if (iA > this.f7358n) {
                this.f7358n = iA;
                if (!j3.t.q().h().V()) {
                    this.f7359o = this.f7349e.a(this.f7352h);
                    this.f7360p = this.f7349e.a(this.f7353i);
                }
                if (!j3.t.q().h().G()) {
                    this.f7361q = this.f7350f.a(this.f7353i, this.f7354j);
                }
            }
        }
    }

    public final void n() {
        synchronized (this.f7351g) {
            int iA = a(this.f7355k, this.f7356l);
            if (iA > this.f7358n) {
                this.f7358n = iA;
            }
        }
    }

    public final boolean o() {
        boolean z10;
        synchronized (this.f7351g) {
            z10 = this.f7357m == 0;
        }
        return z10;
    }

    public final String toString() {
        return "ActivityContent fetchId: " + this.f7356l + " score:" + this.f7358n + " total_length:" + this.f7355k + "\n text: " + q(this.f7352h, 100) + "\n viewableText" + q(this.f7353i, 100) + "\n signture: " + this.f7359o + "\n viewableSignture: " + this.f7360p + "\n viewableSignatureForVertical: " + this.f7361q;
    }
}
