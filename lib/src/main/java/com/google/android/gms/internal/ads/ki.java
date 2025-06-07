package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ki extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final boolean f11071i;

    public ki(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", xcVar, i10, 61);
        this.f11071i = dhVar.s();
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        long jLongValue = ((Long) this.f16346f.invoke(null, this.f16342b.b(), Boolean.valueOf(this.f11071i))).longValue();
        synchronized (this.f16345e) {
            this.f16345e.z(jLongValue);
        }
    }
}
