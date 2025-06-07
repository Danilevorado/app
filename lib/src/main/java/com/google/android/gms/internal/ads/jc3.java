package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jc3 implements s43 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10422a;

    /* renamed from: b, reason: collision with root package name */
    private final s43 f10423b;

    public jc3(Context context) {
        le3 le3Var = new le3();
        this.f10422a = context.getApplicationContext();
        this.f10423b = le3Var;
    }

    @Override // com.google.android.gms.internal.ads.s43
    public final /* bridge */ /* synthetic */ t53 a() {
        return new kd3(this.f10422a, ((le3) this.f10423b).a());
    }
}
