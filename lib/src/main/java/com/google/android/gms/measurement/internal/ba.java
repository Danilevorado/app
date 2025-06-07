package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private final w4 f19804a;

    public ba(w4 w4Var) {
        this.f19804a = w4Var;
    }

    final void a(String str, Bundle bundle) {
        String string;
        this.f19804a.B().f();
        if (this.f19804a.m()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f19804a.F().f19938u.b(string);
        this.f19804a.F().f19939v.b(this.f19804a.d().a());
    }

    final void b() {
        this.f19804a.B().f();
        if (d()) {
            if (e()) {
                this.f19804a.F().f19938u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f19804a.I().s("auto", "_cmpx", bundle);
            } else {
                String strA = this.f19804a.F().f19938u.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f19804a.b().r().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f19804a.F().f19939v.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    Object obj = pair.first;
                    this.f19804a.I().s(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f19804a.F().f19938u.b(null);
            }
            this.f19804a.F().f19939v.b(0L);
        }
    }

    final void c() {
        if (d() && e()) {
            this.f19804a.F().f19938u.b(null);
        }
    }

    final boolean d() {
        return this.f19804a.F().f19939v.a() > 0;
    }

    final boolean e() {
        return d() && this.f19804a.d().a() - this.f19804a.F().f19939v.a() > this.f19804a.y().p(null, i3.S);
    }
}
