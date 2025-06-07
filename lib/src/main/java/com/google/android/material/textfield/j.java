package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class j extends e {

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f21257e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.f f21258f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.g f21259g;

    class a extends com.google.android.material.internal.k {
        a() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j.this.f21223c.setChecked(!r1.g());
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            j.this.f21223c.setChecked(!r0.g());
            editText.removeTextChangedListener(j.this.f21257e);
            editText.addTextChangedListener(j.this.f21257e);
        }
    }

    class c implements TextInputLayout.g {

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ EditText f21263m;

            a(EditText editText) {
                this.f21263m = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f21263m.removeTextChangedListener(j.this.f21257e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = j.this.f21221a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(j.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            j.this.f21221a.U();
        }
    }

    j(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f21257e = new a();
        this.f21258f = new b();
        this.f21259g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f21221a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        TextInputLayout textInputLayout = this.f21221a;
        int i10 = this.f21224d;
        if (i10 == 0) {
            i10 = c5.e.f4731a;
        }
        textInputLayout.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f21221a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(c5.i.f4799p));
        this.f21221a.setEndIconVisible(true);
        this.f21221a.setEndIconCheckable(true);
        this.f21221a.setEndIconOnClickListener(new d());
        this.f21221a.g(this.f21258f);
        this.f21221a.h(this.f21259g);
        EditText editText = this.f21221a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
