package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class na0 extends f4.a {
    public static final Parcelable.Creator<na0> CREATOR = new oa0();

    /* renamed from: m, reason: collision with root package name */
    public final String f12555m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12556n;

    public na0(String str, int i10) {
        this.f12555m = str;
        this.f12556n = i10;
    }

    public static na0 f(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new na0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof na0)) {
            na0 na0Var = (na0) obj;
            if (e4.o.a(this.f12555m, na0Var.f12555m) && e4.o.a(Integer.valueOf(this.f12556n), Integer.valueOf(na0Var.f12556n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e4.o.b(this.f12555m, Integer.valueOf(this.f12556n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f12555m, false);
        f4.c.k(parcel, 3, this.f12556n);
        f4.c.b(parcel, iA);
    }
}
