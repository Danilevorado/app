package a4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: m, reason: collision with root package name */
    Messenger f124m;

    /* renamed from: n, reason: collision with root package name */
    c f125n;

    public i(IBinder iBinder) {
        this.f124m = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f124m;
        return messenger != null ? messenger.getBinder() : this.f125n.asBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f124m;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f125n.o2(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f124m;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f125n.asBinder());
    }
}
