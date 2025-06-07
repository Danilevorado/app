package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b1 extends h1 {

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f18833m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private boolean f18834n;

    public static final Object p1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e5) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e5);
            throw e5;
        }
    }

    public final String L0(long j10) {
        return (String) p1(w0(j10), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final void h0(Bundle bundle) {
        synchronized (this.f18833m) {
            try {
                this.f18833m.set(bundle);
                this.f18834n = true;
            } finally {
                this.f18833m.notify();
            }
        }
    }

    public final Bundle w0(long j10) {
        Bundle bundle;
        synchronized (this.f18833m) {
            if (!this.f18834n) {
                try {
                    this.f18833m.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f18833m.get();
        }
        return bundle;
    }
}
