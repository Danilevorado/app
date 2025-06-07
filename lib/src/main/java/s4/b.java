package s4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends f4.a implements c4.f {

    /* renamed from: m, reason: collision with root package name */
    private final Status f26882m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f26881n = new b(Status.f5593r);
    public static final Parcelable.Creator<b> CREATOR = new c();

    public b(Status status) {
        this.f26882m = status;
    }

    @Override // c4.f
    public final Status e() {
        return this.f26882m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 1, this.f26882m, i10, false);
        f4.c.b(parcel, iA);
    }
}
