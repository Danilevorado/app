package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
final class bh implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f6486m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ dh f6487n;

    bh(dh dhVar, int i10, boolean z10) {
        this.f6487n = dhVar;
        this.f6486m = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        vd vdVarA;
        dh dhVar = this.f6487n;
        if (this.f6486m > 0) {
            try {
                Thread.sleep(r1 * AdError.NETWORK_ERROR_CODE);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = dhVar.f7297a.getPackageManager().getPackageInfo(dhVar.f7297a.getPackageName(), 0);
            Context context = dhVar.f7297a;
            vdVarA = lx2.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            vdVarA = null;
        }
        this.f6487n.f7306j = vdVarA;
        if (this.f6486m < 4) {
            if (vdVarA != null && vdVarA.u0() && !vdVarA.J0().equals("0000000000000000000000000000000000000000000000000000000000000000") && vdVarA.v0() && vdVarA.H0().N() && vdVarA.H0().K() != -2) {
                return;
            }
            this.f6487n.o(this.f6486m + 1, true);
        }
    }
}
