package c7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0086a();

    /* renamed from: m, reason: collision with root package name */
    private long f5042m;

    /* renamed from: n, reason: collision with root package name */
    private long f5043n;

    /* renamed from: o, reason: collision with root package name */
    private long f5044o;

    /* renamed from: p, reason: collision with root package name */
    private long f5045p;

    /* renamed from: q, reason: collision with root package name */
    private long f5046q;

    /* renamed from: r, reason: collision with root package name */
    private long f5047r;

    /* renamed from: s, reason: collision with root package name */
    private String f5048s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f5049t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f5050u;

    /* renamed from: v, reason: collision with root package name */
    private String f5051v;

    /* renamed from: w, reason: collision with root package name */
    private String f5052w;

    /* renamed from: x, reason: collision with root package name */
    private String f5053x;

    /* renamed from: y, reason: collision with root package name */
    private String f5054y;

    /* renamed from: z, reason: collision with root package name */
    private int f5055z;

    /* renamed from: c7.a$a, reason: collision with other inner class name */
    static class C0086a implements Parcelable.Creator {
        C0086a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a() {
    }

    protected a(Parcel parcel) {
        this.f5042m = parcel.readLong();
        this.f5043n = parcel.readLong();
        this.f5044o = parcel.readLong();
        this.f5045p = parcel.readLong();
        this.f5046q = parcel.readLong();
        this.f5047r = parcel.readLong();
        this.f5048s = parcel.readString();
        this.f5049t = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5050u = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5051v = parcel.readString();
        this.f5052w = parcel.readString();
        this.f5053x = parcel.readString();
        this.f5054y = parcel.readString();
        this.f5055z = parcel.readInt();
    }

    public void A(String str) {
        this.f5048s = str;
    }

    public void B(String str) {
        this.f5051v = str;
    }

    public void C(long j10) {
        this.f5043n = j10;
    }

    public void D(Uri uri) {
        this.f5050u = uri;
    }

    public void E(Uri uri) {
        this.f5049t = uri;
    }

    public void F(long j10) {
        this.f5047r = j10;
    }

    public long a() {
        return this.f5044o;
    }

    public long b() {
        return this.f5042m;
    }

    public int c() {
        return this.f5055z;
    }

    public String d() {
        return this.f5052w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f5048s;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof a) && this.f5049t.equals(((a) obj).f5049t));
    }

    public String f() {
        return this.f5051v;
    }

    public Uri g() {
        return this.f5050u;
    }

    public Uri h() {
        return this.f5049t;
    }

    public int hashCode() {
        return this.f5051v.hashCode();
    }

    public void j(String str) {
        this.f5053x = str;
    }

    public void m(String str) {
        this.f5054y = str;
    }

    public void r(long j10) {
        this.f5045p = j10;
    }

    public void v(long j10) {
        this.f5044o = j10;
    }

    public void w(long j10) {
        this.f5046q = j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5042m);
        parcel.writeLong(this.f5043n);
        parcel.writeLong(this.f5044o);
        parcel.writeLong(this.f5045p);
        parcel.writeLong(this.f5046q);
        parcel.writeLong(this.f5047r);
        parcel.writeString(this.f5048s);
        parcel.writeParcelable(this.f5049t, i10);
        parcel.writeParcelable(this.f5050u, i10);
        parcel.writeString(this.f5051v);
        parcel.writeString(this.f5052w);
        parcel.writeString(this.f5053x);
        parcel.writeString(this.f5054y);
        parcel.writeInt(this.f5055z);
    }

    public void x(long j10) {
        this.f5042m = j10;
    }

    public void y(int i10) {
        this.f5055z = i10;
    }

    public void z(String str) {
        this.f5052w = str;
    }
}
