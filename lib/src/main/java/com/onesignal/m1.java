package com.onesignal;

import com.onesignal.e3;

/* loaded from: classes.dex */
public class m1 extends k1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(e3.f0 f0Var, boolean z10) {
        f0Var.a(z10 ? e3.k0.PERMISSION_GRANTED : e3.k0.PERMISSION_DENIED);
    }

    @Override // com.onesignal.k1
    String a() {
        return "push";
    }

    @Override // com.onesignal.k1
    void b(final e3.f0 f0Var) {
        e3.k1(true, new e3.l0() { // from class: com.onesignal.l1
            @Override // com.onesignal.e3.l0
            public final void a(boolean z10) {
                m1.f(f0Var, z10);
            }
        });
    }
}
