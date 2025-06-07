package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class re2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f14754a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14755b;

    public re2(bb3 bb3Var, Context context) {
        this.f14754a = bb3Var;
        this.f14755b = context;
    }

    private static ResolveInfo d(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f14754a.g(new Callable() { // from class: com.google.android.gms.internal.ads.qe2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14290a.c();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.pe2 c() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.re2.c():com.google.android.gms.internal.ads.pe2");
    }
}
