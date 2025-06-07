package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class co3 {

    /* renamed from: a, reason: collision with root package name */
    private final qc3 f7006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7007b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7008c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7009d;

    /* synthetic */ co3(qc3 qc3Var, int i10, String str, String str2, bo3 bo3Var) {
        this.f7006a = qc3Var;
        this.f7007b = i10;
        this.f7008c = str;
        this.f7009d = str2;
    }

    public final int a() {
        return this.f7007b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof co3)) {
            return false;
        }
        co3 co3Var = (co3) obj;
        return this.f7006a == co3Var.f7006a && this.f7007b == co3Var.f7007b && this.f7008c.equals(co3Var.f7008c) && this.f7009d.equals(co3Var.f7009d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7006a, Integer.valueOf(this.f7007b), this.f7008c, this.f7009d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f7006a, Integer.valueOf(this.f7007b), this.f7008c, this.f7009d);
    }
}
