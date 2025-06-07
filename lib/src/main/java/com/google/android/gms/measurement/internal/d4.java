package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19853a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19854b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19855c;

    /* renamed from: d, reason: collision with root package name */
    private long f19856d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g4 f19857e;

    public d4(g4 g4Var, String str, long j10) {
        this.f19857e = g4Var;
        e4.p.f(str);
        this.f19853a = str;
        this.f19854b = j10;
    }

    public final long a() {
        if (!this.f19855c) {
            this.f19855c = true;
            this.f19856d = this.f19857e.m().getLong(this.f19853a, this.f19854b);
        }
        return this.f19856d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f19857e.m().edit();
        editorEdit.putLong(this.f19853a, j10);
        editorEdit.apply();
        this.f19856d = j10;
    }
}
