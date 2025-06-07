package com.onesignal;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
class i3 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private double f22065a;

    /* renamed from: b, reason: collision with root package name */
    private double f22066b;

    i3(double d10, double d11) {
        this.f22065a = d10;
        this.f22066b = d11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        return (float) ((Math.pow(2.718281828459045d, (-f5) / this.f22065a) * (-1.0d) * Math.cos(this.f22066b * f5)) + 1.0d);
    }
}
