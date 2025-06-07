package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public abstract class PC {
    public static final Map<String, WeakReference<PB>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static PB A01(C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5, int i10, P9 p92) throws JSONException {
        PB pb2 = new PB(c1073Yn, abstractC1176b5, c1073Yn.A01().A09(), i10);
        pb2.A0b(p92);
        pb2.A0X();
        A00.put(abstractC1176b5.A0S(), new WeakReference<>(pb2));
        return pb2;
    }

    public static PB A02(String str) {
        WeakReference<PB> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1176b5 abstractC1176b5, PB pb2) {
        A00.put(abstractC1176b5.A0S(), new WeakReference<>(pb2));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
