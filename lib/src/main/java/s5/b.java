package s5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f26916a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26917b;

    public b(float f5, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f26916a;
            f5 += ((b) cVar).f26917b;
        }
        this.f26916a = cVar;
        this.f26917b = f5;
    }

    @Override // s5.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f26916a.a(rectF) + this.f26917b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26916a.equals(bVar.f26916a) && this.f26917b == bVar.f26917b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26916a, Float.valueOf(this.f26917b)});
    }
}
