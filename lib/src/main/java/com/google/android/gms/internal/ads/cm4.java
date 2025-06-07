package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cm4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f6988c;

    /* renamed from: e, reason: collision with root package name */
    private int f6990e;

    /* renamed from: a, reason: collision with root package name */
    private am4 f6986a = new am4();

    /* renamed from: b, reason: collision with root package name */
    private am4 f6987b = new am4();

    /* renamed from: d, reason: collision with root package name */
    private long f6989d = -9223372036854775807L;

    public final float a() {
        if (this.f6986a.f()) {
            return (float) (1.0E9d / this.f6986a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.f6990e;
    }

    public final long c() {
        if (this.f6986a.f()) {
            return this.f6986a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f6986a.f()) {
            return this.f6986a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j10) {
        this.f6986a.c(j10);
        if (this.f6986a.f()) {
            this.f6988c = false;
        } else if (this.f6989d != -9223372036854775807L) {
            if (!this.f6988c || this.f6987b.e()) {
                this.f6987b.d();
                this.f6987b.c(this.f6989d);
            }
            this.f6988c = true;
            this.f6987b.c(j10);
        }
        if (this.f6988c && this.f6987b.f()) {
            am4 am4Var = this.f6986a;
            this.f6986a = this.f6987b;
            this.f6987b = am4Var;
            this.f6988c = false;
        }
        this.f6989d = j10;
        this.f6990e = this.f6986a.f() ? 0 : this.f6990e + 1;
    }

    public final void f() {
        this.f6986a.d();
        this.f6987b.d();
        this.f6988c = false;
        this.f6989d = -9223372036854775807L;
        this.f6990e = 0;
    }

    public final boolean g() {
        return this.f6986a.f();
    }
}
