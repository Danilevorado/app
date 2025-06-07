package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
final class vb implements jb {

    /* renamed from: a, reason: collision with root package name */
    private File f16643a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f16644b;

    vb(Context context) {
        this.f16644b = context;
    }

    @Override // com.google.android.gms.internal.ads.jb
    public final File a() {
        if (this.f16643a == null) {
            this.f16643a = new File(this.f16644b.getCacheDir(), "volley");
        }
        return this.f16643a;
    }
}
