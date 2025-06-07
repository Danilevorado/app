package com.onesignal;

import com.onesignal.e3;

/* loaded from: classes.dex */
class q1 implements r1 {
    q1() {
    }

    @Override // com.onesignal.r1
    public void a(String str) {
        e3.a(e3.z.ERROR, str);
    }

    @Override // com.onesignal.r1
    public void b(String str) {
        e3.a(e3.z.WARN, str);
    }

    @Override // com.onesignal.r1
    public void c(String str) {
        e3.a(e3.z.VERBOSE, str);
    }

    @Override // com.onesignal.r1
    public void d(String str, Throwable th) {
        e3.b(e3.z.ERROR, str, th);
    }

    @Override // com.onesignal.r1
    public void e(String str) {
        e3.a(e3.z.INFO, str);
    }

    @Override // com.onesignal.r1
    public void f(String str) {
        e3.a(e3.z.DEBUG, str);
    }
}
