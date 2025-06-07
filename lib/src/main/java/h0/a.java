package h0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f23962a;

    /* renamed from: b, reason: collision with root package name */
    private int f23963b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f23964c = 0;

    /* renamed from: h0.a$a, reason: collision with other inner class name */
    private static class C0140a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f23965a;

        /* renamed from: b, reason: collision with root package name */
        private final g f23966b;

        C0140a(EditText editText, boolean z10) {
            this.f23965a = editText;
            g gVar = new g(editText, z10);
            this.f23966b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(h0.b.getInstance());
        }

        @Override // h0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // h0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f23965a, inputConnection, editorInfo);
        }

        @Override // h0.a.b
        void c(boolean z10) {
            this.f23966b.c(z10);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        androidx.core.util.h.g(editText, "editText cannot be null");
        this.f23962a = new C0140a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f23962a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f23962a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f23962a.c(z10);
    }
}
