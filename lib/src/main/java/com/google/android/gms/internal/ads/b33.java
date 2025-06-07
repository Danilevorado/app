package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b33 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6326a;

    /* renamed from: b, reason: collision with root package name */
    private final z23 f6327b;

    /* renamed from: c, reason: collision with root package name */
    private z23 f6328c;

    /* synthetic */ b33(String str, a33 a33Var) {
        z23 z23Var = new z23(null);
        this.f6327b = z23Var;
        this.f6328c = z23Var;
        Objects.requireNonNull(str);
        this.f6326a = str;
    }

    public final b33 a(Object obj) {
        z23 z23Var = new z23(null);
        this.f6328c.f18389b = z23Var;
        this.f6328c = z23Var;
        z23Var.f18388a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f6326a);
        sb2.append('{');
        z23 z23Var = this.f6327b.f18389b;
        String str = "";
        while (z23Var != null) {
            Object obj = z23Var.f18388a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            z23Var = z23Var.f18389b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
