package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class vf4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16679a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16680b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16681c;

    public vf4(String str, boolean z10, boolean z11) {
        this.f16679a = str;
        this.f16680b = z10;
        this.f16681c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == vf4.class) {
            vf4 vf4Var = (vf4) obj;
            if (TextUtils.equals(this.f16679a, vf4Var.f16679a) && this.f16680b == vf4Var.f16680b && this.f16681c == vf4Var.f16681c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f16679a.hashCode() + 31;
        return (((iHashCode * 31) + (true != this.f16680b ? 1237 : 1231)) * 31) + (true == this.f16681c ? 1231 : 1237);
    }
}
