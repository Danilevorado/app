package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jw2 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f10730a;

    /* renamed from: b, reason: collision with root package name */
    private final rw2 f10731b;

    public jw2(rw2 rw2Var) {
        this.f10731b = rw2Var;
    }

    public final JSONObject a() {
        return this.f10730a;
    }

    public final void b() {
        this.f10731b.b(new tw2(this));
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f10731b.b(new uw2(this, hashSet, jSONObject, j10));
    }

    public final void d(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.f10731b.b(new vw2(this, hashSet, jSONObject, j10));
    }

    public final void e(JSONObject jSONObject) {
        this.f10730a = jSONObject;
    }
}
