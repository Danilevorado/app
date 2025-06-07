package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v34 {

    /* renamed from: j, reason: collision with root package name */
    public static final v34 f16568j = new v34(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final v34 f16569k = new v34(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final v34 f16570l = new v34(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final v34 f16571m = new v34(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f16572a;

    /* renamed from: b, reason: collision with root package name */
    public final double f16573b;

    /* renamed from: c, reason: collision with root package name */
    public final double f16574c;

    /* renamed from: d, reason: collision with root package name */
    public final double f16575d;

    /* renamed from: e, reason: collision with root package name */
    public final double f16576e;

    /* renamed from: f, reason: collision with root package name */
    public final double f16577f;

    /* renamed from: g, reason: collision with root package name */
    public final double f16578g;

    /* renamed from: h, reason: collision with root package name */
    public final double f16579h;

    /* renamed from: i, reason: collision with root package name */
    public final double f16580i;

    public v34(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f16572a = d14;
        this.f16573b = d15;
        this.f16574c = d16;
        this.f16575d = d10;
        this.f16576e = d11;
        this.f16577f = d12;
        this.f16578g = d13;
        this.f16579h = d17;
        this.f16580i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v34.class != obj.getClass()) {
            return false;
        }
        v34 v34Var = (v34) obj;
        return Double.compare(v34Var.f16575d, this.f16575d) == 0 && Double.compare(v34Var.f16576e, this.f16576e) == 0 && Double.compare(v34Var.f16577f, this.f16577f) == 0 && Double.compare(v34Var.f16578g, this.f16578g) == 0 && Double.compare(v34Var.f16579h, this.f16579h) == 0 && Double.compare(v34Var.f16580i, this.f16580i) == 0 && Double.compare(v34Var.f16572a, this.f16572a) == 0 && Double.compare(v34Var.f16573b, this.f16573b) == 0 && Double.compare(v34Var.f16574c, this.f16574c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f16572a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f16573b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f16574c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f16575d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f16576e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f16577f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f16578g);
        long j16 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f16579h);
        long j17 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f16580i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) j16)) * 31) + ((int) j17)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f16568j)) {
            return "Rotate 0°";
        }
        if (equals(f16569k)) {
            return "Rotate 90°";
        }
        if (equals(f16570l)) {
            return "Rotate 180°";
        }
        if (equals(f16571m)) {
            return "Rotate 270°";
        }
        double d10 = this.f16572a;
        double d11 = this.f16573b;
        double d12 = this.f16574c;
        double d13 = this.f16575d;
        double d14 = this.f16576e;
        double d15 = this.f16577f;
        double d16 = this.f16578g;
        double d17 = this.f16579h;
        double d18 = this.f16580i;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d10);
        sb2.append(", v=");
        sb2.append(d11);
        sb2.append(", w=");
        sb2.append(d12);
        sb2.append(", a=");
        sb2.append(d13);
        sb2.append(", b=");
        sb2.append(d14);
        sb2.append(", c=");
        sb2.append(d15);
        sb2.append(", d=");
        sb2.append(d16);
        sb2.append(", tx=");
        sb2.append(d17);
        sb2.append(", ty=");
        sb2.append(d18);
        sb2.append("}");
        return sb2.toString();
    }
}
