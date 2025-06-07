package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class dc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f7257a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f7258b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f7259c;

    /* renamed from: d, reason: collision with root package name */
    private final m3.p1 f7260d;

    public dc2(bb3 bb3Var, do2 do2Var, PackageInfo packageInfo, m3.p1 p1Var) {
        this.f7257a = bb3Var;
        this.f7258b = do2Var;
        this.f7259c = packageInfo;
        this.f7260d = p1Var;
    }

    public static /* synthetic */ ec2 c(final dc2 dc2Var) {
        final ArrayList arrayList = dc2Var.f7258b.f7448g;
        return arrayList == null ? new ec2() { // from class: com.google.android.gms.internal.ads.yb2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
            }
        } : arrayList.isEmpty() ? new ec2() { // from class: com.google.android.gms.internal.ads.ac2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new ec2() { // from class: com.google.android.gms.internal.ads.bc2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
                this.f6425a.d(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f7257a.g(new Callable() { // from class: com.google.android.gms.internal.ads.cc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dc2.c(this.f6873a);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void d(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dc2.d(java.util.ArrayList, android.os.Bundle):void");
    }
}
