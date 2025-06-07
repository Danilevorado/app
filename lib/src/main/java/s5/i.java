package s5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f26958a;

    public i(float f5) {
        this.f26958a = f5;
    }

    @Override // s5.c
    public float a(RectF rectF) {
        return this.f26958a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f26958a == ((i) obj).f26958a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f26958a)});
    }
}
