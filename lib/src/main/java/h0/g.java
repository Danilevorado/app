package h0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: m, reason: collision with root package name */
    private final EditText f23983m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23984n;

    /* renamed from: o, reason: collision with root package name */
    private e.AbstractC0042e f23985o;

    /* renamed from: p, reason: collision with root package name */
    private int f23986p = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private int f23987q = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23988r = true;

    private static class a extends e.AbstractC0042e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f23989a;

        a(EditText editText) {
            this.f23989a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0042e
        public void b() {
            super.b();
            g.b((EditText) this.f23989a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f23983m = editText;
        this.f23984n = z10;
    }

    private e.AbstractC0042e a() {
        if (this.f23985o == null) {
            this.f23985o = new a(this.f23983m);
        }
        return this.f23985o;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f23988r && (this.f23984n || androidx.emoji2.text.e.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f23988r != z10) {
            if (this.f23985o != null) {
                androidx.emoji2.text.e.b().t(this.f23985o);
            }
            this.f23988r = z10;
            if (z10) {
                b(this.f23983m, androidx.emoji2.text.e.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f23983m.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.e.b().r((Spannable) charSequence, i10, i10 + i12, this.f23986p, this.f23987q);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.b().s(a());
    }
}
