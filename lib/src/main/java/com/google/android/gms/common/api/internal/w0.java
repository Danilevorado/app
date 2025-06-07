package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f5820c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    final Set f5821a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private final v0 f5822b = new v0(this);

    final void a(BasePendingResult basePendingResult) {
        this.f5821a.add(basePendingResult);
        basePendingResult.o(this.f5822b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f5821a.toArray(new BasePendingResult[0])) {
            basePendingResult.o(null);
            if (basePendingResult.n()) {
                this.f5821a.remove(basePendingResult);
            }
        }
    }
}
