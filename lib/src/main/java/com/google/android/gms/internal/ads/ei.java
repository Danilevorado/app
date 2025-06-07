package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ei extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final fg f7788i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7789j;

    /* renamed from: k, reason: collision with root package name */
    private final long f7790k;

    public ei(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, fg fgVar, long j10, long j11) {
        super(dhVar, "2wtcCTLoT7a0RzNv8L+mVKR+6NVfukO9BpKgsaOGTiHGeYqcI7vlZYOTUtiUYK5a", "PuuRKBgJ4ot1aOnWjIUdGlqyRoZ6ZOMOeX7ZmvGezGg=", xcVar, i10, 11);
        this.f7788i = fgVar;
        this.f7789j = j10;
        this.f7790k = j11;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        fg fgVar = this.f7788i;
        if (fgVar != null) {
            dg dgVar = new dg((String) this.f16346f.invoke(null, fgVar.b(), Long.valueOf(this.f7789j), Long.valueOf(this.f7790k)));
            synchronized (this.f16345e) {
                this.f16345e.B0(dgVar.f7285b.longValue());
                if (dgVar.f7286c.longValue() >= 0) {
                    this.f16345e.L(dgVar.f7286c.longValue());
                }
                if (dgVar.f7287d.longValue() >= 0) {
                    this.f16345e.h0(dgVar.f7287d.longValue());
                }
            }
        }
    }
}
