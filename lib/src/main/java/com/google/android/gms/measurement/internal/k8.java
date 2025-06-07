package com.google.android.gms.measurement.internal;

import android.util.Pair;
import h3.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class k8 extends c9 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f20132d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f20133e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f20134f;

    /* renamed from: g, reason: collision with root package name */
    public final d4 f20135g;

    /* renamed from: h, reason: collision with root package name */
    public final d4 f20136h;

    /* renamed from: i, reason: collision with root package name */
    public final d4 f20137i;

    k8(n9 n9Var) {
        super(n9Var);
        this.f20132d = new HashMap();
        g4 g4VarF = this.f20269a.F();
        g4VarF.getClass();
        this.f20133e = new d4(g4VarF, "last_delete_stale", 0L);
        g4 g4VarF2 = this.f20269a.F();
        g4VarF2.getClass();
        this.f20134f = new d4(g4VarF2, "backoff", 0L);
        g4 g4VarF3 = this.f20269a.F();
        g4VarF3.getClass();
        this.f20135g = new d4(g4VarF3, "last_upload", 0L);
        g4 g4VarF4 = this.f20269a.F();
        g4VarF4.getClass();
        this.f20136h = new d4(g4VarF4, "last_upload_attempt", 0L);
        g4 g4VarF5 = this.f20269a.F();
        g4VarF5.getClass();
        this.f20137i = new d4(g4VarF5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    final Pair k(String str) {
        i8 i8Var;
        a.C0142a c0142aA;
        f();
        long jB = this.f20269a.d().b();
        i8 i8Var2 = (i8) this.f20132d.get(str);
        if (i8Var2 != null && jB < i8Var2.f20073c) {
            return new Pair(i8Var2.f20071a, Boolean.valueOf(i8Var2.f20072b));
        }
        h3.a.d(true);
        long jP = jB + this.f20269a.y().p(str, i3.f20007c);
        try {
            c0142aA = h3.a.a(this.f20269a.a());
        } catch (Exception e5) {
            this.f20269a.b().o().b("Unable to get advertising id", e5);
            i8Var = new i8("", false, jP);
        }
        if (c0142aA == null) {
            return new Pair("", Boolean.FALSE);
        }
        String strA = c0142aA.a();
        i8Var = strA != null ? new i8(strA, c0142aA.b(), jP) : new i8("", c0142aA.b(), jP);
        this.f20132d.put(str, i8Var);
        h3.a.d(false);
        return new Pair(i8Var.f20071a, Boolean.valueOf(i8Var.f20072b));
    }

    final Pair l(String str, x4.b bVar) {
        return bVar.i(x4.a.AD_STORAGE) ? k(str) : new Pair("", Boolean.FALSE);
    }

    final String m(String str, boolean z10) throws NoSuchAlgorithmException {
        f();
        String str2 = (!this.f20269a.y().A(null, i3.f20026l0) || z10) ? (String) k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestR = u9.r();
        if (messageDigestR == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestR.digest(str2.getBytes())));
    }
}
