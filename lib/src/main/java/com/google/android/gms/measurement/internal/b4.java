package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19778a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19779b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19780c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g4 f19782e;

    public b4(g4 g4Var, String str, boolean z10) {
        this.f19782e = g4Var;
        e4.p.f(str);
        this.f19778a = str;
        this.f19779b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f19782e.m().edit();
        editorEdit.putBoolean(this.f19778a, z10);
        editorEdit.apply();
        this.f19781d = z10;
    }

    public final boolean b() {
        if (!this.f19780c) {
            this.f19780c = true;
            this.f19781d = this.f19782e.m().getBoolean(this.f19778a, this.f19779b);
        }
        return this.f19781d;
    }
}
