package androidx.appcompat.app;

/* loaded from: classes.dex */
class s {

    /* renamed from: d, reason: collision with root package name */
    private static s f612d;

    /* renamed from: a, reason: collision with root package name */
    public long f613a;

    /* renamed from: b, reason: collision with root package name */
    public long f614b;

    /* renamed from: c, reason: collision with root package name */
    public int f615c;

    s() {
    }

    static s b() {
        if (f612d == null) {
            f612d = new s();
        }
        return f612d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(dAsin))) / (Math.cos(d13) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f615c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f613a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f614b = jRound;
                if (jRound >= j10 || this.f613a <= j10) {
                    this.f615c = 1;
                    return;
                } else {
                    this.f615c = 0;
                    return;
                }
            }
            this.f615c = 0;
        }
        this.f613a = -1L;
        this.f614b = -1L;
    }
}
