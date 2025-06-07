package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class id0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f9689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f9690b;

    public id0(jd0 jd0Var, String str) {
        this.f9690b = jd0Var;
        this.f9689a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f9690b) {
            for (hd0 hd0Var : this.f9690b.f10428b) {
                hd0Var.f9101a.b(hd0Var.f9102b, sharedPreferences, this.f9689a, str);
            }
        }
    }
}
