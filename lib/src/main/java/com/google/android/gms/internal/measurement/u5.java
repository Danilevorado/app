package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class u5 extends r6 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19341a;

    /* renamed from: b, reason: collision with root package name */
    private final b7 f19342b;

    u5(Context context, b7 b7Var) {
        Objects.requireNonNull(context, "Null context");
        this.f19341a = context;
        this.f19342b = b7Var;
    }

    @Override // com.google.android.gms.internal.measurement.r6
    final Context a() {
        return this.f19341a;
    }

    @Override // com.google.android.gms.internal.measurement.r6
    final b7 b() {
        return this.f19342b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r6) {
            r6 r6Var = (r6) obj;
            if (this.f19341a.equals(r6Var.a())) {
                b7 b7Var = this.f19342b;
                b7 b7VarB = r6Var.b();
                if (b7Var != null ? b7Var.equals(b7VarB) : b7VarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f19341a.hashCode() ^ 1000003) * 1000003;
        b7 b7Var = this.f19342b;
        return iHashCode ^ (b7Var == null ? 0 : b7Var.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f19341a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f19342b) + "}";
    }
}
