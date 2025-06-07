package x6;

import r6.m;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: c, reason: collision with root package name */
    private final float f28345c;

    a(float f5, float f10, float f11) {
        super(f5, f10);
        this.f28345c = f11;
    }

    boolean f(float f5, float f10, float f11) {
        if (Math.abs(f10 - d()) > f5 || Math.abs(f11 - c()) > f5) {
            return false;
        }
        float fAbs = Math.abs(f5 - this.f28345c);
        return fAbs <= 1.0f || fAbs <= this.f28345c;
    }

    a g(float f5, float f10, float f11) {
        return new a((c() + f10) / 2.0f, (d() + f5) / 2.0f, (this.f28345c + f11) / 2.0f);
    }
}
