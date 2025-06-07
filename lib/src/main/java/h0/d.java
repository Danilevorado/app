package h0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f23972a;

    /* renamed from: b, reason: collision with root package name */
    private e.AbstractC0042e f23973b;

    private static class a extends e.AbstractC0042e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f23974a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f23975b;

        a(TextView textView, d dVar) {
            this.f23974a = new WeakReference(textView);
            this.f23975b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0042e
        public void b() {
            CharSequence text;
            CharSequence charSequenceO;
            super.b();
            TextView textView = (TextView) this.f23974a.get();
            if (c(textView, (InputFilter) this.f23975b.get()) && textView.isAttachedToWindow() && text != (charSequenceO = androidx.emoji2.text.e.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceO);
                int selectionEnd = Selection.getSelectionEnd(charSequenceO);
                textView.setText(charSequenceO);
                if (charSequenceO instanceof Spannable) {
                    d.b((Spannable) charSequenceO, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f23972a = textView;
    }

    private e.AbstractC0042e a() {
        if (this.f23973b == null) {
            this.f23973b = new a(this.f23972a, this);
        }
        return this.f23973b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f23972a.isInEditMode()) {
            return charSequence;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            boolean z10 = true;
            if (iD == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f23972a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.e.b().p(charSequence, 0, charSequence.length());
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.b().s(a());
        return charSequence;
    }
}
