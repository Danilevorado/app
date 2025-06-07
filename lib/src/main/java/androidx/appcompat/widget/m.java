package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f1294a;

    /* renamed from: b, reason: collision with root package name */
    private final h0.a f1295b;

    m(EditText editText) {
        this.f1294a = editText;
        this.f1295b = new h0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f1295b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1294a.getContext().obtainStyledAttributes(attributeSet, f.j.f23455g0, i10, 0);
        try {
            int i11 = f.j.f23525u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1295b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f1295b.c(z10);
    }
}
