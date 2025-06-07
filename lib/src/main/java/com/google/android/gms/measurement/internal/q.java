package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    final String f20276a;

    /* renamed from: b, reason: collision with root package name */
    final String f20277b;

    /* renamed from: c, reason: collision with root package name */
    final String f20278c;

    /* renamed from: d, reason: collision with root package name */
    final long f20279d;

    /* renamed from: e, reason: collision with root package name */
    final long f20280e;

    /* renamed from: f, reason: collision with root package name */
    final t f20281f;

    q(w4 w4Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        t tVar;
        e4.p.f(str2);
        e4.p.f(str3);
        this.f20276a = str2;
        this.f20277b = str3;
        this.f20278c = true == TextUtils.isEmpty(str) ? null : str;
        this.f20279d = j10;
        this.f20280e = j11;
        if (j11 != 0 && j11 > j10) {
            w4Var.b().u().b("Event created with reverse previous/current timestamps. appId", s3.y(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w4Var.b().p().a("Param name can't be null");
                } else {
                    Object objM = w4Var.N().m(next, bundle2.get(next));
                    if (objM == null) {
                        w4Var.b().u().b("Param value can't be null", w4Var.D().e(next));
                    } else {
                        w4Var.N().C(bundle2, next, objM);
                    }
                }
                it.remove();
            }
            tVar = new t(bundle2);
        }
        this.f20281f = tVar;
    }

    private q(w4 w4Var, String str, String str2, String str3, long j10, long j11, t tVar) {
        e4.p.f(str2);
        e4.p.f(str3);
        e4.p.l(tVar);
        this.f20276a = str2;
        this.f20277b = str3;
        this.f20278c = true == TextUtils.isEmpty(str) ? null : str;
        this.f20279d = j10;
        this.f20280e = j11;
        if (j11 != 0 && j11 > j10) {
            w4Var.b().u().c("Event created with reverse previous/current timestamps. appId, name", s3.y(str2), s3.y(str3));
        }
        this.f20281f = tVar;
    }

    final q a(w4 w4Var, long j10) {
        return new q(w4Var, this.f20278c, this.f20276a, this.f20277b, this.f20279d, j10, this.f20281f);
    }

    public final String toString() {
        return "Event{appId='" + this.f20276a + "', name='" + this.f20277b + "', params=" + this.f20281f.toString() + "}";
    }
}
