package s5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f26915a;

    public a(float f5) {
        this.f26915a = f5;
    }

    @Override // s5.c
    public float a(RectF rectF) {
        return this.f26915a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f26915a == ((a) obj).f26915a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f26915a)});
    }
}
