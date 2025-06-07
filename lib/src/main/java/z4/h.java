package z4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends f4.a implements c4.f {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: m, reason: collision with root package name */
    private final List f28874m;

    /* renamed from: n, reason: collision with root package name */
    private final String f28875n;

    public h(List list, String str) {
        this.f28874m = list;
        this.f28875n = str;
    }

    @Override // c4.f
    public final Status e() {
        return this.f28875n != null ? Status.f5593r : Status.f5597v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f28874m;
        int iA = f4.c.a(parcel);
        f4.c.s(parcel, 1, list, false);
        f4.c.q(parcel, 2, this.f28875n, false);
        f4.c.b(parcel, iA);
    }
}
