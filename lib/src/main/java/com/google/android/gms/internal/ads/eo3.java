package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class eo3 {

    /* renamed from: a, reason: collision with root package name */
    private final xn3 f7925a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7926b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f7927c;

    /* synthetic */ eo3(xn3 xn3Var, List list, Integer num, do3 do3Var) {
        this.f7925a = xn3Var;
        this.f7926b = list;
        this.f7927c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eo3)) {
            return false;
        }
        eo3 eo3Var = (eo3) obj;
        if (this.f7925a.equals(eo3Var.f7925a) && this.f7926b.equals(eo3Var.f7926b)) {
            Integer num = this.f7927c;
            Integer num2 = eo3Var.f7927c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7925a, this.f7926b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f7925a, this.f7926b, this.f7927c);
    }
}
