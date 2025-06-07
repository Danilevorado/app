package z0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
class j implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private Rect f28702a;

    j() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f5, Rect rect, Rect rect2) {
        int i10 = rect.left + ((int) ((rect2.left - r0) * f5));
        int i11 = rect.top + ((int) ((rect2.top - r1) * f5));
        int i12 = rect.right + ((int) ((rect2.right - r2) * f5));
        int i13 = rect.bottom + ((int) ((rect2.bottom - r6) * f5));
        Rect rect3 = this.f28702a;
        if (rect3 == null) {
            return new Rect(i10, i11, i12, i13);
        }
        rect3.set(i10, i11, i12, i13);
        return this.f28702a;
    }
}
