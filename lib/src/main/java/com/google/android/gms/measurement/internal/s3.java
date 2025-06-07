package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class s3 extends q5 {

    /* renamed from: c, reason: collision with root package name */
    private char f20350c;

    /* renamed from: d, reason: collision with root package name */
    private long f20351d;

    /* renamed from: e, reason: collision with root package name */
    private String f20352e;

    /* renamed from: f, reason: collision with root package name */
    private final q3 f20353f;

    /* renamed from: g, reason: collision with root package name */
    private final q3 f20354g;

    /* renamed from: h, reason: collision with root package name */
    private final q3 f20355h;

    /* renamed from: i, reason: collision with root package name */
    private final q3 f20356i;

    /* renamed from: j, reason: collision with root package name */
    private final q3 f20357j;

    /* renamed from: k, reason: collision with root package name */
    private final q3 f20358k;

    /* renamed from: l, reason: collision with root package name */
    private final q3 f20359l;

    /* renamed from: m, reason: collision with root package name */
    private final q3 f20360m;

    /* renamed from: n, reason: collision with root package name */
    private final q3 f20361n;

    s3(w4 w4Var) {
        super(w4Var);
        this.f20350c = (char) 0;
        this.f20351d = -1L;
        this.f20353f = new q3(this, 6, false, false);
        this.f20354g = new q3(this, 6, true, false);
        this.f20355h = new q3(this, 6, false, true);
        this.f20356i = new q3(this, 5, false, false);
        this.f20357j = new q3(this, 5, true, false);
        this.f20358k = new q3(this, 5, false, true);
        this.f20359l = new q3(this, 4, false, false);
        this.f20360m = new q3(this, 3, false, false);
        this.f20361n = new q3(this, 2, false, false);
    }

    static String A(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof r3 ? ((r3) obj).f20334a : z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strG = G(w4.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(strG)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    private static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    protected static Object y(String str) {
        if (str == null) {
            return null;
        }
        return new r3(str);
    }

    static String z(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strA = A(z10, obj);
        String strA2 = A(z10, obj2);
        String strA3 = A(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb2.append(str2);
            sb2.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb2.append(str3);
            sb2.append(strA3);
        }
        return sb2.toString();
    }

    protected final String C() {
        String str;
        synchronized (this) {
            if (this.f20352e == null) {
                this.f20352e = this.f20269a.Q() != null ? this.f20269a.Q() : this.f20269a.y().u();
            }
            e4.p.l(this.f20352e);
            str = this.f20352e;
        }
        return str;
    }

    protected final void F(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(C(), i10)) {
            Log.println(i10, C(), z(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        e4.p.l(str);
        u4 u4VarG = this.f20269a.G();
        if (u4VarG == null) {
            Log.println(6, C(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!u4VarG.l()) {
                Log.println(6, C(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            u4VarG.y(new p3(this, i10, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.q5
    protected final boolean h() {
        return false;
    }

    public final q3 o() {
        return this.f20360m;
    }

    public final q3 p() {
        return this.f20353f;
    }

    public final q3 q() {
        return this.f20355h;
    }

    public final q3 r() {
        return this.f20354g;
    }

    public final q3 s() {
        return this.f20359l;
    }

    public final q3 t() {
        return this.f20361n;
    }

    public final q3 u() {
        return this.f20356i;
    }

    public final q3 v() {
        return this.f20358k;
    }

    public final q3 w() {
        return this.f20357j;
    }
}
