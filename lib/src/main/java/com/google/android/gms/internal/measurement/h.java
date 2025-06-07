package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements q {

    /* renamed from: m, reason: collision with root package name */
    private final q f18967m;

    /* renamed from: n, reason: collision with root package name */
    private final String f18968n;

    public h(String str) {
        this.f18967m = q.f19193b;
        this.f18968n = str;
    }

    public h(String str, q qVar) {
        this.f18967m = qVar;
        this.f18968n = str;
    }

    public final q a() {
        return this.f18967m;
    }

    public final String b() {
        return this.f18968n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18968n.equals(hVar.f18968n) && this.f18967m.equals(hVar.f18967m);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return new h(this.f18968n, this.f18967m.f());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f18968n.hashCode() * 31) + this.f18967m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return null;
    }
}
