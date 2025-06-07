package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class l implements DynamiteModule.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f5873a;

    public l(int i10, int i11) {
        this.f5873a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return this.f5873a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z10) {
        return 0;
    }
}
