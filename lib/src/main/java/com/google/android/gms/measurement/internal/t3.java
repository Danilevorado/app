package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20411b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20412c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f20413d;

    public t3(String str, String str2, Bundle bundle, long j10) {
        this.f20410a = str;
        this.f20411b = str2;
        this.f20413d = bundle;
        this.f20412c = j10;
    }

    public static t3 b(v vVar) {
        return new t3(vVar.f20460m, vVar.f20462o, vVar.f20461n.v(), vVar.f20463p);
    }

    public final v a() {
        return new v(this.f20410a, new t(new Bundle(this.f20413d)), this.f20411b, this.f20412c);
    }

    public final String toString() {
        return "origin=" + this.f20411b + ",name=" + this.f20410a + ",params=" + this.f20413d.toString();
    }
}
