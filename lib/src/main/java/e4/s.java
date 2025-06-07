package e4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s extends f4.a {
    public static final Parcelable.Creator<s> CREATOR = new x();

    /* renamed from: m, reason: collision with root package name */
    private final int f23226m;

    /* renamed from: n, reason: collision with root package name */
    private List f23227n;

    public s(int i10, List list) {
        this.f23226m = i10;
        this.f23227n = list;
    }

    public final int f() {
        return this.f23226m;
    }

    public final List h() {
        return this.f23227n;
    }

    public final void v(n nVar) {
        if (this.f23227n == null) {
            this.f23227n = new ArrayList();
        }
        this.f23227n.add(nVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f23226m);
        f4.c.u(parcel, 2, this.f23227n, false);
        f4.c.b(parcel, iA);
    }
}
