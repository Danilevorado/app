package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f3989d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f3990e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3991f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3992g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3993h;

    /* renamed from: i, reason: collision with root package name */
    private int f3994i;

    /* renamed from: j, reason: collision with root package name */
    private int f3995j;

    /* renamed from: k, reason: collision with root package name */
    private int f3996k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.a(), new q.a(), new q.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, q.a aVar, q.a aVar2, q.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3989d = new SparseIntArray();
        this.f3994i = -1;
        this.f3996k = -1;
        this.f3990e = parcel;
        this.f3991f = i10;
        this.f3992g = i11;
        this.f3995j = i10;
        this.f3993h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f3990e.writeInt(-1);
        } else {
            this.f3990e.writeInt(bArr.length);
            this.f3990e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3990e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f3990e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f3990e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f3990e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f3994i;
        if (i10 >= 0) {
            int i11 = this.f3989d.get(i10);
            int iDataPosition = this.f3990e.dataPosition();
            this.f3990e.setDataPosition(i11);
            this.f3990e.writeInt(iDataPosition - i11);
            this.f3990e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f3990e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f3995j;
        if (i10 == this.f3991f) {
            i10 = this.f3992g;
        }
        return new b(parcel, iDataPosition, i10, this.f3993h + "  ", this.f3986a, this.f3987b, this.f3988c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f3990e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f3990e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f3990e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3990e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f3995j < this.f3992g) {
            int i11 = this.f3996k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f3990e.setDataPosition(this.f3995j);
            int i12 = this.f3990e.readInt();
            this.f3996k = this.f3990e.readInt();
            this.f3995j += i12;
        }
        return this.f3996k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f3990e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f3990e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f3990e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f3994i = i10;
        this.f3989d.put(i10, this.f3990e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f3990e.writeInt(z10 ? 1 : 0);
    }
}
