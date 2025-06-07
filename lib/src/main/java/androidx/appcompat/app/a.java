package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0007a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f476a;

        public C0007a(int i10, int i11) {
            super(i10, i11);
            this.f476a = 8388627;
        }

        public C0007a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f476a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23519t);
            this.f476a = typedArrayObtainStyledAttributes.getInt(f.j.f23524u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0007a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f476a = 0;
        }

        public C0007a(C0007a c0007a) {
            super((ViewGroup.MarginLayoutParams) c0007a);
            this.f476a = 0;
            this.f476a = c0007a.f476a;
        }
    }

    public interface b {
        void a(boolean z10);
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public void l(Configuration configuration) {
    }

    void m() {
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z10);

    public abstract void r(boolean z10);

    public abstract void s(CharSequence charSequence);

    public androidx.appcompat.view.b t(b.a aVar) {
        return null;
    }
}
