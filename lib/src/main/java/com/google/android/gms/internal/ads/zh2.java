package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zh2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f18594a;

    public zh2(bb3 bb3Var) {
        this.f18594a = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f18594a.g(new Callable() { // from class: com.google.android.gms.internal.ads.yh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) k3.w.c().b(ir.K);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) k3.w.c().b(ir.L)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, m3.k1.a(str2));
                        }
                    }
                }
                return new ai2(map);
            }
        });
    }
}
