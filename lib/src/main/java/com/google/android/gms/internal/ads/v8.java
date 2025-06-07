package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16626b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16627c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f16628d;

    public v8(int i10, String str, List list, byte[] bArr) {
        this.f16625a = i10;
        this.f16626b = str;
        this.f16627c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f16628d = bArr;
    }
}
