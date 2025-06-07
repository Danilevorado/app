package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1116a7 implements InterfaceC02802g {
    public final RectF A00 = new RectF();

    private C02832j A00(Context context, ColorStateList colorStateList, float f5, float f10, float f11) {
        return new C02832j(context.getResources(), colorStateList, f5, f10, f11);
    }

    private C02832j A01(InterfaceC02792f interfaceC02792f) {
        return (C02832j) interfaceC02792f.A6J();
    }

    public final void A02(InterfaceC02792f interfaceC02792f) {
        Rect rect = new Rect();
        A01(interfaceC02792f).A0K(rect);
        interfaceC02792f.AG7((int) Math.ceil(A7S(interfaceC02792f)), (int) Math.ceil(A7R(interfaceC02792f)));
        interfaceC02792f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final ColorStateList A66(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0F();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A6t(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7M(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7R(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7S(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0D();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final float A7m(InterfaceC02792f interfaceC02792f) {
        return A01(interfaceC02792f).A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public void A8r() {
        C02832j.A0G = new C1117a8(this);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void A8s(InterfaceC02792f interfaceC02792f, Context context, ColorStateList colorStateList, float f5, float f10, float f11) {
        C02832j c02832jA00 = A00(context, colorStateList, f5, f10, f11);
        c02832jA00.A0L(interfaceC02792f.A7l());
        interfaceC02792f.AFu(c02832jA00);
        A02(interfaceC02792f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AB7(InterfaceC02792f interfaceC02792f) {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void ACk(InterfaceC02792f interfaceC02792f) {
        A01(interfaceC02792f).A0L(interfaceC02792f.A7l());
        A02(interfaceC02792f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AFt(InterfaceC02792f interfaceC02792f, ColorStateList colorStateList) {
        A01(interfaceC02792f).A0J(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AFz(InterfaceC02792f interfaceC02792f, float f5) {
        A01(interfaceC02792f).A0I(f5);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AG6(InterfaceC02792f interfaceC02792f, float f5) {
        A01(interfaceC02792f).A0H(f5);
        A02(interfaceC02792f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02802g
    public final void AGC(InterfaceC02792f interfaceC02792f, float f5) {
        A01(interfaceC02792f).A0G(f5);
        A02(interfaceC02792f);
    }
}
