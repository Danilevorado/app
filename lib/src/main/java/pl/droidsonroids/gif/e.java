package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    final long[][] f26003m;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f26003m = new long[parcel.readInt()][];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f26003m;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    e(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f26003m = new long[drawableArr.length][];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof b) {
                this.f26003m[i10] = ((b) drawable).f25977s.j();
            } else {
                this.f26003m[i10] = null;
            }
        }
    }

    void a(Drawable drawable, int i10) {
        if (this.f26003m[i10] == null || !(drawable instanceof b)) {
            return;
        }
        ((b) drawable).j(r3.f25977s.t(r0[i10], r3.f25976r));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f26003m.length);
        for (long[] jArr : this.f26003m) {
            parcel.writeLongArray(jArr);
        }
    }
}
