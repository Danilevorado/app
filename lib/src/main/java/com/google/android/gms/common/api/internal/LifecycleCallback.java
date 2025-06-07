package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: m, reason: collision with root package name */
    protected final d4.f f5639m;

    protected LifecycleCallback(d4.f fVar) {
        this.f5639m = fVar;
    }

    public static d4.f c(Activity activity) {
        return d(new d4.e(activity));
    }

    protected static d4.f d(d4.e eVar) {
        if (eVar.d()) {
            return d4.m0.N1(eVar.b());
        }
        if (eVar.c()) {
            return d4.k0.f(eVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static d4.f getChimeraLifecycleFragmentImpl(d4.e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityE = this.f5639m.e();
        e4.p.l(activityE);
        return activityE;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
