package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1310a;

    /* renamed from: b, reason: collision with root package name */
    private final h0.f f1311b;

    n(TextView textView) {
        this.f1310a = textView;
        this.f1311b = new h0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1311b.a(inputFilterArr);
    }

    void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1310a.getContext().obtainStyledAttributes(attributeSet, f.j.f23455g0, i10, 0);
        try {
            int i11 = f.j.f23525u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void c(boolean z10) {
        this.f1311b.b(z10);
    }

    void d(boolean z10) {
        this.f1311b.c(z10);
    }
}
