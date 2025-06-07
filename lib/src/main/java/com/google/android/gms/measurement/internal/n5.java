package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.id;

/* loaded from: classes.dex */
final class n5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f20198m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20199n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20200o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f20201p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ o5 f20202q;

    n5(o5 o5Var, String str, String str2, String str3, long j10) {
        this.f20202q = o5Var;
        this.f20198m = str;
        this.f20199n = str2;
        this.f20200o = str3;
        this.f20201p = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id.c();
        if (this.f20202q.f20244m.U().A(null, i3.f20028m0)) {
            String str = this.f20198m;
            if (str == null) {
                this.f20202q.f20244m.u(this.f20199n, null);
                return;
            } else {
                this.f20202q.f20244m.u(this.f20199n, new a7(this.f20200o, str, this.f20201p));
                return;
            }
        }
        String str2 = this.f20198m;
        if (str2 == null) {
            this.f20202q.f20244m.c0().K().G(this.f20199n, null);
        } else {
            this.f20202q.f20244m.c0().K().G(this.f20199n, new a7(this.f20200o, str2, this.f20201p));
        }
    }
}
