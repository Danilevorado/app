package com.onesignal;

import com.onesignal.e3;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22093a = false;

    k1() {
    }

    abstract String a();

    abstract void b(e3.f0 f0Var);

    boolean c() {
        return this.f22093a;
    }

    void d(boolean z10) {
        this.f22093a = z10;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + a() + " prompted=" + this.f22093a + '}';
    }
}
