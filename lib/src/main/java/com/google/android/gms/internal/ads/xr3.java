package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class xr3 extends wp3 {

    /* renamed from: p, reason: collision with root package name */
    public final int f17792p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17793q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f17794r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f17795s;

    public xr3(int i10, String str, IOException iOException, Map map, ib3 ib3Var, byte[] bArr) {
        super("Response code: " + i10, iOException, ib3Var, AdError.INTERNAL_ERROR_2004, 1);
        this.f17792p = i10;
        this.f17793q = str;
        this.f17794r = map;
        this.f17795s = bArr;
    }
}
