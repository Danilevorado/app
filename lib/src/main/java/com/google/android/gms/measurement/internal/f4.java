package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19895a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19896b;

    /* renamed from: c, reason: collision with root package name */
    private String f19897c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g4 f19898d;

    public f4(g4 g4Var, String str, String str2) {
        this.f19898d = g4Var;
        e4.p.f(str);
        this.f19895a = str;
    }

    public final String a() {
        if (!this.f19896b) {
            this.f19896b = true;
            this.f19897c = this.f19898d.m().getString(this.f19895a, null);
        }
        return this.f19897c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f19898d.m().edit();
        editorEdit.putString(this.f19895a, str);
        editorEdit.apply();
        this.f19897c = str;
    }
}
