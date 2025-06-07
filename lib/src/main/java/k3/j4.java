package k3;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j4 extends f4.a {
    public static final Parcelable.Creator<j4> CREATOR = new k4();

    /* renamed from: m, reason: collision with root package name */
    public final int f24677m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24678n;

    /* renamed from: o, reason: collision with root package name */
    public final String f24679o;

    /* renamed from: p, reason: collision with root package name */
    public final long f24680p;

    public j4(int i10, int i11, String str, long j10) {
        this.f24677m = i10;
        this.f24678n = i11;
        this.f24679o = str;
        this.f24680p = j10;
    }

    public static j4 f(JSONObject jSONObject) {
        return new j4(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f24677m);
        f4.c.k(parcel, 2, this.f24678n);
        f4.c.q(parcel, 3, this.f24679o, false);
        f4.c.n(parcel, 4, this.f24680p);
        f4.c.b(parcel, iA);
    }
}
