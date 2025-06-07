package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public class HD implements InterfaceC1252cV {
    public final /* synthetic */ C1251cU A00;

    public HD(C1251cU c1251cU) {
        this.A00 = c1251cU;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1252cV
    public final void AD2() {
        ArrayList arrayList;
        synchronized (this.A00.A05) {
            arrayList = new ArrayList(this.A00.A05.size());
            for (Runnable runnable : this.A00.A05.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A05.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.A00.AD2();
    }
}
