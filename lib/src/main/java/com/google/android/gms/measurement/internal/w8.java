package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.dc;
import com.google.android.gms.internal.measurement.ld;

/* loaded from: classes.dex */
final class w8 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x8 f20549a;

    w8(x8 x8Var) {
        this.f20549a = x8Var;
    }

    final void a() {
        this.f20549a.f();
        if (this.f20549a.f20269a.F().t(this.f20549a.f20269a.d().a())) {
            this.f20549a.f20269a.F().f19929l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f20549a.f20269a.b().t().a("Detected application was in foreground");
                c(this.f20549a.f20269a.d().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        this.f20549a.f();
        this.f20549a.q();
        if (this.f20549a.f20269a.F().t(j10)) {
            this.f20549a.f20269a.F().f19929l.a(true);
            ld.c();
            if (this.f20549a.f20269a.y().A(null, i3.B0)) {
                this.f20549a.f20269a.A().t();
            }
        }
        this.f20549a.f20269a.F().f19932o.b(j10);
        if (this.f20549a.f20269a.F().f19929l.b()) {
            c(j10, z10);
        }
    }

    final void c(long j10, boolean z10) {
        this.f20549a.f();
        if (this.f20549a.f20269a.m()) {
            this.f20549a.f20269a.F().f19932o.b(j10);
            this.f20549a.f20269a.b().t().b("Session started, time", Long.valueOf(this.f20549a.f20269a.d().b()));
            Long lValueOf = Long.valueOf(j10 / 1000);
            this.f20549a.f20269a.I().M("auto", "_sid", lValueOf, j10);
            this.f20549a.f20269a.F().f19929l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f20549a.f20269a.y().A(null, i3.f20006b0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f20549a.f20269a.I().t("auto", "_s", j10, bundle);
            dc.c();
            if (this.f20549a.f20269a.y().A(null, i3.f20012e0)) {
                String strA = this.f20549a.f20269a.F().f19937t.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f20549a.f20269a.I().t("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
