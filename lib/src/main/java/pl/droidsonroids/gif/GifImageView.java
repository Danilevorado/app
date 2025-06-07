package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import pl.droidsonroids.gif.f;

/* loaded from: classes2.dex */
public class GifImageView extends ImageView {

    /* renamed from: m, reason: collision with root package name */
    private boolean f25969m;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(f.c(this, attributeSet, 0, 0));
    }

    private void a(f.a aVar) {
        this.f25969m = aVar.f26007a;
        int i10 = aVar.f26005c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f26006d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        eVar.a(getDrawable(), 0);
        eVar.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new e(super.onSaveInstanceState(), this.f25969m ? getDrawable() : null, this.f25969m ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (f.e(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f25969m = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (f.e(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (f.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
