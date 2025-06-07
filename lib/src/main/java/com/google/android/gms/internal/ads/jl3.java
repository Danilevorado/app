package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class jl3 implements ll3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10571a;

    /* renamed from: b, reason: collision with root package name */
    private final cw3 f10572b;

    /* renamed from: c, reason: collision with root package name */
    private final ww3 f10573c;

    /* renamed from: d, reason: collision with root package name */
    private final ms3 f10574d;

    /* renamed from: e, reason: collision with root package name */
    private final ut3 f10575e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f10576f;

    private jl3(String str, ww3 ww3Var, ms3 ms3Var, ut3 ut3Var, Integer num) {
        this.f10571a = str;
        this.f10572b = vl3.a(str);
        this.f10573c = ww3Var;
        this.f10574d = ms3Var;
        this.f10575e = ut3Var;
        this.f10576f = num;
    }

    public static jl3 a(String str, ww3 ww3Var, ms3 ms3Var, ut3 ut3Var, Integer num) throws GeneralSecurityException {
        if (ut3Var == ut3.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new jl3(str, ww3Var, ms3Var, ut3Var, num);
    }

    public final ms3 b() {
        return this.f10574d;
    }

    public final ut3 c() {
        return this.f10575e;
    }

    public final ww3 d() {
        return this.f10573c;
    }

    public final Integer e() {
        return this.f10576f;
    }

    @Override // com.google.android.gms.internal.ads.ll3
    public final cw3 f() {
        return this.f10572b;
    }

    public final String g() {
        return this.f10571a;
    }
}
