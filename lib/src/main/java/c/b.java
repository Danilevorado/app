package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    final boolean f4627m = false;

    /* renamed from: n, reason: collision with root package name */
    final Handler f4628n = null;

    /* renamed from: o, reason: collision with root package name */
    c.a f4629o;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0081b extends a.AbstractBinderC0079a {
        BinderC0081b() {
        }

        @Override // c.a
        public void F5(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4628n;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final int f4631m;

        /* renamed from: n, reason: collision with root package name */
        final Bundle f4632n;

        c(int i10, Bundle bundle) {
            this.f4631m = i10;
            this.f4632n = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f4631m, this.f4632n);
        }
    }

    b(Parcel parcel) {
        this.f4629o = a.AbstractBinderC0079a.C(parcel.readStrongBinder());
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f4629o == null) {
                this.f4629o = new BinderC0081b();
            }
            parcel.writeStrongBinder(this.f4629o.asBinder());
        }
    }
}
