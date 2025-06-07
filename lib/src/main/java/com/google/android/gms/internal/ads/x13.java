package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class x13 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final b5.j f17344m;

    x13() {
        this.f17344m = null;
    }

    public x13(b5.j jVar) {
        this.f17344m = jVar;
    }

    protected abstract void a();

    final b5.j b() {
        return this.f17344m;
    }

    public final void c(Exception exc) {
        b5.j jVar = this.f17344m;
        if (jVar != null) {
            jVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e5) {
            c(e5);
        }
    }
}
