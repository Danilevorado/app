package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;

/* loaded from: classes.dex */
public final class p1 extends dj implements r1 {
    p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // k3.r1
    public final String c() {
        Parcel parcelW0 = w0(1, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // k3.r1
    public final String e() {
        Parcel parcelW0 = w0(2, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }
}
