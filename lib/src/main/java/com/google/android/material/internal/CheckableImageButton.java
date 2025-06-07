package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.p;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class CheckableImageButton extends p implements Checkable {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f21002s = {R.attr.state_checked};

    /* renamed from: p, reason: collision with root package name */
    private boolean f21003p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21004q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21005r;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.V(CheckableImageButton.this.a());
            dVar.W(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends e0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        boolean f21007o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f21007o = parcel.readInt() == 1;
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21007o ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23313z);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21004q = true;
        this.f21005r = true;
        w.o0(this, new a());
    }

    public boolean a() {
        return this.f21004q;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f21003p;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f21003p) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f21002s;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f21007o);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f21007o = this.f21003p;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f21004q != z10) {
            this.f21004q = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f21004q || this.f21003p == z10) {
            return;
        }
        this.f21003p = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f21005r = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f21005r) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f21003p);
    }
}
