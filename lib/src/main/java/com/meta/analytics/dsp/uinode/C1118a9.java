package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1118a9 implements InterfaceC02802g {
    private C02812h A00(InterfaceC02792f interfaceC02792f) {
        return (C02812h) interfaceC02792f.A6J();
    }

    public final void A01(InterfaceC02792f interfaceC02792f) {
        if (!interfaceC02792f.A8G()) {
            interfaceC02792f.AGE(0, 0, 0, 0);
            return;
        }
        float fA7M = A7M(interfaceC02792f);
        float fA7m = A7m(interfaceC02792f);
        float elevation = C02832j.A00(fA7M, fA7m, interfaceC02792f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C02832j.A01(fA7M, fA7m, interfaceC02792f.A7l());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC02792f.AGE(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final ColorStateList A66(InterfaceC02792f interfaceC02792f) {
        return A00(interfaceC02792f).A05();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A6t(InterfaceC02792f interfaceC02792f) {
        return interfaceC02792f.A6K().getElevation();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7M(InterfaceC02792f interfaceC02792f) {
        return A00(interfaceC02792f).A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7R(InterfaceC02792f interfaceC02792f) {
        return A7m(interfaceC02792f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7S(InterfaceC02792f interfaceC02792f) {
        return A7m(interfaceC02792f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7m(InterfaceC02792f interfaceC02792f) {
        return A00(interfaceC02792f).A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void A8r() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void A8s(InterfaceC02792f interfaceC02792f, Context context, ColorStateList colorStateList, float f5, float f10, float f11) {
        C02812h background = new C02812h(colorStateList, f5);
        interfaceC02792f.AFu(background);
        View view = interfaceC02792f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f10);
        AG6(interfaceC02792f, f11);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AB7(InterfaceC02792f interfaceC02792f) {
        AG6(interfaceC02792f, A7M(interfaceC02792f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void ACk(InterfaceC02792f interfaceC02792f) {
        AG6(interfaceC02792f, A7M(interfaceC02792f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AFt(InterfaceC02792f interfaceC02792f, ColorStateList colorStateList) {
        A00(interfaceC02792f).A08(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AFz(InterfaceC02792f interfaceC02792f, float f5) {
        interfaceC02792f.A6K().setElevation(f5);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AG6(InterfaceC02792f interfaceC02792f, float f5) {
        A00(interfaceC02792f).A07(f5, interfaceC02792f.A8G(), interfaceC02792f.A7l());
        A01(interfaceC02792f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AGC(InterfaceC02792f interfaceC02792f, float f5) {
        A00(interfaceC02792f).A06(f5);
    }
}
