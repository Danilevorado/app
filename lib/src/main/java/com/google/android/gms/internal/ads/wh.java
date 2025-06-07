package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wh extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final long f17129i;

    public wh(dh dhVar, String str, String str2, xc xcVar, long j10, int i10, int i11) {
        super(dhVar, "GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", xcVar, i10, 25);
        this.f17129i = j10;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        long jLongValue = ((Long) this.f16346f.invoke(null, new Object[0])).longValue();
        synchronized (this.f16345e) {
            this.f16345e.v0(jLongValue);
            long j10 = this.f17129i;
            if (j10 != 0) {
                this.f16345e.O(jLongValue - j10);
                this.f16345e.P(this.f17129i);
            }
        }
    }
}
