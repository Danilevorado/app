package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ni extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final lh f12644i;

    /* renamed from: j, reason: collision with root package name */
    private long f12645j;

    public ni(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, lh lhVar) {
        super(dhVar, "xg6GNdV7fYR9czDPsYCpiIl0/69vO40WnrUnsYSb5exMDfWVVhFT+7O8xMnCz7QV", "mckfj+6L7YQAG+Kc7UoytYIs9AbnOm5Xq8IrT+DQQ5M=", xcVar, i10, 53);
        this.f12644i = lhVar;
        if (lhVar != null) {
            this.f12645j = lhVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (this.f12644i != null) {
            this.f16345e.K(((Long) this.f16346f.invoke(null, Long.valueOf(this.f12645j))).longValue());
        }
    }
}
