package s4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        o oVar = null;
        IBinder iBinderS = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderS2 = null;
        IBinder iBinderS3 = null;
        int iT = 1;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    oVar = (o) f4.b.e(parcel, iR, o.CREATOR);
                    break;
                case 3:
                    iBinderS = f4.b.s(parcel, iR);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) f4.b.e(parcel, iR, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderS2 = f4.b.s(parcel, iR);
                    break;
                case 6:
                    iBinderS3 = f4.b.s(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new q(iT, oVar, iBinderS, pendingIntent, iBinderS2, iBinderS3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
