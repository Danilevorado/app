package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class sg4 {

    /* renamed from: a, reason: collision with root package name */
    private final r f15244a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f15245b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f15246c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Map f15247d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private s43 f15248e;

    public sg4(r rVar) {
        this.f15244a = rVar;
    }

    public final void a(s43 s43Var) {
        if (s43Var != this.f15248e) {
            this.f15248e = s43Var;
            this.f15245b.clear();
            this.f15247d.clear();
        }
    }
}
