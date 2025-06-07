package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h82 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final ab3 f9056a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9057b;

    public h82(ab3 ab3Var, Executor executor) {
        this.f9056a = ab3Var;
        this.f9057b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.m(this.f9056a, new w93() { // from class: com.google.android.gms.internal.ads.g82
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                final String str = (String) obj;
                return qa3.h(new je2() { // from class: com.google.android.gms.internal.ads.f82
                    @Override // com.google.android.gms.internal.ads.je2
                    public final void c(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f9057b);
    }
}
