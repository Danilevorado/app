package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gr implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f8870g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f8864a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f8865b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f8866c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f8867d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f8868e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f8869f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f8871h = new JSONObject();

    private final void f() {
        if (this.f8868e == null) {
            return;
        }
        try {
            this.f8871h = new JSONObject((String) nr.a(new z33() { // from class: com.google.android.gms.internal.ads.er
                @Override // com.google.android.gms.internal.ads.z33
                public final Object a() {
                    return this.f7937m.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final Object b(final zq zqVar) {
        if (!this.f8865b.block(5000L)) {
            synchronized (this.f8864a) {
                if (!this.f8867d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f8866c || this.f8868e == null) {
            synchronized (this.f8864a) {
                if (this.f8866c && this.f8868e != null) {
                }
                return zqVar.m();
            }
        }
        if (zqVar.e() != 2) {
            return (zqVar.e() == 1 && this.f8871h.has(zqVar.n())) ? zqVar.a(this.f8871h) : nr.a(new z33() { // from class: com.google.android.gms.internal.ads.dr
                @Override // com.google.android.gms.internal.ads.z33
                public final Object a() {
                    return this.f7476m.c(zqVar);
                }
            });
        }
        Bundle bundle = this.f8869f;
        return bundle == null ? zqVar.m() : zqVar.b(bundle);
    }

    final /* synthetic */ Object c(zq zqVar) {
        return zqVar.c(this.f8868e);
    }

    final /* synthetic */ String d() {
        return this.f8868e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f8866c) {
            return;
        }
        synchronized (this.f8864a) {
            if (this.f8866c) {
                return;
            }
            if (!this.f8867d) {
                this.f8867d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f8870g = applicationContext;
            try {
                this.f8869f = k4.c.a(applicationContext).c(this.f8870g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context contextD = b4.i.d(context);
                if (contextD != null || (contextD = context.getApplicationContext()) != null) {
                    context = contextD;
                }
                if (context == null) {
                    return;
                }
                k3.w.b();
                SharedPreferences sharedPreferencesA = br.a(context);
                this.f8868e = sharedPreferencesA;
                if (sharedPreferencesA != null) {
                    sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
                }
                vt.c(new fr(this));
                f();
                this.f8866c = true;
            } finally {
                this.f8867d = false;
                this.f8865b.open();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
