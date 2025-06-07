package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zq {

    /* renamed from: a, reason: collision with root package name */
    private final int f18695a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18696b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18697c;

    /* synthetic */ zq(int i10, String str, Object obj, yq yqVar) {
        this.f18695a = i10;
        this.f18696b = str;
        this.f18697c = obj;
        k3.w.a().d(this);
    }

    public static zq f(int i10, String str, float f5) {
        return new wq(1, str, Float.valueOf(f5));
    }

    public static zq g(int i10, String str, int i11) {
        return new uq(1, str, Integer.valueOf(i11));
    }

    public static zq h(int i10, String str, long j10) {
        return new vq(1, str, Long.valueOf(j10));
    }

    public static zq i(int i10, String str, Boolean bool) {
        return new tq(i10, str, bool);
    }

    public static zq j(int i10, String str, String str2) {
        return new xq(1, str, str2);
    }

    public static zq k(int i10, String str) {
        zq zqVarJ = j(1, "gads:sdk_core_constants:experiment_id", null);
        k3.w.a().c(zqVarJ);
        return zqVarJ;
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    protected abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.f18695a;
    }

    public final Object l() {
        return k3.w.c().b(this);
    }

    public final Object m() {
        return this.f18697c;
    }

    public final String n() {
        return this.f18696b;
    }
}
