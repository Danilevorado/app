package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: m, reason: collision with root package name */
    private final int f5569m;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f5569m = i10;
    }
}
