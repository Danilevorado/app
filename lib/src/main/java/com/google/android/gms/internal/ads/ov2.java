package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class ov2 {

    /* renamed from: a, reason: collision with root package name */
    private final ww2 f13415a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13416b;

    /* renamed from: c, reason: collision with root package name */
    private final ev2 f13417c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13418d = "Ad overlay";

    public ov2(View view, ev2 ev2Var, String str) {
        this.f13415a = new ww2(view);
        this.f13416b = view.getClass().getCanonicalName();
        this.f13417c = ev2Var;
    }

    public final ev2 a() {
        return this.f13417c;
    }

    public final ww2 b() {
        return this.f13415a;
    }

    public final String c() {
        return this.f13418d;
    }

    public final String d() {
        return this.f13416b;
    }
}
