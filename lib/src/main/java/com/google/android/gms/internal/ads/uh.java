package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uh extends ui {
    public uh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", xcVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        this.f16345e.o0(-1L);
        this.f16345e.n0(-1L);
        int[] iArr = (int[]) this.f16346f.invoke(null, this.f16342b.b());
        synchronized (this.f16345e) {
            this.f16345e.o0(iArr[0]);
            this.f16345e.n0(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.f16345e.m0(i10);
            }
        }
    }
}
