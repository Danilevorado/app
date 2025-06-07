package s4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q extends f4.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: m, reason: collision with root package name */
    final int f26904m;

    /* renamed from: n, reason: collision with root package name */
    final o f26905n;

    /* renamed from: o, reason: collision with root package name */
    final v4.k f26906o;

    /* renamed from: p, reason: collision with root package name */
    final PendingIntent f26907p;

    /* renamed from: q, reason: collision with root package name */
    final v4.h f26908q;

    /* renamed from: r, reason: collision with root package name */
    final g f26909r;

    q(int i10, o oVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f26904m = i10;
        this.f26905n = oVar;
        g eVar = null;
        this.f26906o = iBinder == null ? null : v4.j.w0(iBinder);
        this.f26907p = pendingIntent;
        this.f26908q = iBinder2 == null ? null : v4.g.w0(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            eVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new e(iBinder3);
        }
        this.f26909r = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, v4.k] */
    public static q f(v4.k kVar, g gVar) {
        if (gVar == null) {
            gVar = null;
        }
        return new q(2, null, kVar, null, null, gVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f26904m);
        f4.c.p(parcel, 2, this.f26905n, i10, false);
        v4.k kVar = this.f26906o;
        f4.c.j(parcel, 3, kVar == null ? null : kVar.asBinder(), false);
        f4.c.p(parcel, 4, this.f26907p, i10, false);
        v4.h hVar = this.f26908q;
        f4.c.j(parcel, 5, hVar == null ? null : hVar.asBinder(), false);
        g gVar = this.f26909r;
        f4.c.j(parcel, 6, gVar != null ? gVar.asBinder() : null, false);
        f4.c.b(parcel, iA);
    }
}
