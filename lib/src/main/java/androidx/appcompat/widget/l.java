package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class l extends EditText implements androidx.core.view.t, androidx.core.widget.k {

    /* renamed from: m, reason: collision with root package name */
    private final e f1276m;

    /* renamed from: n, reason: collision with root package name */
    private final c0 f1277n;

    /* renamed from: o, reason: collision with root package name */
    private final b0 f1278o;

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.widget.j f1279p;

    /* renamed from: q, reason: collision with root package name */
    private final m f1280q;

    /* renamed from: r, reason: collision with root package name */
    private a f1281r;

    class a {
        a() {
        }

        public TextClassifier a() {
            return l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            l.super.setTextClassifier(textClassifier);
        }
    }

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23312y);
    }

    public l(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f1276m = eVar;
        eVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f1277n = c0Var;
        c0Var.m(attributeSet, i10);
        c0Var.b();
        this.f1278o = new b0(this);
        this.f1279p = new androidx.core.widget.j();
        m mVar = new m(this);
        this.f1280q = mVar;
        mVar.c(attributeSet, i10);
        d(mVar);
    }

    private a getSuperCaller() {
        if (this.f1281r == null) {
            this.f1281r = new a();
        }
        return this.f1281r;
    }

    @Override // androidx.core.view.t
    public androidx.core.view.c a(androidx.core.view.c cVar) {
        return this.f1279p.a(this, cVar);
    }

    void d(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = mVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1276m;
        if (eVar != null) {
            eVar.b();
        }
        c0 c0Var = this.f1277n;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1276m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1276m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1277n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1277n.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        return (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1278o) == null) ? getSuperCaller().a() : b0Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1277n.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrE = androidx.core.view.w.E(this)) != null) {
            c0.a.d(editorInfo, strArrE);
            inputConnectionA = c0.c.c(this, inputConnectionA, editorInfo);
        }
        return this.f1280q.d(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (x.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1276m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1276m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1277n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1277n;
        if (c0Var != null) {
            c0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1280q.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1280q.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1276m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1276m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1277n.w(colorStateList);
        this.f1277n.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1277n.x(mode);
        this.f1277n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f1277n;
        if (c0Var != null) {
            c0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1278o) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b0Var.b(textClassifier);
        }
    }
}
