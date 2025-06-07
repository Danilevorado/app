package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class b92 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final k3.n4 f6393a;

    /* renamed from: b, reason: collision with root package name */
    private final ff0 f6394b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6395c;

    public b92(k3.n4 n4Var, ff0 ff0Var, boolean z10) {
        this.f6393a = n4Var;
        this.f6394b = ff0Var;
        this.f6395c = z10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.f6394b.f8254o >= ((Integer) k3.w.c().b(ir.R4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) k3.w.c().b(ir.S4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f6395c);
        }
        k3.n4 n4Var = this.f6393a;
        if (n4Var != null) {
            int i10 = n4Var.f24705m;
            if (i10 == 1) {
                str = "p";
            } else if (i10 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
