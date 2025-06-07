package com.meta.analytics.dsp.uinode;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1244cN {
    public final Map<String, C1256ca> A00;
    public final Set<C1256ca> A01;

    public C1244cN() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1256ca> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1256ca> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1256ca c1256ca : this.A01) {
            this.A00.put(c1256ca.A04, c1256ca);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1256ca c1256ca) {
        if (this.A01.add(c1256ca)) {
            this.A00.remove(c1256ca.A04);
            return true;
        }
        return false;
    }
}
