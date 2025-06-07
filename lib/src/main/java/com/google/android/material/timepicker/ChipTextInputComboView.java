package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import c5.f;
import c5.h;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: m, reason: collision with root package name */
    private final Chip f21274m;

    /* renamed from: n, reason: collision with root package name */
    private final TextInputLayout f21275n;

    /* renamed from: o, reason: collision with root package name */
    private final EditText f21276o;

    /* renamed from: p, reason: collision with root package name */
    private TextWatcher f21277p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f21278q;

    private class b extends k {
        private b() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f21274m.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f21274m.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f4772g, (ViewGroup) this, false);
        this.f21274m = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f4773h, (ViewGroup) this, false);
        this.f21275n = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f21276o = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f21277p = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f21278q = (TextView) findViewById(f.f4750m);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f21276o.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f21274m.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f21274m.setChecked(z10);
        this.f21276o.setVisibility(z10 ? 0 : 4);
        this.f21274m.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            n.h(this.f21276o);
            if (TextUtils.isEmpty(this.f21276o.getText())) {
                return;
            }
            EditText editText = this.f21276o;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21274m.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f21274m.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f21274m.toggle();
    }
}
