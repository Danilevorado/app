package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class os {

    /* renamed from: a, reason: collision with root package name */
    private final String f13371a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13372b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13373c;

    protected os(String str, Object obj, int i10) {
        this.f13371a = str;
        this.f13372b = obj;
        this.f13373c = i10;
    }

    public static os a(String str, double d10) {
        return new os(str, Double.valueOf(d10), 3);
    }

    public static os b(String str, long j10) {
        return new os(str, Long.valueOf(j10), 2);
    }

    public static os c(String str, String str2) {
        return new os(str, str2, 4);
    }

    public static os d(String str, boolean z10) {
        return new os(str, Boolean.valueOf(z10), 1);
    }

    public final Object e() {
        tt ttVarA = vt.a();
        if (ttVarA != null) {
            int i10 = this.f13373c - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? ttVarA.b(this.f13371a, (String) this.f13372b) : ttVarA.a(this.f13371a, ((Double) this.f13372b).doubleValue()) : ttVarA.c(this.f13371a, ((Long) this.f13372b).longValue()) : ttVarA.d(this.f13371a, ((Boolean) this.f13372b).booleanValue());
        }
        if (vt.b() != null) {
            vt.b().a();
        }
        return this.f13372b;
    }
}
