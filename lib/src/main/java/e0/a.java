package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: m, reason: collision with root package name */
    private final Parcelable f23006m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f23005n = new C0122a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: e0.a$a, reason: collision with other inner class name */
    class C0122a extends a {
        C0122a() {
            super((C0122a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f23005n;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f23006m = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f23006m = parcelable == null ? f23005n : parcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f23006m = parcelable == f23005n ? null : parcelable;
    }

    /* synthetic */ a(C0122a c0122a) {
        this();
    }

    public final Parcelable a() {
        return this.f23006m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f23006m, i10);
    }
}
