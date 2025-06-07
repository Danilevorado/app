package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0079a extends Binder implements a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0080a implements a {

            /* renamed from: m, reason: collision with root package name */
            private IBinder f4626m;

            C0080a(IBinder iBinder) {
                this.f4626m = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4626m;
            }
        }

        public AbstractBinderC0079a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0080a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            F5(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void F5(int i10, Bundle bundle);
}
