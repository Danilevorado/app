package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class le0 {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f11522a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f11523b = "0";

    public final synchronized String a() {
        String string;
        string = this.f11522a.toString();
        this.f11522a = this.f11522a.add(BigInteger.ONE);
        this.f11523b = string;
        return string;
    }

    public final synchronized String b() {
        return this.f11523b;
    }
}
