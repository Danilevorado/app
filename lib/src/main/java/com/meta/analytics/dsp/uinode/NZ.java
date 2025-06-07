package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C0778Na A00;
    public final /* synthetic */ InterfaceC0779Nb A01;

    public NZ(C0778Na c0778Na, InterfaceC0779Nb interfaceC0779Nb) {
        this.A00 = c0778Na;
        this.A01 = interfaceC0779Nb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
