package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f20907a;

    /* renamed from: b, reason: collision with root package name */
    final b f20908b;

    /* renamed from: c, reason: collision with root package name */
    final b f20909c;

    /* renamed from: d, reason: collision with root package name */
    final b f20910d;

    /* renamed from: e, reason: collision with root package name */
    final b f20911e;

    /* renamed from: f, reason: collision with root package name */
    final b f20912f;

    /* renamed from: g, reason: collision with root package name */
    final b f20913g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f20914h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p5.b.c(context, c5.b.f4692t, h.class.getCanonicalName()), c5.k.H2);
        this.f20907a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.K2, 0));
        this.f20913g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.I2, 0));
        this.f20908b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.J2, 0));
        this.f20909c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.L2, 0));
        ColorStateList colorStateListA = p5.c.a(context, typedArrayObtainStyledAttributes, c5.k.M2);
        this.f20910d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.O2, 0));
        this.f20911e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.N2, 0));
        this.f20912f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c5.k.P2, 0));
        Paint paint = new Paint();
        this.f20914h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
