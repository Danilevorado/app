package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16245a;

    /* renamed from: b, reason: collision with root package name */
    public final w9 f16246b;

    /* renamed from: c, reason: collision with root package name */
    public final xa f16247c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16248d;

    private ua(xa xaVar) {
        this.f16248d = false;
        this.f16245a = null;
        this.f16246b = null;
        this.f16247c = xaVar;
    }

    private ua(Object obj, w9 w9Var) {
        this.f16248d = false;
        this.f16245a = obj;
        this.f16246b = w9Var;
        this.f16247c = null;
    }

    public static ua a(xa xaVar) {
        return new ua(xaVar);
    }

    public static ua b(Object obj, w9 w9Var) {
        return new ua(obj, w9Var);
    }

    public final boolean c() {
        return this.f16247c == null;
    }
}
