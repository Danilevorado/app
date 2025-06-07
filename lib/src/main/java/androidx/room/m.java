package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.l;

/* loaded from: classes.dex */
public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        /* renamed from: androidx.room.m$a$a, reason: collision with other inner class name */
        private static class C0058a implements m {

            /* renamed from: n, reason: collision with root package name */
            public static m f3741n;

            /* renamed from: m, reason: collision with root package name */
            private IBinder f3742m;

            C0058a(IBinder iBinder) {
                this.f3742m = iBinder;
            }

            @Override // androidx.room.m
            public void L4(int i10, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    if (this.f3742m.transact(3, parcelObtain, null, 1) || a.w0() == null) {
                        return;
                    }
                    a.w0().L4(i10, strArr);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3742m;
            }

            @Override // androidx.room.m
            public int y3(l lVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (!this.f3742m.transact(1, parcelObtain, parcelObtain2, 0) && a.w0() != null) {
                        return a.w0().y3(lVar, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static m C(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new C0058a(iBinder) : (m) iInterfaceQueryLocalInterface;
        }

        public static m w0() {
            return C0058a.f3741n;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int iY3 = y3(l.a.C(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iY3);
                return true;
            }
            if (i10 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                q5(l.a.C(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                L4(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    void L4(int i10, String[] strArr);

    void q5(l lVar, int i10);

    int y3(l lVar, String str);
}
