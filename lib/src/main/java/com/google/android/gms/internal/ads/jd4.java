package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
final class jd4 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f10443a;

    /* renamed from: b, reason: collision with root package name */
    private long f10444b;

    public jd4(long j10) {
    }

    public final void a() {
        this.f10443a = null;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f10443a == null) {
            this.f10443a = exc;
            this.f10444b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f10444b) {
            Exception exc2 = this.f10443a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f10443a;
            this.f10443a = null;
            throw exc3;
        }
    }
}
