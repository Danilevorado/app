package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.w;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f20901a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f20902b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f20903c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f20904d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20905e;

    /* renamed from: f, reason: collision with root package name */
    private final s5.k f20906f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, s5.k kVar, Rect rect) {
        androidx.core.util.h.c(rect.left);
        androidx.core.util.h.c(rect.top);
        androidx.core.util.h.c(rect.right);
        androidx.core.util.h.c(rect.bottom);
        this.f20901a = rect;
        this.f20902b = colorStateList2;
        this.f20903c = colorStateList;
        this.f20904d = colorStateList3;
        this.f20905e = i10;
        this.f20906f = kVar;
    }

    static b a(Context context, int i10) throws Resources.NotFoundException {
        androidx.core.util.h.a(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, c5.k.Q2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(c5.k.R2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c5.k.T2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c5.k.S2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c5.k.U2, 0));
        ColorStateList colorStateListA = p5.c.a(context, typedArrayObtainStyledAttributes, c5.k.V2);
        ColorStateList colorStateListA2 = p5.c.a(context, typedArrayObtainStyledAttributes, c5.k.f4821a3);
        ColorStateList colorStateListA3 = p5.c.a(context, typedArrayObtainStyledAttributes, c5.k.Y2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c5.k.Z2, 0);
        s5.k kVarM = s5.k.b(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.W2, 0), typedArrayObtainStyledAttributes.getResourceId(c5.k.X2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.f20901a.bottom;
    }

    int c() {
        return this.f20901a.top;
    }

    void d(TextView textView) {
        s5.g gVar = new s5.g();
        s5.g gVar2 = new s5.g();
        gVar.setShapeAppearanceModel(this.f20906f);
        gVar2.setShapeAppearanceModel(this.f20906f);
        gVar.V(this.f20903c);
        gVar.a0(this.f20905e, this.f20904d);
        textView.setTextColor(this.f20902b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f20902b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f20901a;
        w.s0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
