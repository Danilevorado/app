package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f7569a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7570b = new AtomicBoolean(false);

    public e(d dVar) {
        this.f7569a = dVar;
    }

    public final k a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f7570b) {
            if (this.f7570b.get()) {
                constructorA = null;
            } else {
                try {
                    constructorA = this.f7569a.a();
                } catch (ClassNotFoundException unused) {
                    this.f7570b.set(true);
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating extension", e5);
                }
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (k) constructorA.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }
}
