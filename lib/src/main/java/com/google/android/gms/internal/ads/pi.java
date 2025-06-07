package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pi extends ui {
    public pi(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", xcVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        this.f16345e.c0(3);
        boolean zBooleanValue = ((Boolean) this.f16346f.invoke(null, this.f16342b.b())).booleanValue();
        synchronized (this.f16345e) {
            if (zBooleanValue) {
                this.f16345e.c0(2);
            } else {
                this.f16345e.c0(1);
            }
        }
    }
}
