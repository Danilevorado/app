package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    private final String f8199a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8200b;

    public fa(String str, String str2) {
        this.f8199a = str;
        this.f8200b = str2;
    }

    public final String a() {
        return this.f8199a;
    }

    public final String b() {
        return this.f8200b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fa.class == obj.getClass()) {
            fa faVar = (fa) obj;
            if (TextUtils.equals(this.f8199a, faVar.f8199a) && TextUtils.equals(this.f8200b, faVar.f8200b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8199a.hashCode() * 31) + this.f8200b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f8199a + ",value=" + this.f8200b + "]";
    }
}
