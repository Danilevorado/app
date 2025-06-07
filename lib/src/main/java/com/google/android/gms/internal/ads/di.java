package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class di extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final vg f7322i;

    public di(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, vg vgVar) {
        super(dhVar, "sGX187VmldVivMx8d2G9ijy8IexWLJjVBriaGlzwhpHKAK1AG3if6ICXfcjwXboZ", "IowIKykYnY6WZolnjAhl1KeEVDwldWZiaxuj9ry3exU=", xcVar, i10, 94);
        this.f7322i = vgVar;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        int iIntValue = ((Integer) this.f16346f.invoke(null, this.f7322i.a())).intValue();
        synchronized (this.f16345e) {
            this.f16345e.a0(ld.a(iIntValue));
        }
    }
}
