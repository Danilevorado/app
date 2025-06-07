package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1115a6<K, V> extends AbstractC02982y<K, V> {
    public final /* synthetic */ C1114a5 A00;

    public C1115a6(C1114a5 c1114a5) {
        this.A00 = c1114a5;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final Object A0B(int i10, int i11) {
        return this.A00.A02[(i10 << 1) + i11];
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final V A0C(int i10, V value) {
        return this.A00.A0C(i10, value);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final void A0E(int i10) {
        this.A00.A0A(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02982y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
