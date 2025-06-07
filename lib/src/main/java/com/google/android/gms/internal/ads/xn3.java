package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class xn3 {

    /* renamed from: b, reason: collision with root package name */
    public static final xn3 f17644b = new vn3().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f17645a;

    public final Map a() {
        return this.f17645a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xn3) {
            return this.f17645a.equals(((xn3) obj).f17645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17645a.hashCode();
    }

    public final String toString() {
        return this.f17645a.toString();
    }
}
