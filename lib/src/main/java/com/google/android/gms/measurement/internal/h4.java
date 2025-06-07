package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.wb;

/* loaded from: classes.dex */
final class h4 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.t0 f19968m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f19969n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ i4 f19970o;

    h4(i4 i4Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.f19970o = i4Var;
        this.f19968m = t0Var;
        this.f19969n = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleH0;
        q3 q3VarP;
        String str;
        i4 i4Var = this.f19970o;
        j4 j4Var = i4Var.f20056n;
        String str2 = i4Var.f20055m;
        com.google.android.gms.internal.measurement.t0 t0Var = this.f19968m;
        ServiceConnection serviceConnection = this.f19969n;
        j4Var.f20086a.B().f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str2);
        try {
            bundleH0 = t0Var.h0(bundle);
        } catch (Exception e5) {
            j4Var.f20086a.b().p().b("Exception occurred while retrieving the Install Referrer", e5.getMessage());
        }
        if (bundleH0 == null) {
            j4Var.f20086a.b().p().a("Install Referrer Service returned a null response");
            bundleH0 = null;
        }
        j4Var.f20086a.B().f();
        w4.r();
        if (bundleH0 != null) {
            long j10 = bundleH0.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                q3VarP = j4Var.f20086a.b().u();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundleH0.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    q3VarP = j4Var.f20086a.b().p();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    j4Var.f20086a.b().t().b("InstallReferrer API result", string);
                    u9 u9VarN = j4Var.f20086a.N();
                    Uri uri = Uri.parse("?".concat(string));
                    wb.c();
                    boolean zA = j4Var.f20086a.y().A(null, i3.f20030n0);
                    wb.c();
                    Bundle bundleT0 = u9VarN.t0(uri, zA, j4Var.f20086a.y().A(null, i3.f20036q0));
                    if (bundleT0 == null) {
                        q3VarP = j4Var.f20086a.b().p();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = bundleT0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundleH0.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                q3VarP = j4Var.f20086a.b().p();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                bundleT0.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == j4Var.f20086a.F().f19923f.a()) {
                            j4Var.f20086a.b().t().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (j4Var.f20086a.m()) {
                            j4Var.f20086a.F().f19923f.b(j10);
                            j4Var.f20086a.b().t().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleT0.putString("_cis", "referrer API v2");
                            j4Var.f20086a.I().r("auto", "_cmp", bundleT0, str2);
                        }
                    }
                }
            }
            q3VarP.a(str);
        }
        h4.a.b().c(j4Var.f20086a.a(), serviceConnection);
    }
}
