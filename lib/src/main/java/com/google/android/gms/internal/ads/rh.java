package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rh extends ui {

    /* renamed from: j, reason: collision with root package name */
    private static final vi f14783j = new vi();

    /* renamed from: i, reason: collision with root package name */
    private final Context f14784i;

    public rh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, Context context) {
        super(dhVar, "gRiEqMdygJbXVwKGpJJS0XfYaGpCoNDcsHcIyHSZIcdpg+a2r1SI+bnO9R0NWRI0", "EBqSzSIe3Rjv1o1jIB+xCBngdhv60cOxeintd9wp68g=", xcVar, i10, 29);
        this.f14784i = context;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        this.f16345e.p0("E");
        AtomicReference atomicReferenceA = f14783j.a(this.f14784i.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                if (atomicReferenceA.get() == null) {
                    atomicReferenceA.set((String) this.f16346f.invoke(null, this.f14784i));
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f16345e) {
            this.f16345e.p0(ke.a(str.getBytes(), true));
        }
    }
}
