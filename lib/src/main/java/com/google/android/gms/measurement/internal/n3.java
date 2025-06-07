package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f20193b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f20194c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f20195d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final x4.g f20196a;

    public n3(x4.g gVar) {
        this.f20196a = gVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        e4.p.l(strArr);
        e4.p.l(strArr2);
        e4.p.l(atomicReference);
        e4.p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strB);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f20196a.a()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(e(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String c(v vVar) {
        if (!this.f20196a.a()) {
            return vVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(vVar.f20462o);
        sb2.append(",name=");
        sb2.append(d(vVar.f20460m));
        sb2.append(",params=");
        t tVar = vVar.f20461n;
        sb2.append(tVar == null ? null : !this.f20196a.a() ? tVar.toString() : b(tVar.v()));
        return sb2.toString();
    }

    protected final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20196a.a() ? str : g(str, x4.q.f28268c, x4.q.f28266a, f20193b);
    }

    protected final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f20196a.a() ? str : g(str, x4.r.f28271b, x4.r.f28270a, f20194c);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f20196a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, x4.s.f28275b, x4.s.f28274a, f20195d);
        }
        return "experiment_id(" + str + ")";
    }
}
