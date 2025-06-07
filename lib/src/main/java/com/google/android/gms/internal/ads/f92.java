package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f92 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f8189a;

    /* renamed from: b, reason: collision with root package name */
    private final je0 f8190b;

    f92(Executor executor, je0 je0Var) {
        this.f8189a = executor;
        this.f8190b = je0Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return ((Boolean) k3.w.c().b(ir.f10079s2)).booleanValue() ? qa3.h(null) : qa3.l(this.f8190b.j(), new w23() { // from class: com.google.android.gms.internal.ads.d92
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new je2() { // from class: com.google.android.gms.internal.ads.e92
                    @Override // com.google.android.gms.internal.ads.je2
                    public final void c(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f8189a);
    }
}
