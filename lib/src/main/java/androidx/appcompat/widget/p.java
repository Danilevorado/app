package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class p extends ImageButton {

    /* renamed from: m, reason: collision with root package name */
    private final e f1333m;

    /* renamed from: n, reason: collision with root package name */
    private final q f1334n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1335o;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23313z);
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1335o = false;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f1333m = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1334n = qVar;
        qVar.g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1333m;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1334n;
        if (qVar != null) {
            qVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1333m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1333m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        q qVar = this.f1334n;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        q qVar = this.f1334n;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1334n.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1333m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1333m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f1334n;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f1334n;
        if (qVar != null && drawable != null && !this.f1335o) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f1334n;
        if (qVar2 != null) {
            qVar2.c();
            if (this.f1335o) {
                return;
            }
            this.f1334n.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1335o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1334n.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f1334n;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1333m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1333m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f1334n;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1334n;
        if (qVar != null) {
            qVar.k(mode);
        }
    }
}
