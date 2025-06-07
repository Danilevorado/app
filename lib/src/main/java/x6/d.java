package x6;

import r6.m;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: c, reason: collision with root package name */
    private final float f28357c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28358d;

    d(float f5, float f10, float f11) {
        this(f5, f10, f11, 1);
    }

    private d(float f5, float f10, float f11, int i10) {
        super(f5, f10);
        this.f28357c = f11;
        this.f28358d = i10;
    }

    boolean f(float f5, float f10, float f11) {
        if (Math.abs(f10 - d()) > f5 || Math.abs(f11 - c()) > f5) {
            return false;
        }
        float fAbs = Math.abs(f5 - this.f28357c);
        return fAbs <= 1.0f || fAbs <= this.f28357c;
    }

    d g(float f5, float f10, float f11) {
        int i10 = this.f28358d;
        int i11 = i10 + 1;
        float fC = (i10 * c()) + f10;
        float f12 = i11;
        return new d(fC / f12, ((this.f28358d * d()) + f5) / f12, ((this.f28358d * this.f28357c) + f11) / f12, i11);
    }

    int h() {
        return this.f28358d;
    }

    public float i() {
        return this.f28357c;
    }
}
