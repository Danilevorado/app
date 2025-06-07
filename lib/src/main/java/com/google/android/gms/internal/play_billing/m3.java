package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* loaded from: classes.dex */
final class m3 implements Map.Entry, Comparable {

    /* renamed from: m, reason: collision with root package name */
    private final Comparable f19592m;

    /* renamed from: n, reason: collision with root package name */
    private Object f19593n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ s3 f19594o;

    m3(s3 s3Var, Comparable comparable, Object obj) {
        this.f19594o = s3Var;
        this.f19592m = comparable;
        this.f19593n = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f19592m;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f19592m.compareTo(((m3) obj).f19592m);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return d(this.f19592m, entry.getKey()) && d(this.f19593n, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f19592m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19593n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f19592m;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f19593n;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f19594o.n();
        Object obj2 = this.f19593n;
        this.f19593n = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f19592m) + "=" + String.valueOf(this.f19593n);
    }
}
